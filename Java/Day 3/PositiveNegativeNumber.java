package Day3;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		int a[]= {3,-5,5,-1,-4,5,-3,6};
		System.out.println("Positive numbers are:");
		for(int i:a)
		{
			if(i>0)
			{
				System.out.println(i);
			}
		
		}
		System.out.println("Negative numbers are:");
		for(int i:a)
		{
			if(i<0)
			{
				System.out.println(i);
			}
		
		}

	}

}
