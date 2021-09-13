package com.src;

import java.util.Scanner;
import java.util.function.IntConsumer;

public class FibonacciEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		IntConsumer c = (o1) -> {
			int num1 = 0,num2 =1,num3;
			System.out.print(num1+" "+num2);
			
			for (int i =2;i <= o1; i++)
			{
				num3 = num1+num2;
				System.out.print(" "+num3);
				num1 = num2;
				num2 = num3;
			}
		};
		c.accept(num);

	}

}
