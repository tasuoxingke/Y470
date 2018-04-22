//package com.example.demo.bean;
//
//import org.apache.ibatis.mapping.Environment;
//import org.apache.tomcat.jdbc.pool.DataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//
//@ComponentScan
//@Configuration
//@ConfigurationProperties(prefix="spring.datasource")
//public class MyDataSource  {
//	
//	private String url;
//	private String password;
//	private String username;
//	
//	//环境
//	//@Autowired
//	//private Environment env;
//	@Bean
//	public DataSource getDataSource() {
//		DataSource dataSource = new DataSource();
//		dataSource.setUrl(url);
//		dataSource.setUsername(username);
//		dataSource.setPassword(password);
//		return dataSource;
//	}
//	
//	public String getUrl() {
//		return url;
//	}
//
//	public void setUrl(String url) {
//		this.url = url;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//  
//}
