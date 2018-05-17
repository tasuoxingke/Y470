package com.example.demo.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		// 获取 容器配置环境，也就是常说的 BeanFactory 的一员
		AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(MyConfig.class);
		// 获取 消息发布者 bean
		MyPublisher myPublisherBean = appContext.getBean(MyPublisher.class);
		// 调用 发布者bean的方法
		myPublisherBean.publish(" Hello 1000phone!! I miss you!!");
		
		// 关闭 资源
		appContext.close();
	}
}
