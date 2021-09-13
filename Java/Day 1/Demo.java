class Demo
{
	static int a=20;
	int b=30;
	public static void main(String[] args)
	{
		Demo d=new Demo();
		a=a+d.b;
		d.b=a-d.b;
		a=a-d.b;
		System.out.println("a:"+a+" "+"b:"+d.b);
}
}
		
