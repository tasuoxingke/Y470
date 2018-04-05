package com.ss.reaml;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.ss.UserBean;
import com.ss.UserDao;

public class UserRealm extends AuthorizingRealm {
	private UserDao userDao = new UserDao();

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// 
		System.out.println("---------------2---------------");
		String primaryPrincipal = (String) principals.getPrimaryPrincipal();
		System.out.println(primaryPrincipal);
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		List<String> queryRoles = userDao.queryRoles(primaryPrincipal);
		simpleAuthorizationInfo.addRoles(queryRoles);
		System.out.println(queryRoles);
		
		return simpleAuthorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//
		System.out.println("----------1--------");
		String username = (String) token.getPrincipal();
		Object password = token.getCredentials();
		char[] passwor = (char[]) password;
		String passwo = new String(passwor);
		System.out.println(username + "==" + passwo);
		UserBean bean = userDao.login(username, passwo);
		System.out.println(this.getName() + "000");
		if (bean == null) {
			throw new AuthenticationException("登录失败：密码或者用户名错误");
		}

		return new SimpleAuthenticationInfo(username, password, "userRealm");
	}

}
