class AddSub
{
	static int a=50;
	int b=20;
	public void add(int x,int y)
	{
		while(y>0)
		{
			int carry=x&y;
			x=x^y;
			y=carry<<1;
		}
		System.out.println("Sum:"+x);
	}
	public void sub(int x,int y)
	{
		while(y>0)
		{
			int m=(~x) & y;
			x=x^y;
			y=m<<1;
		}
		System.out.println("Subtract:"+x);
	}
	public static void main(String[] args)
	{
		AddSub s=new AddSub();
		s.add(a,s.b);
		s.sub(a,s.b);				
	}
}

			


