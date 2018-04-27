package com.yash.tsapp.test;

import com.yash.tsapp.dao.UserDAO;
import com.yash.tsapp.daoimpl.UserDAOImpl;
import com.yash.tsapp.domain.User;

public class UserDAOImplInsertOperationTest {

	public static void main(String[] args) {
		UserDAO userDAO=new UserDAOImpl();
		User user = new User();
		user.setFirstname("pankaj");
		user.setLastname("sharma");
		user.setEmail("pankaj@gmail.com");
		user.setContact("8827611875");
		user.setAddress("Indore");
		user.setLoginname("pankaj");
		user.setPassword("pankaj123");
		userDAO.insert(user);
		System.out.println("User inserted successfully!");

	}

}
