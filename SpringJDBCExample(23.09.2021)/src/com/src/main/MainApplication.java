package com.src.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.src.dao.UserDAO;
import com.src.model.User;

public class MainApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		UserDAO ud = (UserDAO) context.getBean("userdao");
		
		//int result = ud.addUser(new User("rupa","rupa",84561275,"rupa123@rupa.com"));
		
		//int result = ud.deleteUser(new User("gayathri"));
		
		/*int result = ud.updateUser(new User("rupa","rupa123","rupa@rupa.com"));
		
		if(result>0)
		{
			System.out.println("user updated Successfully!!!");
		}
		else
		{
			System.out.println("unable to update user");
		}*/
		
		List<User> display = ud.displayAllUsers();
		for(User u:display)
		{
			System.out.println(u);
		}
	}

}
