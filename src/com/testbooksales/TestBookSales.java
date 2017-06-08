package com.testbooksales;

import java.sql.SQLException;
import java.time.LocalDate;

import com.booksales.BookSalesModel;
import com.booksalesdao.BookSalesDao;

public class TestBookSales {

	public static void main(String[] args) throws SQLException {
		BookSalesDao bsd=new BookSalesDao();
		BookSalesModel bsm=new BookSalesModel();
		bsm.setBookid(223);
		bsm.setOrderdate(LocalDate.parse("2004-01-17"));
		bsm.setQty(200);
		bsm.setSalesid(12);
		bsm.setStatus("booked");
		bsm.setTotalamount(400);
		bsm.setUserid(11);
		bsd.save(bsm);
		bsd.select(bsm);

	}

}
