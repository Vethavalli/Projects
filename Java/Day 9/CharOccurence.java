//To count the occurence of a character in a given string..
package com.src;

import java.util.Scanner;

public class CharOccurence {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		System.out.println("Enter a character to count its occurence in given string:");
		char c = sc.next().charAt(0);
		char[] ch = str.toCharArray();
		int len = str.length();
		for(int i = 0;i < len;i++)
		{
			if(ch[i] == c)
			{
				count ++;
			}
		}
		System.out.println("No of occurence of "+c+" is:"+count);

	}

}
