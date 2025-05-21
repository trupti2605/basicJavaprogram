class FibonacciRecursion
{
	static int a=0,b=1,temp;
	public static void main(String args[])
	{
		System.out.println(a);
		System.out.println(b);
		FibonacciRecursion fr=new FibonacciRecursion();
		fr.printFib(10);

	}
	void printFib(int i)
	{
		if(i>1)
		{
			temp=a+b;
			System.out.println(temp);
			a=b;
			b=temp;
			printFib(i-1);
		}
	}
}
