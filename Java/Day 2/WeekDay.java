package Day2;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num==1)
			System.out.println("sunday");
		else if(num==2)
			System.out.println("monday");
		else if(num==3)
			System.out.println("tuesday");
		else if(num==4)
			System.out.println("wednesday");
		else if(num==5)
			System.out.println("thursday");
		else if(num==6)
			System.out.println("friday");
		else
			System.out.println("saturday");
	}

}
