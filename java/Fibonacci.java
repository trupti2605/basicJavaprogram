class Fibonacci
{
	public static void main(String args[])
	{
		int a=0;
		System.out.println(a);
		int b=1;
		System.out.println(b);
		int temp;
		for(int i=1;i<=9;i++)
		{
			temp=a+b;
			System.out.println(temp);
			a=b;
			b=temp;
		}
	}
}