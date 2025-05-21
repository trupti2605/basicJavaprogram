import java.util.HashSet;
import java.util.Set;

class FindDuplicates
{
	public static Set<Integer> findcommonele(int[] arr1,int[] arr2,int[]arr3)
	{
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		Set<Integer> result=new HashSet<>();

		for(int num :arr1)
		{
			
			set1.add(num);
			
		}

		for(int num :arr2)
		{
			if(set1.contains(num))
			{
				result.add(num);
			}
		}
		return result;
	}
	public static void main(String args[])
	{
		int[] arr1={1,2,3,5,10};
		int[] arr2={2,3,5,7,10};
		int[] arr3={3,5,10,15};
		
		Set<Integer> duplicate=findcommonele(arr1,arr2,arr3);
		System.out.println("common elements:"+duplicate);
	}
}

		
		