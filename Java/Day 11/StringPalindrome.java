package com.src;

import java.util.Scanner;
import java.util.function.Consumer;

public class StringPalindrome {
	@ SuppressWarnings("unchecked")
	public static void main(String[] args) {
		StringPalindrome p = new StringPalindrome();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		Consumer c = (o1) -> {
			String s = (String) o1;
			int b = 0,e =0;
			String curpal =" ";
			String longpal = " ";
			for(int i = 0;i < s.length()-1;i++)
			{
				b = i - 1;
				e = i + 1;
				while(b >=0 && e <s.length())
				{
					if(s.charAt(b) != s.charAt(e))
						break;
					curpal = s.substring(b,e+1);
					longpal = curpal.length() > longpal.length()? curpal :longpal;
					b--;
					e++;
				}
				
			}
			System.out.println("Longest palindrome in a given string:"+longpal);
		};
		c.accept(str);
		
	}
}
