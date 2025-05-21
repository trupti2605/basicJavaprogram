import java.util.*;
class Kth
{
	public static void main(String args[])
	{
		int[] arr={5,8,12,7,6,3,4};
		System.out.println("orginal array" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("sorted array" + Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int kth=arr[k];
		System.out.print(kth);
		
	}
}