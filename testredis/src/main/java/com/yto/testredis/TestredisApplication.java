package com.yto.testredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


/**
 * @author czw
 */
@SpringBootApplication
@ServletComponentScan
public class TestredisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestredisApplication.class, args);
    }
}
