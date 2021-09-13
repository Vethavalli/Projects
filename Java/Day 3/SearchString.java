package Day3;

public class SearchString {

	public static void main(String[] args) {
		String s[]= {"welcome","Hello","java"};
		String a="Hii";
		boolean flag=false;
		for(String i:s)
		{
			if(i.equals(a))
			{
				System.out.println("String found");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("String not found");
		}

	}

}
