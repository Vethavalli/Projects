package com.src;
import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a three digit positive number:");
		int number=sc.nextInt();
		int a=0;
		while(number>0)
		{
			a=number%10;
			number=number/10;
		}
		if(a%2==0)
		{
			System.out.println(a+"is divisible by 2");
		}
		else
			System.out.println(a+"is not divisible by 2");
	}

}
