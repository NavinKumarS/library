package com.booksales;

import java.time.LocalDate;

public class BookSalesModel {
	private int userid;
	private int qty;
	private int salesid;
	private int bookid;
	private int totalamount;
	private String status;
	private LocalDate orderdate; 
public LocalDate getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}

public int getSalesid() {
	return salesid;
}
public void setSalesid(int salesid) {
	this.salesid = salesid;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public int getTotalamount() {
	return totalamount;
}
public void setTotalamount(int totalamount) {
	this.totalamount = totalamount;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
