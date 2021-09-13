//To reverse a string without reverse function
package com.src;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		int len = str.length();
		System.out.println("Reversed String:");
		for(int i = len;i > 0;i--)
		{
			System.out.print(str.charAt(i-1));
		}
				

	}

}
