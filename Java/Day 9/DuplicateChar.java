//To find duplicate characters in String
package com.src;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1 = sc.nextLine();
		char[] c = s1.toCharArray();
		System.out.println("Duplicate characters in the string are:");
		for(int i = 0;i < s1.length();i++)
		{
			for(int j = i+1;j < s1.length();j++)
			{
				if(c[i] == c[j])
				{
					System.out.print(c[j]+" ");
					
					break;
				}
			}
		}
	}

}
