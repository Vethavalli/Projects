package com.src;

import java.util.Scanner;

public class ScientificCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division"
					+ "\n5. log\n6. sin\n7. Cos\n8.tan\n9.Power\n10.Squareroot\n11. Ceil value\n12. Floor value"
					+ "\n13. Round value\n14. Angle to degree \n15. Angle to radians\n16. Minimum value\n17. Maximum value"
					+ "\n18. Exponent\n19. Square\n20. Exit ");
			System.out.println("Choose form the above menu to perform operations....");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter two values:");
				int number1 = sc.nextInt();
				int number2 = sc.nextInt();
				System.out.println("Addition:"+(number1+number2));
				break;
			case 2:
				System.out.println("Enter two values:");
				int number3 = sc.nextInt();
				int number4 = sc.nextInt();
				System.out.println("Subtraction:"+(number3-number4));
				break;
			case 3:
				System.out.println("Enter two values:");
				int number5 = sc.nextInt();
				int number6 = sc.nextInt();
				System.out.println("Multiplication:"+(number5*number6));
				break;
			case 4:
				System.out.println("Enter two values:");
				int number7 = sc.nextInt();
				int number8 = sc.nextInt();
				System.out.println("Division:"+(number7/number8));
				break;
			case 5:
				System.out.println("Enter a number to find log value");
				double number9 = sc.nextDouble();
				System.out.println("Log value:"+Math.log(number9));
				break;
			case 6:
				System.out.println("Enter a number to find sin value:");
				double number10 = sc.nextDouble();
				System.out.println("Sin value:"+Math.sin(number10));
				break;
			case 7:
				System.out.println("Enter a number to find cos value:");
				double number11 = sc.nextDouble();
				System.out.println("Cos value:"+Math.cos(number11));
				break;
			case 8:
				System.out.println("Enter a number to find tan value:");
				double number12 = sc.nextDouble();
				System.out.println("Tan value:"+Math.tan(number12));
				break;
			case 9:
				System.out.println("Enter a number to find power:");
				double number13 = sc.nextDouble();
				System.out.println("Enter the power value");
				double number14 = sc.nextDouble();
				System.out.println("Result:"+Math.pow(number13,number14));
				break;
			case 10:
				System.out.println("Enter a number to find squareroot:");
				double number15 = sc.nextDouble();
				System.out.println("SquareRoot value:"+Math.sqrt(number15));
				break;
			case 11:
				System.out.println("Enter a number to find ceiling value:");
				double number16 = sc.nextDouble();
				System.out.println("Ceil value:"+Math.ceil(number16));
				break;
			case 12:
				System.out.println("Enter a number to find Floor value:");
				double number17 = sc.nextDouble();
				System.out.println("Floor value:"+Math.floor(number17));
				break;
			case 13:
				System.out.println("Enter a number to find round off value:");
				double number18 = sc.nextDouble();
				System.out.println("Round off value:"+Math.round(number18));
				break;
			case 14:
				System.out.println("Enter a Angle to convert to degree:");
				double number19 = sc.nextDouble();
				System.out.println("Angle to degree:"+Math.toDegrees(number19));
				break;
			case 15:
				System.out.println("Enter a Angle to convert to radians:");
				double number20 = sc.nextDouble();
				System.out.println("Angle to radian:"+Math.toRadians(number20));
				break;
			case 16:
				System.out.println("Enter two values to find minimum:");
				double number21 = sc.nextDouble();
				double number22 = sc.nextDouble();
				System.out.println("Minimum value:"+Math.min(number21, number22));
				break;
			case 17:
				System.out.println("Enter two values to find maximum:");
				double number23 = sc.nextDouble();
				double number24 = sc.nextDouble();
				System.out.println("Maximum value:"+Math.max(number23, number24));
				break;
			case 18:
				System.out.println("Enter a number to find exponent:");
				double number25 = sc.nextDouble();
				System.out.println("Exponent:"+Math.exp(number25));
				break;
			case 19:
				System.out.println("Enter a number to find square:");
				int number26=sc.nextInt();
				System.out.println("Square of a number:"+(number26*number26));
				break;
			case 20:
				System.out.println("Loop terminated------------------");
				break;
			default:
				System.out.println("Invalid choice......");
				
			}
		}while(choice > 0 && choice <=19);
		
	}

}
