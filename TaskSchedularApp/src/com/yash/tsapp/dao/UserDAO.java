package com.yash.tsapp.dao;

import java.util.List;

import com.yash.tsapp.domain.User;

public interface UserDAO {
	
	public void insert(User user);
	public void delete(Integer id);
	public List<User> list();
	public User getUser(Integer id);
	public void update(User user);

}
