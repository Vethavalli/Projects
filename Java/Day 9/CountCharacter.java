package com.src;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) throws FileNotFoundException {
		String l = " ";
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to count its occurence");
		char c =sc.next().charAt(0);
		char c1 = Character.toUpperCase(c);
		sc = new Scanner(new FileReader("sample1.txt"));
		while(sc.hasNextLine())
		{
			l = sc.nextLine();
			for(int i = 0;i < l.length();i++)
			{
				if(l.charAt(i) == c || l.charAt(i) == c1)
					count++;
			}
		}
		System.out.println("No of occurence of "+c+":"+count);
		sc.close();
	}

}
