package Day3;

public class TwoDimension {

	public static void main(String[] args) {
		//Static array declaration
		/*int a[][]=new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;*/
		
		//Dynamic array declaration
		
		int a[][]= {{100,200},{300,400},{500,600}};
		
		//size of the row and column
		
		System.out.println(a.length);  //prints length of the row
		System.out.println(a[0].length); //prints no of columns
		
		//read all elements from the array
		
		//classic method
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}*/
		
		//enhanced method
		for(int r[]:a)
		{
			for(int i:r)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	}
