package com.qa.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MysqlOrderDao implements Dao<Orders>{

	private Connection connection;
	
	public Orders create(Orders order) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.246.46.47:3306/assignment", "admin", "root12")){
			Statement statement = connection.createStatement();
			statement.executeUpdate("insert into orders(customer_id) values( " + order.getCustomerid() + ");");
		} catch (Exception e) {
		
		}
		return null;
	}

	public ArrayList<Orders> readAll() {
		ArrayList<Orders> itemorders = new ArrayList<Orders>();
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://35.246.46.47:3306/assignment", "root" ,"root12");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from orders");
			while (resultSet.next()) {
				Long orderid = resultSet.getLong("order_id");
				Long customerid = resultSet.getLong("customer_id");
				Orders itemorder = new Orders(orderid, customerid);
				itemorders.add(itemorder);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return itemorders;
	}

	public Orders update(Orders order) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.246.46.47:3306/assignment", "admin", "root12")){
			Statement statement = connection.createStatement();
			statement.executeUpdate("update orders set '"  + " where order_id=" + order.getOrderid() + ";");
		} catch (Exception e) {
		}
		return null;
	}

	public void delete(long id)  {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.246.46.47:3306/assignment", "admin", "root12")){
			Statement statement = connection.createStatement();
			statement.executeUpdate("delete from orders where order_id=" + id + ";");
		} catch (Exception e) {
		
		}
		}
}
