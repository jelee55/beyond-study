package com.beyond.university.auth.controller;

import com.beyond.university.auth.model.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class AuthController {
    // @Autowired
    // private PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String login() {
        // 매번 랜덤 한 솔트 값을 가지고 암호화하기 때문에 매번 다른 값으로 암호화된다.
        // System.out.println(passwordEncoder.encode("1234"));
        // System.out.println(passwordEncoder.encode("5678"));

        // matches() 메소드를 사용하면 솔트 값을 땐 나머지 값과 원문을 비교한다.
        // System.out.println(passwordEncoder.matches("1234", "$2a$10$2lzgHsLWGMRlFSPw6P1RYemTLI1VCUi8HcWFSXe3IQtsLypxXQ/l6"));

        log.info("로그인 페이지 요청");

        return "auth/login";
    }

    @GetMapping("/accessDenied")
    public ModelAndView accessDenied(ModelAndView modelAndView) {

        log.info("권한 오류 페이지 요청");

        modelAndView.addObject("msg", "접근 권한이 없습니다.");
        modelAndView.addObject("location", "/");
        modelAndView.setViewName("common/msg");

        return modelAndView;
    }


    @GetMapping("/admin/info")
    public String adminInfo() {

        log.info("관리자 페이지 요청");

        return "admin/info";
    }


    // 컨트롤러에서 인증된 사용자 정보를 가져오는 방법
    @GetMapping("/user/info")
    // public String userInfo() {
    // 2. authentication 객체를 컨트롤러 메소드의 매개변수로 가져오는 방법
    // 3. @AuthenticationPrincipal 어노테이션을 사용하는 방법
    // public String userInfo(Authentication authentication) {
     public String userInfo(@AuthenticationPrincipal User loginUser ) {

        log.info("사용자 페이지 요청");

        // 1. SecurityContextHolder를 사용하는 방법
        // SecurityContext context = SecurityContextHolder.getContext(); // SecurityContextHolder 안에 SecurityContext
        // Authentication authentication = context.getAuthentication(); // SecurityContext안에 있는 Authentication 에 인증 주체가 담겨 잇음
        // User loginUser= (User) authentication.getPrincipal();

        System.out.println(loginUser);

        return "user/info";
    }

}
