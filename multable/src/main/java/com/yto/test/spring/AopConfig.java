package com.yto.test.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.yto.test.spring")
@EnableAspectJAutoProxy
public class AopConfig {
}
