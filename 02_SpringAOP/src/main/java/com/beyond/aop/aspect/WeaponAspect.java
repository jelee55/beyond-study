package com.beyond.aop.aspect;

import com.beyond.aop.annotation.Repeat;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WeaponAspect {

    // Around 메소드 호출 이전, 이후, 예외 발생 등 모든 시점에 적용 가능한 어드바이스를 정의
    // @Around("execution(* com.beyond.aop.weapon.*.attack())")
    // @Around("execution(* com.beyond.aop.weapon.Weapon.attack()) && !bean(sword)")
//    @Around("execution(* com.beyond.aop.weapon.Weapon.attack()) && !@annotation(com.beyond.aop.annotation.NoLogging)")
//    public String attackAdvice(ProceedingJoinPoint joinPoint) {
//        String result = null;
//
//        try {
//            System.out.println(" 공격 준비중");
//
//            result = (String) joinPoint.proceed();
//
//            System.out.println(result);
//            System.out.println(" 공격 성공");
//
//        } catch (Throwable e) {
//            System.out.println(" 에러 발생");
//        }
//
//
//        return result;
//    }
    @Around("@annotation(com.beyond.aop.annotation.Repeat)")
    public String attackAdvice(ProceedingJoinPoint joinPoint) {
        String result = null;
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Repeat repeat = signature.getMethod().getAnnotation(Repeat.class);

//        System.out.println(repeat);
//        System.out.println(repeat.value());
//        System.out.println(repeat.count());

        try {
            System.out.println(" 공격 준비중");

            result = (String) joinPoint.proceed();
            for (int i = 0; i < repeat.count(); i++) {
                System.out.println(result);
            }
            System.out.println(" 공격 성공");

        } catch (Throwable e) {
            System.out.println(" 에러 발생");
        }


        return result;
    }
}
