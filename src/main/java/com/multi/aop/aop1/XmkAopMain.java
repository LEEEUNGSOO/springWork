package com.multi.aop.aop1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmkAopMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("/spring/aop1.xml");
        System.out.println(applicationContext
        );

    }

}
