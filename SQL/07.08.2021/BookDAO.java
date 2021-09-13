package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO implements BookDAOImpl {

	@Override
	public Connection getConnection() {
		    Connection con = null;
		  try {
			Class.forName(driverclass);
			con = DriverManager.getConnection(jdbcurl, username, password);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return con; 
		
	}

	@Override
	public void insertBook(Book a) {
		String query = "insert into book(bookid,bookname,author,ISBN,price) values(?, ?, ?, ?, ?)";
		try(Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,a.getBookid());
			ps.setString(2,a.getBookname());
			ps.setString(3,a.getAuthor());
			ps.setLong(4,a.getIsbn());
			ps.setInt(5,a.getPrice());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Book selectBook(int id) {
		String query = "select * from book where bookid = ?";
		Book a = null;
		try(Connection con = getConnection()) {
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			  a = new Book();
			  a.setBookid(id);
			  a.setBookname(rs.getString(2));
			  a.setAuthor(rs.getString(3));
			  a.setIsbn(rs.getLong(4));
			  a.setPrice(rs.getInt(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public List<Book> selectAllBooks() {
		List<Book> arraylist = new ArrayList<Book>();
		String query = "select * from book";
		try(Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			  Book a = new Book(); 
			  a.setBookid(rs.getInt(1));
			  a.setBookname(rs.getString(2));
			  a.setAuthor(rs.getString(3));
			  a.setIsbn(rs.getLong(4));
			  a.setPrice(rs.getInt(5));
			  
			  arraylist.add(a);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arraylist;
	}

	@Override
	public boolean deleteBook(int id) {
		boolean res=false;
		String query = "delete from book where bookid=?";
		try(Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			res = ps.executeUpdate()>0;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public boolean updateBook(Book a) {
		boolean res=false;
		String query = "update book set bookname=?,author=?,isbn=?,price=? where bookid =?";
		try(Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, a.getBookname());
			ps.setString(2, a.getAuthor());
			ps.setLong(3, a.getIsbn());
			ps.setLong(4, a.getPrice());
			ps.setInt(5, a.getBookid());
			res = ps.executeUpdate()>0;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

}
