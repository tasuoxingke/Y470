package com.example.demo.bean;

public class BizException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// 错误码
	private String exceptionId;
	// 错误信息
	private String exceptionInfo;
	
	
	
	public BizException(String exceptionInfo) {
		super();
		this.exceptionInfo = exceptionInfo;
	}
	public BizException(String exceptionId, String exceptionInfo) {
		super();
		this.exceptionId = exceptionId;
		this.exceptionInfo = exceptionInfo;
	}
	public BizException() {
		super();
	}
	
	public String getExceptionInfo() {
		return exceptionInfo;
	}
	public void setExceptionInfo(String exceptionInfo) {
		this.exceptionInfo = exceptionInfo;
	}
	public String getExceptionId() {
		return exceptionId;
	}
	public void setExceptionId(String exceptionId) {
		this.exceptionId = exceptionId;
	}
	
}
