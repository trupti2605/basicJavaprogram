import java.util.*;

 public class Leap
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4==0)
		{
			if(year%100!=0)
			{
				System.out.println("leap yr");
			}
			System.out.println("not leap yr");
		}
		System.out.println("leap yr");
	}
}
