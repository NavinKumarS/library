package com.AuthorDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

	
		public void select(Author author) throws SQLException
		{
			ResultSet rs=null;
		
			String query="SELECT title,content FROM author";
	
			
		try{
			PreparedStatement pst=con.prepareStatement(query);
			 rs = pst.executeQuery();
	         
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
		while(rs.next()){
	            final String title = rs.getString("title");
	            final String content = rs.getString("content");
	          
	            
	           System.out.println(title+""+content);
	             
		}
		}
		public void select2(Author author) throws SQLException{

			ResultSet rs=null;
		
			String query="SELECT isbn,title,content from author where author = '?'";
	
			
	
			try {
				PreparedStatement pst=con.prepareStatement(query);
				 rs = pst.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
				while(rs.next()){
			            final String aor = rs.getString("auhtor");
			            System.out.println(aor);
			            
			            
				}
	         
	
		}

public void delete(Author author){
String query= "delete from author where isbn = ?";
 
	
	try {
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1,author.getIsbn());
		ps.executeUpdate();
		System.out.println("delete");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void select3(Author author) throws SQLException
{ResultSet rs=null;

String query="select isbn,title from author";



try {
	PreparedStatement pst=con.prepareStatement(query);
	 rs = pst.executeQuery();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
	while(rs.next()){
           
		 final String title = rs.getString("title");
         final String isbn = rs.getString("isbn");
         
         System.out.println(title+""+isbn);
         		
            
            
	}
 
}

public void select4(Author author) throws SQLException
{ResultSet rs=null;

String query="select isbn,author from author where title=?";



try {
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1,author.getTitle());
	 rs = pst.executeQuery();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
	while(rs.next()){
           
		 
         final String isbn = rs.getString("isbn");
         final String creater=rs.getString("author");
         System.out.println(isbn+""+creater);
	}
}

public void select5(Author author) throws SQLException
{ResultSet rs=null;

String query="select isbn,title from author where content=?";



try {
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1,author.getContent());
	 rs = pst.executeQuery();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
	while(rs.next()){
           
		 final String title = rs.getString("title");
         final String isbn = rs.getString("isbn");
         
         System.out.println(title+""+isbn);
	}
}
  		
public void select6(Author author) throws SQLException
{ResultSet rs=null;

String query="select isbn,title,author from author where price between 200 and 300";



try {
	PreparedStatement pst=con.prepareStatement(query);

	 rs = pst.executeQuery();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
	while(rs.next()){
           
		 final String title = rs.getString("title");
		 final String isbn = rs.getString("isbn");
         final String creater=rs.getString("author");
         System.out.println(title+""+isbn+""+creater);
	}
}  

public void select7(Author author) throws SQLException
{ResultSet rs=null;

String query="select title,author from author where isbn = ?";



try {
	PreparedStatement pst=con.prepareStatement(query);
	pst.setInt(1,author.getIsbn());
	 rs = pst.executeQuery();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
	while(rs.next()){
           
		 final String title = rs.getString("title");
        
         final String creater=rs.getString("author");
         System.out.println(title+""+creater);
	}
}  
}
	        
	

