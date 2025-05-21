//WAP to find the second largest and smallest element from the array
import java.util.Arrays;
class Searchele
{
	public static void main(String args[])
	{
		int[] a={4,8,9,5,4,7};
		
		Arrays.sort(a);
		System.out.println("sorted arr"+Arrays.toString(a));
		int secondlarge=a[a.length-2];
		System.out.println(secondlarge);
		int secondsmallest=a[1];
		System.out.println(secondsmallest);
	}
}