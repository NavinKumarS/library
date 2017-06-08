package com.bookinventorydao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.author.Author;
import com.bookinventorymodel.BookInventoryModel;
import com.connection.ConnectionUtil;

public class BookInventoryDao {
	public static final Connection con=ConnectionUtil.getConnection();
	public void save (BookInventoryModel model) throws SQLException
	{
		String query="insert into bookinventory(bookid,quantity,userid)values(?,?,?)";
				PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1,model.getBookid());
		pst.setInt(2, model.getQuantity());
		pst.setInt(3,model.getUserid());
		pst.execute();
		System.out.println("inserted");
	}



public void update(BookInventoryModel model){
	

String query= "update bookinventory set quantity= quantity+1 where userid = ?";

try {
	PreparedStatement ps=con.prepareStatement(query);
	ps.setInt(1, model.getUserid());
	System.out.println("update");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
}
