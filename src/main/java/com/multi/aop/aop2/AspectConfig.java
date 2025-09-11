package com.multi.aop.aop2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.multi.repository","com.multi.aop.aop2"})
public class AspectConfig {

}
