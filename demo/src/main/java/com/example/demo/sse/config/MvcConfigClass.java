package com.example.demo.sse.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//@Configuration
//@EnableWebMvc
//@ComponentScan("com.example.demo.sse.config")
public class MvcConfigClass extends WebMvcConfigurationSupport {

// 配置路径映射
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        //registry.addResourceHandler("/html/**").addResourceLocations("classpath:/templates/");
        //registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");

    }
// 重写方法，设置 页面转向
    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
        registry.addViewController("/sse").setViewName("/sse");
    }
}
