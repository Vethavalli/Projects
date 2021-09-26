package com.src.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.src.model.User;



public class UserDAO implements UserDAOInterface{
	
	private JdbcTemplate jdbctemp;
	public void setJdbctemp(JdbcTemplate jdbctemp)
	{
		this.jdbctemp=jdbctemp;
		
	}

	@Override
	public int addUser(User u) {
		String query="insert into users values("+"'"+u.getUsername()+"','"+u.getPassword()+"',"+u.getMobilenumber()+",'"+u.getEmail()+"')";
		return jdbctemp.update(query);
	}

	@Override
	public int updateUser(User u) {
		String query="update users set password='"+u.getPassword()+"',email='"+u.getEmail()+"' where username='"+u.getUsername()+"'";
		return jdbctemp.update(query);
	}

	@Override
	public int deleteUser(User u) {
		String query="delete from users where username='"+u.getUsername()+"'";
		return jdbctemp.update(query);
	}

	@Override
	public List<User> displayAllUsers() {
		return jdbctemp.query("select * from users",(rs,row) -> {
			User u = new User();
			u.setUsername(rs.getString(1));
			u.setPassword(rs.getString(2));
			u.setMobilenumber(rs.getLong(3));
			u.setEmail(rs.getString(4));
			return u;
			

		});
		
	}

}
