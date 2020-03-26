package com.maclstudio.bank.configuration;

import com.maclstudio.bank.interceptor.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");
            }

            /**
             * 添加拦截器
             * @param registry .
             */
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //注册拦截器
                InterceptorRegistration registration = registry.addInterceptor(new RequestInterceptor());
                registration.addPathPatterns("/**");
            }
        };
    }

}
