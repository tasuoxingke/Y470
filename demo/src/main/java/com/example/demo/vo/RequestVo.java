package com.example.demo.vo;

import java.io.Serializable;

public class RequestVo implements Serializable{

	/**
	 * 
	 */
	//private static final long serialVersionUID = -5987128321016874546L;
	private String logistics_interface;
	private String data_digest;
	private String msg_type;
	private String msg_id;
	private String partner_code;
	private String from_code;
	public String getLogistics_interface() {
		return logistics_interface;
	}
	public void setLogistics_interface(String logistics_interface) {
		this.logistics_interface = logistics_interface;
	}
	public String getData_digest() {
		return data_digest;
	}
	public void setData_digest(String data_digest) {
		this.data_digest = data_digest;
	}
	public String getMsg_type() {
		return msg_type;
	}
	public void setMsg_type(String msg_type) {
		this.msg_type = msg_type;
	}
	public String getMsg_id() {
		return msg_id;
	}
	public void setMsg_id(String msg_id) {
		this.msg_id = msg_id;
	}
	public String getPartner_code() {
		return partner_code;
	}
	public void setPartner_code(String partner_code) {
		this.partner_code = partner_code;
	}
	public String getFrom_code() {
		return from_code;
	}
	public void setFrom_code(String from_code) {
		this.from_code = from_code;
	}
	@Override
	public String toString() {
		return "RequestVo [logistics_interface=" + logistics_interface
				+ ", data_digest=" + data_digest + ", msg_type=" + msg_type
				+ ", msg_id=" + msg_id + ", partner_code=" + partner_code
				+ ", from_code=" + from_code + "]";
	}
	
}
