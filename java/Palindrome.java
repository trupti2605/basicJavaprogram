import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int rem,rev=0;
		while(temp!=0)
		{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		
		}
		System.out.println(rev);

		if(n==rev)
		{
			System.out.println("palindrome number");
		}
		else
			System.out.println("Not palindrome number");

		

	}
}