//write a java program to find the min and max element from the array..................
import java.util.Arrays;
class Max_min
{
	public static void main(String args[])
	{
		int[] arr={4,5,1,3,8};
		System.out.println("original array"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("sorted array"+Arrays.toString(arr));
		int min=arr[0];
		System.out.println("minimum"+min);
		int max=arr[arr.length-1];
		System.out.println("maximum"+max);
	}
}

