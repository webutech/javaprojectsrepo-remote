package com.yash.tsapp.daoimpl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.yash.tsapp.dao.UserDAO;
import com.yash.tsapp.domain.User;

public class UserDAOImplTest {
	
	private UserDAO userDAO;
	
	@Before
	public void setUp() throws Exception {
		userDAO =  new UserDAOImpl();
	}
	@Test
	public void test_insert_operation() throws Exception {
		User user = new User();
		user.setFirstname("pankaj");
		user.setLastname("sharma");
		user.setEmail("pankaj@gmail.com");
		user.setContact("8827611875");
		user.setAddress("Indore");
		user.setLoginname("pankaj");
		user.setPassword("pankaj123");
		int rowAffected = userDAO.insert(user);
		assertEquals(1, rowAffected);
	}

}
