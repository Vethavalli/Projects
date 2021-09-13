package Day3;

public class SearchElement {

	public static void main(String[] args) {
		int a[]= {100,200,300,400,500};
		int n=209;
		boolean flag=false;
		for(int i:a)
		{
			if(i==n)
			{
				System.out.println("Element found");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}

	}

}
