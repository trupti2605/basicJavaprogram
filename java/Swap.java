import java.util.*;

class Swap
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
	
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the value of a & b respectively"+a+" "+b);
	}
}
	
		