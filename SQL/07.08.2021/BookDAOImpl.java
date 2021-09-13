package com.src;

import java.sql.Connection;
import java.util.List;

public interface BookDAOImpl {
	
	public static final String jdbcurl = "jdbc:mysql://localhost:3306/Bookdb";
	public static final String driverclass =  "com.mysql.cj.jdbc.Driver";
	public static final String username = "vetha";
	public static final String password = "Vetha@5143";
	Connection getConnection();
	void insertBook(Book a);
	Book selectBook(int id);
	List<Book> selectAllBooks();
	boolean deleteBook(int id);
	boolean updateBook(Book a);
	
}

