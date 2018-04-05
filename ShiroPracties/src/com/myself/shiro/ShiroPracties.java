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
		   //���ɰ�ȫ������
		   @SuppressWarnings("deprecation")
		IniSecurityManagerFactory iniSecurityManagerFactory = 
				   new IniSecurityManagerFactory("classpath:shiro.ini"); 
		   
		   //��ð�ȫ����Աʵ��
		   SecurityManager securityManager = iniSecurityManagerFactory.getInstance();
		   
		   //ȫ�ְ󶨰�ȫ����Ա
		   SecurityUtils.setSecurityManager(securityManager); 
		   
		   //�����Ŀ
		   Subject subject = SecurityUtils.getSubject();
		   
		   //������ƾ֤
		   UsernamePasswordToken token = new UsernamePasswordToken("zhangsan","123456");
		   
		   try {
			   //��½
			   subject.login(token);
			   System.out.println("------------��½�ɹ�------------");
			   
			   boolean permittedQuery = subject.isPermitted("query");
			   System.out.println("permittedQuery::"+permittedQuery);
			   
			   boolean hasRoleAdmin = subject.hasRole("admin");
			   System.out.println("hasRoleAdmin::"+hasRoleAdmin);
			   
			   boolean hasRoleManager = subject.hasRole("manager");
			   System.out.println("hasRoleManager::"+hasRoleManager);
			   
			   
		   }catch(AuthenticationException e) {
			   System.out.println("-----------------��½ʧ��---------");
			   e.getStackTrace();
		   }
		   
		   
		   subject.logout();//�ǳ�
		   System.out.println("�û��ǳ���");
	   }
}
