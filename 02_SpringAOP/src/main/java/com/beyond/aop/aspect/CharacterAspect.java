package com.beyond.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
    Spring AOP
    스프링은 AspectJ의 어노테이션을 사용하여 애스펙트를 생성할 수 있음7

    Aspect란
    횡단 관심사를 분리하여 작성한 클래스 (어드바이스 + 포인트컷)
    
    Advice는 애스펙트가 해야 할 작업과 언제 그 작업을 수행해야 하는지를 정의하는 메소드
    언제 수행할지는 어노테이션으로 정의함
 */

@Aspect  // Aspect를 사용하려면 Bean을 등록해서 사용
@Component // config 파일에서  ComponentScan 을 통해 Component를 찾아서 Bean으로 등록해줌
public class CharacterAspect {
    /*
    포인트 커트 표현식
        - 스프링 AOP에서 포인터 커트는 Aspectj의 포인트 커트 표현식을 이용해서 정의
        - execution([접근제한자] 리턴타입 클래스이름.메소드이름([파라미터]))
            - 메소드 실행에 대한 표현식
            - * : 모든 값을 표현
            - .. : 0개 이상을 의미
        - args()
            - 대상 메소드에 전달되는 매개값을 어드바이스에 전달하기 위한 표현식
        - bean()
            - 어드바이스를 적용할 빈의 ID를 지정하는 표현식
        - @annotation()
            - 주어진 어노테이션을 갖는 조인 포인트에 어드바이스를 적용하기 위한 표현식
     */


    // Pointcut을 지정해서 중복 제거
    @Pointcut("execution(* com.beyond.aop.character.Character.quest(..)) && args(questName)" /*args을 통해 매개변수 가져올 수 있음*/)
    public void questPointCut(String questName){
    }


    // BeforeAdvice -> quest()가 실행되기 전에 수행
    // @Before("execution(* com.beyond.aop.character.Character.quest(..))")
//    @Before("questPointCut(questName)")
    public void beforeQuest(String questName){
        System.out.println(questName + " 퀘스트 준비 중..");
    }


    // AfterAdvice -> quest() 수행 결과에 상관없이 필요한 작업들 수행
    // @After("execution(* com.beyond.aop.character.Character.quest(..))")
//    @After("questPointCut(questName)")
    public void afterQuest(String questName){
        System.out.println(questName + " 퀘스트 수행 완료..");
    }


    // 퀘스트가 정상적으로 완료된 후 필요한 작업들 수행
//    @AfterReturning(
//            pointcut = "execution(* com.beyond.aop.character.Character.quest(..))",
//            returning = "result" // 버전 6에서는 지원 x
//    )
    public void success(String result) {
        System.out.println("result: " + result);
        System.out.println(  "퀘스트 수행 완료..");
    }

    // 퀘스트 수행 중 에러가 발생했을 때 필요한 작업들 수행
//    @AfterThrowing(
//            pointcut = "questPointCut(questName)",
//            throwing = "exception"
//    )
    public void fail(String questName, Exception exception) {
        System.out.println(exception.getMessage());
        System.out.println(questName + " 퀘스트 수행 중 에러가 발생");
    }


    //
    @Around("execution(* com.beyond.aop.character.Character.quest(..))")
    public String around(ProceedingJoinPoint joinPoint) {
        String result = null;
        String questName = "[" + (String) joinPoint.getArgs()[0] + "]";
        try {
            // before 어드바이스에 대한 기능을 수행
            System.out.println(questName + " 퀘스트 준비 중..");
            
            // 타겟 객체의 메소드를 실행시킴
            // joinPoint.proceed();

            // 타겟 객체의 메소드에 리턴값이 있는 경우
            // result = (String) joinPoint.proceed();
            
            // 타겟 객체의 메소드에 파라미터 값을 변경해서 전달하는 경우
            result = (String) joinPoint.proceed(new Object[]{questName});

            // after-returning 어드바이스에 대한 기능을 수행
            System.out.println("result: " + result);
            System.out.println(questName + " 퀘스트 수행 완료..");

        } catch (Throwable e) {
            // after-throwing 어드바이스에 대한 기능을 수행
            System.out.println("exception: " + e.getMessage());
            System.out.println(questName + " 퀘스트 수행 중 에러가 발생../around/");

        }
        return result;
    }

}
