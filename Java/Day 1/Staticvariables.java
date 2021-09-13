class Staticvariables
{
  	static int number1=30;
	int number2=60;
	public static void main(String[] args)
	{
		Staticvariables s=new Staticvariables();
		System.out.println(number1>s.number2?"number1 is greater":"number2 is greater");
	}
}
		