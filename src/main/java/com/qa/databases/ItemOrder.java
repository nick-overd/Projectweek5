package com.qa.databases;

public class ItemOrder {
	
	private long itorid;
	private long itemid;
	private long orderid;
	
	
	public ItemOrder(long itorid, long itemid, long orderid) {
		super();
		this.itorid = itorid;
		this.itemid = itemid;
		this.orderid = orderid;
	}
	
	public ItemOrder(long itemid, long orderid) {
		super();
		this.itemid = itemid;
		this.orderid = orderid;
	}
	
	
	public long getItorid() {
		return itorid;
	}
	public void setItorid(long itorid) {
		this.itorid = itorid;
	}
	public long getItemid() {
		return itemid;
	}
	public void setItemid(long itemid) {
		this.itemid = itemid;
	}
	public long getOrderid() {
		return orderid;
	}
	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}
	
	

}