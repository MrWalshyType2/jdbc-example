package com.qa.jdbc_example;

public class Runner {

	public static void main(String[] args) {
		User user = new User();
		user.setForename("Morgan");
		user.setSurname("Walsh");
		user.setAge(23);
		
		// user dao for accessing database
		UserDAO dao = new UserDAO();
		//dao.create(user);
		User inDb = dao.findById(1);
		System.out.println(inDb);
	}

}
