class OperatorsEx
{
	public static void main(String[] args)
	{
		int a=3,b=2;
		int c=a/b;
		System.out.println("Implicit conversion:"+c);
		double d=(double) a/(double) b;
		System.out.println("Explicit Conversion:"+d);
		System.out.println("********Relational operators*********");
		if(a>b)
			System.out.println(a+"is greater");
		else if(a<b)
			System.out.println(a+"is smaller");
		else if(a==b)
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		System.out.println("*******Logical operators*************");
		System.out.println(a^b);
		System.out.println("**********Bitwise operators**********");
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a<<b);
		System.out.println(a>>b);
		System.out.println("Negotiation:"+(~a));
		System.out.println("**************Increment and decrement operators*******");
		System.out.println("Post increment:"+ (a++));
		System.out.println("Pre increment:"+ (++a));
		System.out.println("Post decrement:"+ (b--));
		System.out.println("Pre decrement:"+ (--b));
		
	}
}

