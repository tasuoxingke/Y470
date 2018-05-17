package com.example.demo.event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 * @author mhxy0
 *
 */
public class MyEvent extends ApplicationEvent {

	// 消息
	private String msg;
	
	public MyEvent(Object source,String msg) {
		super(source);
		this.msg=msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
}
