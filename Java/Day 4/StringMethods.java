package Day4;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		
		//length of the string
		String s="Welcome";
		int len=s.length();
		System.out.println("Length of the string is:"+ len);
		
		//Concat two strings
		
		String s1="Welcome";
		String s2="to java";
		System.out.println("concated strings:"+" " + (s1+s2));
		System.out.println(s1.concat(" "+s2));
		System.out.println("welcome"+ " to java");
		System.out.println("welcome".concat(" to java"));
		
		//trim --removes spaces
		
		String a="Java programming";
		//System.out.println(a.trim());
		
		//charAt()
		
		System.out.println(s.charAt(2));
		
		//contains() returns true or false
		
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("come"));
		
		//equals method
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		
		//equalsIgnoreCase method
		
		System.out.println(s.equalsIgnoreCase("welcome"));
		
		//replace method
		
		System.out.println(s.replace('e','a'));
		System.out.println(a.replace("Java","C"));	
		
		//substring method
		
		System.out.println(s.substring(0,3));
		
		//Lower and upper case
		
		System.out.println(s.toUpperCase());
		
	}

}
