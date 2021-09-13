package com.src;

import java.util.Scanner;

public class StringMethods {
	public static boolean checkLength(String username)
	{
		if((username.length() >= 8) && (username.length() <= 33))
			return true;
		else 
			return false;
	}
	public static boolean isvalid(String username)
	{
		int count=0;
		for(int i=0;i<=9;i++)
		{
			String str=Integer.toString(i);
			if(username.contains(str))
			{
				count=1;
			}
		}
		if(count==0)
			return false;
		if(!(username.contains("@")||username.contains("#")||username.contains("!") || username.contains("~")
	              ||username.contains("$") || username.contains("%")|| username.contains("^") 
	              || username.contains("&")|| username.contains("*") ||username.contains("(")
	              || username.contains(")") || username.contains("-")
	              || username.contains("+") || username.contains("/")
	              || username.contains(":") || username.contains(".")
	              || username.contains(",") || username.contains("<")
	              || username.contains(">") || username.contains("?")
	              || username.contains("|")))
			return false;
		if(true) {
		for(int i=65;i <= 90;i++)
		{
			char c= (char) (i);
			String s=Character.toString(c);
			if(username.contains(s))
				count=1;
		}
		if(count==0)
			return false;
		}
		if(true) {
			for(int i=90;i <= 122;i++)
			{
				char c= (char) (i);
				String s=Character.toString(c);
				if(username.contains(s))
					count=1;
			}
			if(count==0)
				return false;
		}
		return true;
			
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String username = sc.nextLine();
		if(checkLength(username))
			System.out.println("Entered username is within the length of 8-33");
		else
			System.out.println("The username exceeds the length of 33....");
		if(isvalid(username))
		{
			System.out.println("Entered username is valid..");
			StringBuffer b=new StringBuffer(username);
			b.reverse();
			System.out.println("Username:"+username);
			System.out.println("Password:"+b);
		}	
		else
			System.out.println("Username is not valid.. ");
		 

	}

}
