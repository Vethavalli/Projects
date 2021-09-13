package com.src;

import java.util.Scanner;

public class WrapperClass {
	public void prime(int number)
	{
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
				count ++;
		}
		if(count > 2)
			System.out.println(number +" is not prime");
		else
			System.out.println(number +" is prime");
	}
	public void EvenOdd(int number)
	{
		if(number % 2 ==0)
		{
			System.out.println(number +" is even");
		}
		else
			System.out.println(number+" is odd");
	}
	public void palindrome(int number)
	{
		int a=0;
		int number2=number;
		while(number>0)
		{
			a=(a*10)+number%10;
			number=number/10;
		}
		if(number2==a)
			System.out.println(number2+" is palindrome");
		else
			System.out.println(number2+" is not palindrome");
	}
	public void amstrong(int number)
	{
		int digits=0,temp=0,b=0;
		int num2=number;
		while(num2>0)
		{
			num2=num2/10;
			digits++;
		}
		num2=number;
		while(num2>0)
		{
			temp=num2%10;
			double a=Double.valueOf(temp);
			double m=Double.valueOf(digits);
			b=b+(int)(Math.pow(a,m));
			num2=num2/10;
		}
		if(number==b)
		{
			System.out.println(number+" is amstrong number");
		}
		else
			System.out.println(number+" is not amstrong number");
	}
	public void perfectnumber(int number)
	{
		int sum=0;
		for(int j=1;j<number;j++)
		{
			if(number%j==0) {
				sum=sum+j;
			}
		}
		if(number==sum)
			System.out.println(number+" is  a perfect number");
		else
			System.out.println(number+" is not a perfect number");
	}
	
	public static void main(String[] args) {
		WrapperClass wc=new WrapperClass();
		if(args.length>0)
		{
			int number=Integer.parseInt(args[0]);
			wc.prime(number);
			wc.EvenOdd(number);
			wc.palindrome(number);
			wc.amstrong(number);
			wc.perfectnumber(number);
		}
		else
			System.out.println("Values are not passed through command line arguments");
	}

}


