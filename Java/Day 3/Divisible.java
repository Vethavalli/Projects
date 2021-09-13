package com.src;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number:");
		int number=sc.nextInt();
		int a=0;
		a=number%10;
		if(a%3==0)
		{
			if(a%5==0)
			{
				System.out.println(a+"is divisible by both 3 and 5");
			}
			else
				System.out.println(a+"is divisible by 3 and not by 5");
		}
		else
			System.out.println(a+"is not divisible by both 3 and 5");

	}

}
