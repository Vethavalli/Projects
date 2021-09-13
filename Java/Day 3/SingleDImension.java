package Day3;

public class SingleDImension {

	public static void main(String[] args) {
		//Declaration
		//Static array
		/*int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		//Dynamic array declaration
		int a[]= {100,200,300,400,500};
		//size of an array
		System.out.println(a.length);
		//read all elements in the array
		//classic for loop
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//enhanced for loop
		/*for(int i:a)
		{
			System.out.println(i);
		}*/

	}

}
