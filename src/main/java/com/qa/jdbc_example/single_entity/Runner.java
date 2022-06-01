package com.qa.jdbc_example.single_entity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.qa.jdbc_example.User;

public class Runner {

	public static void main(String[] args) {
		// using find by id example
		UserDAO userDao = new UserDAO();
		
		User user = userDao.findById(1);
		System.out.println(user);
		System.out.println();
		
		// creating a user example
		User newUser = new User();
		newUser.setForename("Bob");
		newUser.setSurname("Fred");
		newUser.setAge(32);
		
		userDao.create(newUser);

		// reading all users example
		List<User> users = userDao.findAll();
		users.forEach(System.out::println);
	}

}
