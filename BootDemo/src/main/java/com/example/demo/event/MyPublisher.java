package com.example.demo.event;
/**
 * 消息发布者
 * @author mhxy0
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class MyPublisher {
	
	@Autowired
	ApplicationContext appContext; //用来发布事件,有2个ApplicationContext ，另一个是和服务器会话相关的，注意别搞错
	
	public void publish(String msg) {
		appContext.publishEvent(new MyEvent(this, msg));// 发步事件
	}
	
}
