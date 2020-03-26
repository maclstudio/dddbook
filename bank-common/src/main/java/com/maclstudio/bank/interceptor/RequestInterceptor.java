package com.maclstudio.bank.interceptor;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * 自定义header拦截校验
 * Created by maclstudio on 2019/13/03.
 */
@Slf4j
public class RequestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        log.info("Request Url -> {} {}", request.getMethod(), request.getRequestURL().toString());
        if(HttpMethod.OPTIONS.name().equals(request.getMethod())) {
            return true;
        }
        if(handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            String userId = request.getHeader("User-Id");
            log.debug("Custom Header Info->User-Id:{}", userId);
            request.getSession().setAttribute("userId", Long.valueOf(userId));

        }
        return true;
    }


    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e){
    }


}
