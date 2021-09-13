package Day4;

import java.util.Scanner;

public class CountCharOccurence {

	public static void main(String[] args) {
		int count=0;
		Scanner sc =new Scanner(System.in);
		char c='e';
		String s="welcome";
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)==c)
			{
				count++;
			}
		}
		System.out.println("character occurence:"+count);
		
		
		

	}

}
