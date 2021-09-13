package com.src;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.next();
		char max='A';
		char min='z'; 
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>max)
			{
				max=s.charAt(i);
			}
		}
		System.out.println("largest character:"+max);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)<min)
			{
				min=s.charAt(i);
			}
		}
		System.out.println("smallest character:"+min);

	}

}
