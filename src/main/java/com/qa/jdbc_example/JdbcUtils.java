package com.qa.jdbc_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Singleton design pattern (only one instance exists)
public class JdbcUtils {

	private String connectionUrl;
	private String username;
	private String password;
	
	private JdbcUtils(String connectionUrl, String username, String password) {
		super();
		this.connectionUrl = connectionUrl;
		this.username = username;
		this.password = password;
	}
	
	private static JdbcUtils utils;
	
	public static Connection getConnection() throws SQLException {
		if (utils == null) {
			utils = new JdbcUtils("jdbc:mysql://localhost:3306/userexample?serverTimezone=UTC","root","root");
		}
		// use DriverManager.getConnection to get a connection to a database
		// - in this case, a locally hosted mysql server
		return DriverManager.getConnection(utils.connectionUrl, utils.username, utils.password);
	}
	
	public static Connection getConnection(String connectionUrl, String username, String password) throws SQLException {
		return DriverManager.getConnection(utils.connectionUrl, utils.username, utils.password);
	}
}
