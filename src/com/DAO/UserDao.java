package com.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import com.connection.ConnectionUtil;
import com.model.User;


public class UserDao {
	public static final Connection con=ConnectionUtil.getConnection();
	
	public void save(User user){
		String query="insert into User(id,name,username,password)values(?,?,?,?,?)";
		
		
		
		try{
			
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1,user.getId());
		ps.setString(2,user.getName());
		ps.setString(3,user.getUserName());
		ps.setString(4,user.getPassword());
		ps.setString(5,user.getRole());
		ps.execute();
		
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		
	}
	public void update(User user)
	{
	
		String query="update user set active=? where username=?"; 
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,user.getActive());
			ps.setString(2, user.getUserName());
			
			ps.execute();
			
			System.out.println("Updated successfully!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void updatepassword (User user)
	{
		System.out.println("Inside update method");
		String query="UPDATE user SET password = ? WHERE ((id = ?) AND (active = '?')) AND (role = '?')";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,user.getId());
			ps.setString(2, user.getActive());
			ps.setString(3,user.getRole());
			
			ps.execute();
		
			
			System.out.println("Updated second time  successfully!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
