package com.src;
import java.util.Scanner;

public class GetInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for byte datatype:");
		Byte b=sc.nextByte();
		System.out.println("Byte number:"+b);
		System.out.println("Enter a number for short datatype:");
		Short s=sc.nextShort();
		System.out.println("Short number:"+s);
		
	}

}
