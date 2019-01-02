package com.yto.test.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * @author czw
 */
@Configuration
@ComponentScan("com.yto.test.spring")
//@PropertySource("classpath:\\otp-training\\multable\\src\\main\\resources\\demo.properties")
public class ElConfig {
   // @Value("${book.name}")
    private String bookName;
    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("http://www.baidu.com")
    private Resource testUrl;




    @Autowired
    private Environment environment;

    @Bean
    public  static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return  new PropertySourcesPlaceholderConfigurer();
    }
    public void outputResource(){
        System.out.println(osName);
        System.out.println(environment.getProperty("book.author"));

    }
}
