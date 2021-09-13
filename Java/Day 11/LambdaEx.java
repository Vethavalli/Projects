package com.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
 boolean check(int a);
}
class CheckNum {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
 

    public static PerformOperation isOdd(){
        return a -> (a % 2 != 0)? true:false;
    }
    
    public static PerformOperation isPrime(){
           return a ->{ 
        	   int count =0;
        	   for(int i =1; i <= a;i++)
        	   {
        		   if(a % i == 0)
        			   count ++;
        	   }
        	   if(count ==2)
        		   return true;
        	   else
        		   return false;
               };
    }

    public static PerformOperation isPalindrome() {
        return a -> {
        	int num =0,rem =0;
        	num = a;
        	while(a > 0)
        	{
        		rem = (rem*10) + a%10;
        		a=a/10;
        	}
        	if(rem == num)
        		return true;
        	else
        		return false;
        };
    }
}
public class LambdaEx{

 public static void main(String[] args) throws IOException {
  CheckNum ob = new CheckNum();
  System.out.println("The input should be in the format of first integer specifies the condition to check for ( 1 for Odd/Even, 2 for Prime, and 3 for Palindrome). "
  		+ "The second integer denotes the number to be checked.");
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the number of inputs:");
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T-- > 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
