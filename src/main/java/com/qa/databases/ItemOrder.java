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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (itemid ^ (itemid >>> 32));
		result = prime * result + (int) (itorid ^ (itorid >>> 32));
		result = prime * result + (int) (orderid ^ (orderid >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemOrder other = (ItemOrder) obj;
		if (itemid != other.itemid)
			return false;
		if (itorid != other.itorid)
			return false;
		if (orderid != other.orderid)
			return false;
		return true;
	}
	
	

}