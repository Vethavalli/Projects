package com.src;
import java.util.Scanner;
import java.util.function.IntConsumer;

public class FizzBuzEx {
	
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		IntConsumer c = (o1) ->System.out.println(((o1 % 3 == 0) && (o1 % 5 == 0))?"FizzBuzz":(o1  % 3 == 0) ? "Fizz":(o1 % 5 == 0)?"Buzz":o1);
		c.accept(num);
		
			
	}

}
