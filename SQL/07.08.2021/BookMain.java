package com.src;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;


public class BookMain {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		BookDAOImpl ba = new BookDAO();
		Book ac = new Book();
		do {
		System.out.println("Book DataBase Management System");
		System.out.println("1. Add Book\n2. Get Book\n3. Select all Books\n4. Delete Book \n5. Update Book\n6. Exit");
		System.out.println("Choose from the following menu");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter Bookid");
			ac.setBookid(sc.nextInt());
			System.out.println("Enter Bookname");
			ac.setBookname(sc.next());
			System.out.println("Enter author of book");
			ac.setAuthor(sc.next());
			System.out.println("Enter ISBN of book");
			ac.setIsbn(sc.nextLong());
			System.out.println("Enter Price of the book");
			ac.setPrice(sc.nextInt());
			ba.insertBook(ac);
			System.out.println("Book details added successfully");
			break;
		case 2:
			System.out.println("Enter Book id");
			int id = sc.nextInt();
			ac = ba.selectBook(id);
			System.out.println("Book[" + ac.getBookid()+" "+ac.getBookname()+" "+ac.getAuthor()+" "+ac.getIsbn()+" "+ac.getPrice()+"]");
			break;
		case 3:
			List<Book> b=ba.selectAllBooks();
			for(Book a:b)
			{
				System.out.println(a);
			}
			break;
		case 4:
			System.out.println("Enter Book id");
			int id1=sc.nextInt();
			boolean res=ba.deleteBook(id1);
			if(res)
			{
				System.out.println("Book Deleted Sucessfully");
			}
			else
			{
				System.out.println("Book ID is not present");
			}
			break;
		case 5:
			Book t =new Book();
			System.out.println("Enter Book id for updation");
			int ID=sc.nextInt();
			t.setBookid(ID);
			System.out.println("Enter Book name");
			t.setBookname(sc.next());
			System.out.println("Enter Author of the book");
			t.setAuthor(sc.next());
			System.out.println("Enter ISBN of the book");
			t.setIsbn(sc.nextLong());
			System.out.println("Enter price of the book");
			t.setPrice(sc.nextInt());
			boolean res1=ba.updateBook(t);
			if(res1) {
				System.out.println("Updated Sucessfully");
			}
			else {
				System.out.println("cannot update id doesn't exists");
			}
			break;
		case 6:
			System.out.println("Good bye.......");
			break;

		default:
			System.out.println("Invalid choice");
			break;
		}
	
		}while(choice!=6);
		
		
		

	}

}
