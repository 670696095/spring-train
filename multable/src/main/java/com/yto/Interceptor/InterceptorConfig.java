package com.yto.Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author czw
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        LoginTimeInterceptor loginTimeInterceptor = new LoginTimeInterceptor();
        InterceptorRegistration loginRegistry = registry.addInterceptor(loginTimeInterceptor);

        //不拦截路径,登录和注销
        loginRegistry.excludePathPatterns("/login");
        loginRegistry.excludePathPatterns("/registe")
                //拦截的路径
                .addPathPatterns("/**");
    }



}
