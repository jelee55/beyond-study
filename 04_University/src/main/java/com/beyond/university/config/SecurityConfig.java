package com.beyond.university.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;

@Controller
@EnableWebSecurity
public class SecurityConfig {
    /*
        SecurityFilterChain
        다양한 SecurityFilter을 설정하는??
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // HttpSecurity 타입의 객체로 스프링 시큐리티의 대부분의 설정을 할 수 있음

        // CSRF(Cross-Site Request Forgeery)란?
        // - 공격자가 사용장의 브라우저를 악용하여 인증된 세션을 가진 사용자의 권한으로 악성 요청을 보내는 공격
        // - Spring Security는 기본적으로 CSRF 보호를 활성화하여 GET 요청 외의 POST, PUT, DELETE등의
        //   요청에서 CSRF 토큰을 검증

    //=====================================================================================//
        http
                // .csrf(AbstractHttpConfigurer::disable) // CSRF 비활성화
                .csrf(Customizer.withDefaults())// CSRF 기본 설정 사용
                .httpBasic(Customizer.withDefaults()) // HTTP Basic 인증을 활성화
        //============================================================================//
                // .formLogin(Customizer.withDefaults()) // 폼 로그인 활성화
                .formLogin(form ->
                        form
                                .loginPage("/login")
                                .usernameParameter("userId")
                                .passwordParameter("userPwd"))
                .logout(logout ->
                        logout
                                .logoutUrl("/logout")
                                .logoutSuccessUrl("/login?logout=true")
                                .invalidateHttpSession(true) // logout 하면 session 삭제 true
                                .deleteCookies("JSESSIONID") //  JSESSIONID(cookies)삭제
                )
                // 기억하기 기능 설정
                .rememberMe(rememberMe ->
                        rememberMe
                                .key("beyond") // 쿠키의 값을 암호화할 키 값
                                .tokenValiditySeconds(1209600) // 쿠키의 유효시간을 지정(초)(2주)
                )
                // 세션 관리 설정
                // 로그인 세션 1개만 유지
                .sessionManagement(session ->
                        session
                                .invalidSessionUrl("/login") // 세션이 만료되었을 때 이동할 URL
                                .maximumSessions(1) // 최대 세션 수
                                .expiredUrl("/login?expired=true") // 마지막 연결된 세션이 끊겼을 때 이동할 URL
                )
                //.authorizeHttpRequests(Customizer.withDefaults())
                // 접근 제어 설정
                .authorizeHttpRequests(authorizeRequests ->
                    authorizeRequests
                            // 정적 리소스 허용
                            .requestMatchers("/js/**", "/css/**","images/**").permitAll()
                            .requestMatchers("/login").permitAll() // 인증하지 않은 모든 유저 허용
                            .anyRequest().authenticated()   // 인증을 하면 허용
                );
    //=====================================================================================//


        return http.build();
    }


    // db랑 연결x 임시 데이터
    //    @Bean
    //    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
    //        // 인 메모리 방식 설정 (테스트 용도로 사용)
    //        UserDetails user = User.builder()
    //                .username("user")
    //                .password(passwordEncoder.encode("1234"))
    //                .roles("USER")
    //                .build();
    //
    //        UserDetails admin = User.builder()
    //                .username("admin")
    //                .password(passwordEncoder.encode("1234"))
    //                .roles("ADMIN")
    //                .build();
    //
    //        return new InMemoryUserDetailsManager(user, admin);
    //    }

    // passwordEncoder 설정 (BCrypt)
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
