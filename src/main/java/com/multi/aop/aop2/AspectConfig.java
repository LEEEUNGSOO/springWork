package com.multi.aop.aop2;

import com.multi.di.di1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.multi.repository","com.multi.aop.aop2"})
@EnableAspectJAutoProxy
public class AspectConfig {//xml이 필요없지요...

    @Bean(name = "pop")
    public Person getPrson(){
        return new Person();
    }


}
