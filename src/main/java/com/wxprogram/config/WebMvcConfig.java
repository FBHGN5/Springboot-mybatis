package com.wxprogram.config;

import com.wxprogram.handler.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 注册拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry){
       // interceptorRegistry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/index","/static/**");
    }
}