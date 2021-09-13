package com.src;

import java.util.Scanner;
import java.util.function.IntConsumer;

public class FibonacciEvenAdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		IntConsumer c = (o1) -> {
			int num1 = 0,num2 =1,num3,sum =0;
			System.out.print(num1+" "+num2);
			
			for (int i =2;i <= o1; i++)
			{
				if(i % 2 == 0)
				{
					sum = sum+i;
				}
				num3 = num1+num2;
				System.out.print(" "+num3);
				num1 = num2;
				num2 = num3;
				
				
			}
			System.out.println("\nSum of all even Fibonacci Numbers:"+sum);
		};
		c.accept(num);

	}

}
