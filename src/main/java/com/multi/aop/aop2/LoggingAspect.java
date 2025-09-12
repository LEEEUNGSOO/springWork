package com.multi.aop.aop2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect //what +when +where
@Component//객체를 생성하라는 annotation
public class LoggingAspect {

//    @Before("execution(* com.multi.repository.ActionService.*(..))")
//    public void beforeMehod(){
//        System.out.println("beforeMehod");//what(공통단 코드)
//    }
//    @AfterReturning("execution(* com.multi.repository.ActionService.*(..))")
//    public void afterReturning(){
//        System.out.println("AfterReturning");//what(공통단 코드)
//    }
//    @After("execution(* com.multi.repository.ActionService.*(..))")
//    public void after(){
//        System.out.println("After");//what(공통단 코드)
//    }
//    @AfterThrowing("execution(* com.multi.repository.ActionService.*(..))")
//    public void afterThrowing(){
//        System.out.println("AfterThrowing");//what(공통단 코드)
//    }

    @Around("execution(* com.multi.repository.ActionService.*(..))")
    public void aroundMethod(ProceedingJoinPoint proceedingJoinPoint)  {
        System.out.println("Ardound  Before 실행");
        try {
            proceedingJoinPoint.proceed();
            System.out.println("Ardound Process");
        }catch (Throwable e){
            System.out.println("Ardound Exception");
            e.printStackTrace();
        }finally {
            System.out.println("Ardound finally After");
        }
        System.out.println("Ardound After Returning");

    }


}
