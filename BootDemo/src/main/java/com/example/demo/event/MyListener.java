package com.example.demo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component //表明这是个bean
public class MyListener implements ApplicationListener<MyEvent> {
	// 重写方法  处理消息
	@Override
	public void onApplicationEvent(MyEvent arg0) {
		String msg = arg0.getMsg();
		System.out.println("我 MyListener 接到了消息"+msg);
	}

}
