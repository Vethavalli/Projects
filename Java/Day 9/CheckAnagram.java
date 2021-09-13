//To find both strings are Anagram or not
package com.src;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		boolean b= false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1:");
		String s1 = sc.nextLine();
		System.out.println("Enter String2:");
		String s2 = sc.nextLine();
		if(s1.length() == s2.length())
		{
			char[] c1 = s1.toCharArray();
			Arrays.sort(c1);
			System.out.println(Arrays.toString(c1));
			char[] c2 = s2.toCharArray();
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c2));
			b = Arrays.equals(c1, c2);
			System.out.println(b);
			if(b == true)
				System.out.println("Given Strings are anagrams");
			else
				System.out.println("Both strings are not anagrams");
			
		}
		else
			System.out.println("Both are not anagrams");

	}

}
