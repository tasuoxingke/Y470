package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
// 编写自己的个性化配置类，实现首页跳转
// 添加静态资源映射
@Configuration // 表明是配置类
@EnableWebMvc // 没这个注解，重写方法无效的 
@ComponentScan("com.example.demo.config") // 扫描包
public class MyMvcConfig extends WebMvcConfigurerAdapter {
	/*
	 * Internal adj 内部的
	 * 设置视图解析器，但是要先去掉因为，在yml里面已经配置
	 */
	/*
	@Bean
	public InternalResourceViewResolver ViewResolver() {
		InternalResourceViewResolver viewResource = new InternalResourceViewResolver();
		viewResource.setPrefix("前缀");
		viewResource.setSuffix("后缀");
		viewResource.setViewClass(JstlView.class);
		return viewResource;
		
	}*/
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		super.addResourceHandlers(registry);
		// 添加 外界访问地址， 添加文件目录
		registry.addResourceHandler("/jingtai/**").addResourceLocations("classpath:/templates/");
	}
	
}
