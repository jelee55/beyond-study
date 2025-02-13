package com.beyond.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
    Aspect란
    횡단 관심사를 분리하여 작성한 클래스 (어드바이스 + 포인트컷)
    
    Advice는 애스펙트가 해야 할 작업과 언제 그 작업을 수행해야 하는지를 정의하는 메소드
    언제 수행할지는 어노테이션으로 정의함
 */

@Aspect
@Component // Bean으로 등록해야함
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
     */


    // Pointcut 중복 제거
    @Pointcut("execution(* com.beyond.aop.character.Character.quest(..)) && args(questName)")
    public void questPointCut(String questName){
    }


    // BeforeAdvice -> quest()가 실행되기 전에 수행
    // @Before("execution(* com.beyond.aop.character.Character.quest(..))")
    @Before("questPointCut(questName)")
    public void beforeQuest(String questName){
        System.out.println(questName + " 퀘스트 준비 중..");
    }


    // AfterAdvice -> quest() 수행 결과에 상관없이 필요한 작업들 수행
    // @After("execution(* com.beyond.aop.character.Character.quest(..))")
    @After("questPointCut(questName)")
    public void afterQuest(String questName){
        System.out.println(questName + " 퀘스트 수행 완료..");
    }
}
