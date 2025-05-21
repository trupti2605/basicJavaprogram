import java.util.*;
class Armstrong	
{
	public static void main(String args[])
	{
		for(int no=1;no<=1000;no++)//this is for to print armstrong number from 1-1000 -->if find only the number is armstrong or not
 then assing the value to no and check in if condition at last after the arm printitng check no==arm or not and remove given for loop
		{
		int temp=no;
		int len=0;
		while(temp!=0)	
		{
			temp=temp/10;
			len=len+1;
		}
		int temp1=no;
		int rem;
		
		
		int arm=0;
		while(temp1!=0)
		{
			
			int mult=1;
			rem=temp1%10;
			for(int i=1;i<=len;i++)
			{
				mult=mult*rem;
			}
			arm=arm+mult;
			temp1=temp1/10;
		}
		if(no==arm)
		{
			System.out.println(no);
		}

}
			
		
		
	}

}