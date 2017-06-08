package com.booksalesdao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.author.Author;
import com.booksales.BookSalesModel;
import com.connection.ConnectionUtil;

public class BookSalesDao{

	public static final Connection con=ConnectionUtil.getConnection();
	String query="insert into booksales(bookid,userid,orderdate,qty,totalamount,status,salesid) VALUES (?,?,?,?,?,?,?)";
	
	public void save (BookSalesModel bsm)
	{
	try{
		
		PreparedStatement ps=con.prepareStatement(query);
	ps.setInt(1, bsm.getBookid());
	ps.setInt(2, bsm.getUserid());
	ps.setDate(3, Date.valueOf(bsm.getOrderdate()));
	ps.setInt(4, bsm.getQty());
	
	ps.setInt(5, bsm.getTotalamount());
	ps.setString(6, bsm.getStatus());
	ps.setInt(7,bsm.getSalesid());
	ps.execute();
	System.out.println("inserted");
	
	}
	catch(SQLException se){
		se.printStackTrace();
	}
	

	}

public void select(BookSalesModel bsm) throws SQLException
{
	ResultSet rs=null;

	String query="select userid,salesid from booksales where (orderdate <='2017-01-07' AND orderdate >= '2017-01-01')";

	
try{
	PreparedStatement pst=con.prepareStatement(query);
	 rs = pst.executeQuery();
     
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
while(rs.next()){
        final String userid = rs.getString("userid");
        final String salesid = rs.getString("salesid");
      
        
       System.out.println(userid+""+salesid);
}
}
}
         