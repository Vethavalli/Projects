package com.src;

import java.util.Scanner;
import java.lang.Math;

public class MenuCard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter a number:");
		int number1=sc.nextInt();
		do
		{
			System.out.println("1.Even or odd\n2.Prime or Not\n3.Palindrome or not\n4.Amstrong or not\n5.Perfect or not\n6.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					if(number1%2==0)
						System.out.println(number1+" is even number");
					else
						System.out.println(number1+" is odd number");
					break;
				case 2:
					int count=0;
					for(int i=1;i<=number1;i++)
					{
						if(number1%i==0)
							count ++;
					}
					if(count==2)
						System.out.println(number1+" is Prime number");
					else
						System.out.println(number1+" is not prime number");
					break;
				case 3:
					int a=0;
					int number3=number1;
					while(number1>0)
					{
						a=(a*10)+number1%10;
						number1=number1/10;
					}
					if(number3==a)
						System.out.println(number3+" is palindrome");
					else
						System.out.println(number3+" is not palindrome");
					
					break;
				case 4:
					int digits=0,temp=0,b=0;
					int num2=number1;
					if(num2>0)
					{
						num2=num2/10;
						digits++;
					}
					num2=number1;
					while(num2>0)
					{
						temp=num2%10;
						b=(int)(b+(Math.pow(temp, digits)));
						num2=num2/10;
					}
					if(number1==b)
					{
						System.out.println(number1+" is amstrong number");
					}
					else
						System.out.println(number1+" is not amstrong number");
					break;
				case 5:
					int sum=0;
					for(int j=1;j<number1;j++)
					{
						if(number1%j==0) {
							sum=sum+j;
						}
					}
					if(number1==sum)
						System.out.println(number1+" is  a perfect number");
					else
						System.out.println(number1+" is not a perfect number");
					break;
				case 6:
					System.out.println("Loop terminated");;
					break;
				default:
					System.out.println("Invalid choice");
			}
		}while(choice>0 && choice<=5 );
	}

}
