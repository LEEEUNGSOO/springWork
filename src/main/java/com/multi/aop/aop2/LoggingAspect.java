package com.multi.aop.aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect //what +when +where
@Component//객체를 생성하라는 annotation
public class LoggingAspect {
    @Before("execution(* com.multi.repository.ActionService.*(..))")
    public void beforeMehod(){
        System.out.println("beforeMehod");//what(공통단 코드)
    }
}
