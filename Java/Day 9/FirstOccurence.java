//To find the first non repeating character in a given string
package com.src;
import java.util.Scanner;
public class FirstOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		char[] c = str.toCharArray();
		int len = str.length();
		for(int i = 0;i < len;i++)
		{
			if(str.indexOf(c[i]) == str.lastIndexOf(c[i]))
			{
				System.out.println("The first non-repeating character in a string is:"+c[i]);
				break;
			}
				
		}
		

	}

}
