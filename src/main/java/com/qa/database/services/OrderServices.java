package com.qa.database.services;

import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.qa.databases.Dao;

public class OrderServices implements CrudServices<Order> {

	Dao<Order> orderDao;
	
	public OrderServices(Dao<Order> orderDao) {
		this.orderDao = orderDao;
	}
	
	public List<Order> readAll() {
		return orderDao.readAll();
	}

	public Order create(Order order) {
		return orderDao.create(order);
	}

	public Order update(Order order) {
		return orderDao.update(order);
	}

	public void delete(long id) {
		orderDao.delete(id);
	}

	
		
	}

