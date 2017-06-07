package com.AuthorDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import com.author.Author;
import com.connection.ConnectionUtil;
import com.model.User;

public class AuthorDao {
	public static final Connection con=ConnectionUtil.getConnection();

	public void save(Author author){
		String query="INSERT INTO author (isbn,title,author,publishDate,content,price,status) VALUES (?,?,?,?,?,?,?)";
		
		
		try{
			
			PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1,author.getIsbn());
		ps.setString(2,author.getTitle());
		ps.setString(3,author.getAuthor());
		ps.setLong(4,author.getPublishdate());
		ps.setString(5, author.getContent());
		ps.setInt(6, author.getPrice());
		ps.setString(7,author.getStatus());
		ps.execute();
		System.out.println("inserted");
		
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		
	}

	public void update(Author author){
		
	
	String query= "update author set content = ? where isbn= ? ";
	
	try {
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, author.getContent());
		ps.setInt(2,author.getIsbn());
		ps.executeUpdate();
		System.out.println("update");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
		public void select(Author author)
		{
			String query="SELECT title,content FROM author";
		try{
			
		
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.execute();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	}
}
