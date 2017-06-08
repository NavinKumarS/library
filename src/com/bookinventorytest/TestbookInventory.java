package com.bookinventorytest;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.author.Author;
import com.bookinventorydao.BookInventoryDao;
import com.bookinventorymodel.BookInventoryModel;

public class TestbookInventory {

	public static void main(String[] args) throws SQLException {
		BookInventoryDao bdo=new BookInventoryDao();
		BookInventoryModel bim=new BookInventoryModel();
		
		bim.setBookid(3);
		bim.setQuantity(400);
		bim.setUserid(123);
		bdo.save(bim);
		bim.setUserid(23);
		bdo.update(bim);
		
	}

}
