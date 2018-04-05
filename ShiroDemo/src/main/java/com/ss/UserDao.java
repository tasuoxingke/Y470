package com.ss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class UserDao {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 登录
	 * @param username
	 * @param password
	 * @return
	 */
	public UserBean login(String username,String password){
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sh_1702_hlh?useSSL=true&serverTimezone=UTC", "root", "0123");
			PreparedStatement statement = conn.prepareStatement("select * from tb_user where user_name=? and user_password=?");
			statement.setString(1, username);
			statement.setString(2, password);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			String usernameStr = resultSet.getString("user_name");
			String passwordStr = resultSet.getString("user_password");
			System.out.println(usernameStr);
			return new UserBean(usernameStr, passwordStr);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	/**
	 * 查询角色
	 * @param username
	 * @return
	 */
	public List<String> queryRoles(String username){
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sh_1702_hlh?useSSL=true&serverTimezone=UTC", "root", "0123");
			PreparedStatement statement = conn.prepareStatement("select role_name from tb_user u join tb_role r on u.user_id = r.user_id and u.user_name=?");
			statement.setString(1, username);
			ResultSet resultSet = statement.executeQuery();
			List<String> roleList = new ArrayList<String>();
			while(resultSet.next()){
				String roleName = resultSet.getString("role_name");
				roleList.add(roleName);
			}
			return roleList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
