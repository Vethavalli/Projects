package com.src;
import java.util.Scanner;

public class OperatorsEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char choice;
		System.out.println("1. + \n2. - \n3. *\n4. /\n5. %");
		System.out.println("Enter a symbol:");
		choice=sc.next().charAt(0);
		switch(choice)
		{
			case '+':
				System.out.println("Enter two numbers");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("Addition:"+(a+b));
				break;
			case '-':
				System.out.println("Enter two numbers");
				int c=sc.nextInt();
				int d=sc.nextInt();
				System.out.println("Subtraction:"+(c-d));
				break;
			case '*':
				System.out.println("Enter two numbers");
				int e=sc.nextInt();
				int f=sc.nextInt();
				System.out.println("Multiplication:"+(e*f));
				break;
			case '/':
				System.out.println("Enter two numbers");
				int g=sc.nextInt();
				int h=sc.nextInt();
				System.out.println("Divition:"+(g/h));
				break;
			case '%':
				System.out.println("Enter two numbers");
				int k=sc.nextInt();
				int l=sc.nextInt();
				System.out.println("Modulus:"+(k%l));
				break;
			default:
				System.out.println("Invalid choice");
			}
		


	}

}
