package com.src;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char c=sc.next().charAt(0);
		if((c=='A'||c=='E'||c=='I'||c=='O'||c=='U')||(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'))
			System.out.println("Typed character is vowel");
		else
			System.out.println("Typed character is not vowel");
	}

}
