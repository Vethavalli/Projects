package com.src;
import java.util.Scanner;

public class LargerNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers with double data type");
		double number1=sc.nextDouble();
		double number2=sc.nextDouble();
		System.out.println(number1>number2?number1+" is greater":number2+" is greater");
		
	}

}
