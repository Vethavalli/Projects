package Day3;

public class SortArray {

	public static void main(String[] args) {
		int a[]= {2,10,5,4,12,7};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i:a)
			System.out.print(i+" ");

	}

}
