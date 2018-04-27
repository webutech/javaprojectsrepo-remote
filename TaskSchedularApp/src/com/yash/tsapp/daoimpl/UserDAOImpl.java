package com.yash.tsapp.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.yash.tsapp.dao.UserDAO;
import com.yash.tsapp.domain.User;
import com.yash.tsapp.util.DBUtil;

/**
 * UserDAOImpl is the implementation of UserDAO.
 * @author sharma.pankaj
 *
 */
public class UserDAOImpl extends DBUtil implements UserDAO {

	/**
	 * insert method will insert the provided user in users table of DB
	 */
	@Override
	public void insert(User user) {
		String sql = "INSERT INTO users (firstname,lastname,email,contact,address,loginname,password) values (?,?,?,?,?,?,?)";
		PreparedStatement pstmt = getPrepareStatement(sql);
		try {
			pstmt.setString(1, user.getFirstname());
			pstmt.setString(2, user.getLastname());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getContact());
			pstmt.setString(5, user.getAddress());
			pstmt.setString(6, user.getLoginname());
			pstmt.setString(7, user.getPassword());
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

}
