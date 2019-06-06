package com.mybatisplus.mybatisplus.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import java.io.IOException;

/**
 * 过滤器配置类
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new Filter() {
            @Override
            public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
                servletRequest.setCharacterEncoding("utf-8");
                servletResponse.setCharacterEncoding("utf-8");
                filterChain.doFilter(servletRequest, servletResponse);
            }
        });
        return filterRegistrationBean;
    }
}
