package com.src;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		int row,col;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		row=sc.nextInt();
		System.out.println("Enter number of columns:");
		col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter the values");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix format");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(a[i][j]%2==0)
					System.out.println(a[i][j]+" is even number");
				else
					System.out.println(a[i][j]+" is odd  number");
			}
		}
		
		

	}

}
