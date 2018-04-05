package com.myself.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
/**
 * 
 * @author zsyu
 *
 */
public class ShiroPracties {
	   public static void main(String[] args) {
		   //生成安全管理工厂
		   @SuppressWarnings("deprecation")
		IniSecurityManagerFactory iniSecurityManagerFactory = 
				   new IniSecurityManagerFactory("classpath:shiro.ini"); 
		   
		   //获得安全管理员实例
		   SecurityManager securityManager = iniSecurityManagerFactory.getInstance();
		   
		   //全局绑定安全管理员
		   SecurityUtils.setSecurityManager(securityManager); 
		   
		   //获得项目
		   Subject subject = SecurityUtils.getSubject();
		   
		   //获得身份凭证
		   UsernamePasswordToken token = new UsernamePasswordToken("zhangsan","123456");
		   
		   try {
			   //登陆
			   subject.login(token);
			   System.out.println("------------登陆成功------------");
			   
			   boolean permittedQuery = subject.isPermitted("query");
			   System.out.println("permittedQuery::"+permittedQuery);
			   
			   boolean hasRoleAdmin = subject.hasRole("admin");
			   System.out.println("hasRoleAdmin::"+hasRoleAdmin);
			   
			   boolean hasRoleManager = subject.hasRole("manager");
			   System.out.println("hasRoleManager::"+hasRoleManager);
			   
			   
		   }catch(AuthenticationException e) {
			   System.out.println("-----------------登陆失败---------");
			   e.getStackTrace();
		   }
		   
		   
		   subject.logout();//登出
		   System.out.println("用户登出了");
	   }
}
