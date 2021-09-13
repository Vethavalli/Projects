package com.src;
import java.util.Scanner;

public class Largesmall {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter three numbers:");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		do 
		{
			System.out.println("1.Largest number\n2.Smallest Number");
			System.out.println("Enter ur choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					if((number1>number2) && (number1>number3))
						System.out.println(number1+"is largest");
					else if((number2>number1) && (number2>number3))
						System.out.println(number2+"is largest");
					else
						System.out.println(number3+"is largest");
					break;
				case 2:
					if((number1<number2) && (number1<number3))
						System.out.println(number1+"is smallest");
					else if((number2<number1) && (number2<number3))
						System.out.println(number2+"is smallest");
					else
						System.out.println(number3+"is smallest");
					break;
				default:
					System.out.println("Invalid choice");
			}
		}while(choice>0 && choice<3);
		
		
			

	}

}
