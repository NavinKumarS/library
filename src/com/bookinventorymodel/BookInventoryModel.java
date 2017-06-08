package com.bookinventorymodel;

import java.sql.Connection;

import com.connection.ConnectionUtil;

public class BookInventoryModel {
	private int bookid;
	private int Quantity;
	private int userid;


	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
}

	


