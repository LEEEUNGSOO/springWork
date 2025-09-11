package com.multi.aop.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aop2Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AspectConfig.class);
        System.out.println(applicationContext.getBean("actionServiceImp"));
    }
}
