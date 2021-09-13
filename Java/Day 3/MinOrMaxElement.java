package Day3;

public class MinOrMaxElement {

	public static void main(String[] args) {
		int a[]= {5,10,15,60,30};
		int max,min;
		max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Maximum element in the array is: "+max);
		min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Minimum element in the array is: "+min);

	}

}
