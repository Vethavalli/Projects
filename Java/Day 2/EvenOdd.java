package com.src;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number1=sc.nextInt();
		if(number1 > 0)
		{
			if(number1 %2 ==0)
			{
				System.out.println("The number is positive and it is even number");
			}
			else
				System.out.println("The number is positive but not even");
		}
		else
			System.out.println("The number is not positive");
			


	}

}
