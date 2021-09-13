package com.src;

import java.util.Scanner;

public class OperatorsEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice,choice1,choice2,choice3;
		do
		{
			System.out.println("1. Arithmetic\n2. Relational\n3. Logical\n4. Exit");
			System.out.println("Choose from the menu");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					do {
						System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n6. goback");
						System.out.println("Enter your choice");
						choice1=sc.nextInt();
						switch(choice1)
						{
						case 1:
							System.out.println("Enter two values");
							int number1=sc.nextInt();
							int number2=sc.nextInt();
							System.out.println("Addition:"+(number1+number2));
							break;
						case 2:
							System.out.println("Enter two numbers");
							int a=sc.nextInt();
							int b=sc.nextInt();
							System.out.println("Subtraction:"+(a-b));
							break;
						case 3:
							System.out.println("Enter two numbers");
							int c=sc.nextInt();
							int d=sc.nextInt();
							System.out.println("Multiplication:"+(c*d));
							break;
						case 4:
							System.out.println("Enter two numbers");
							int e=sc.nextInt();
							int f=sc.nextInt();
							System.out.println("Division:"+(e/f));
							break;
						case 5:
							System.out.println("Enter two numbers");
							int g=sc.nextInt();
							int h=sc.nextInt();
							System.out.println("Modulus:"+(g%h));
							break;
						case 6:
							System.out.println("loop terminated.........");
							break;
						default:
							System.out.println("Invalid choice");
						}
					}while(choice1>0 && choice1<=5);
					break;
				case 2:
					do
					{
						System.out.println("1. LessThan\n2. GreaterThan\n3. Equal\n4. Go back");
						System.out.println("Enter your choice");
						choice2=sc.nextInt();
						switch(choice2)
						{
						case 1:
							System.out.println("Enter two numbers");
							int k=sc.nextInt();
							int l=sc.nextInt();
							System.out.println(k<l?k+" is smaller":l+" is smaller");
							break;
						case 2:
							System.out.println("Enter two numbers");
							int m=sc.nextInt();
							int n=sc.nextInt();
							System.out.println(m>n?m+" is greater":n+" is greater");
							break;
						case 3:
							System.out.println("Enter two values");
							int o=sc.nextInt();
							int p=sc.nextInt();
							if(o==p)
								System.out.println("Both are equal");
							else
								System.out.println("Both are not equal");
							break;
						case 4:
							System.out.println("Loop terminated");
							break;
						default:
							System.out.println("Invalid choice");
						}
					}while( choice2>0 && choice2<=3);
					break;
				case 3:
					do
					{
						System.out.println("1. LogicalAND\n2.Logical OR\n3. Goback");
						System.out.println("Enter your choice");
						choice3=sc.nextInt();
						switch(choice3)
						{
						case 1:
							System.out.println("Enter a number");
							int num=sc.nextInt();
							if(num>70 && num<=90)
								System.out.println("Both conditions should be true");
							else
								System.out.println("Only one condition may be true else both are not true");
							break;
						case 2:
							System.out.println("Enter a number");
							int num1=sc.nextInt();
							if(num1>70 || num1<=90)
								System.out.println("Either onr of the conditions can be true");
							else
								System.out.println("Both conditions are not true");
							break;
						case 3:
							System.out.println("Loop terminated");
							break;
						default:
							System.out.println("Invalid choice");
						}
					}while(choice3>0 && choice<=2);
				case 4:
					System.out.println("Loop terminated");
					
			}
		}while(choice >0 && choice<=3);
		
	}

}
