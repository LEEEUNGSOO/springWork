package com.multi.aop.aop1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {//LoggingAspect
    //Aspect은 What +When +Where

    //When Before
    //* com.multi.service.MyService.*(..))이코든  pointcut을 의미한다 Where
    @Before("execution(* com.multi.service.MyService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("logBefore");//What(공통부분)
    }

}
