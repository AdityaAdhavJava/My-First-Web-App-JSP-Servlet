package com.servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.servlet.entity.User;
import com.servlet.utility.JDBCConnection;
public class UserDao {
	Connection con= JDBCConnection.getConnection();
	public   String saveUser(User user) {
		try {
			PreparedStatement pst=con.prepareStatement("insert into user values(?,?,?)");
			pst.setString(1, user.getName());
			pst.setString(2, user.getEmail());
			pst.setString(3, user.getPassword());
			
			
			pst.executeUpdate();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return "User registered Successfully";
	}

	public boolean loginUser(String name,String password) {
		try {
			PreparedStatement pst=con.prepareStatement("select * from user where name=? and password=?");
			
			pst.setString(1, name);
			pst.setString(2,password);
			
			ResultSet rs=pst.executeQuery();
			
			if(rs.next()) {
				
				return true;
			}else {
				return false;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	
}
