package com.multi.aop.aop1;

import com.multi.service.MyService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAopMain {
    public static void main(String[] args) {
        //applicationContext는 xmlDom을 의미한다..
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("/spring/aop1.xml");
        System.out.println(applicationContext

        );
        //MyService는
        MyService myService = applicationContext.getBean(MyService.class);
        System.out.println(myService.performAction("XML"));

    }

}
