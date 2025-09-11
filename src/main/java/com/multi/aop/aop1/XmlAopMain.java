package com.multi.aop.aop1;

import com.multi.service.MyService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmkAopMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("/spring/aop1.xml");
        System.out.println(applicationContext

        );
        MyService myService = applicationContext.getBean(MyService.class);
        System.out.println(myService.performAction("XML"));

    }

}
