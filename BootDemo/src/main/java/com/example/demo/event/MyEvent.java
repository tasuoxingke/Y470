package com.example.demo.event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件，继承ApplicationEvent
 * @author mhxy0
 *
 */
public class MyEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 消息内容
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
