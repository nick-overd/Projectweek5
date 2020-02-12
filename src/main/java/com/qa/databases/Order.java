package com.qa.databases;

public class Order {
	
	private Long orderid ;
	private Long customerid;
	
	public Order(Long customerid) {
		this.customerid = customerid;
	}
	
	
	public Order(Long orderid, Long customerid) {
		this.orderid = orderid;
		this.customerid = customerid;
	}
	
	
	
	public long getOrderid() {
		return orderid;
	}
	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}
	public long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}
	

}