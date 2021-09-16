package collections;
import java.util.*;

public class Hashing2 {
	
	static int LongSequence(int arr[])
	{
		 List<Integer> l1=new ArrayList<Integer>();
		 List<Integer> s2=new ArrayList<Integer>();
		 for(int i=0;i<arr.length;i++)
		 {
			 l1.add(arr[i]);
		 }
		 Collections.sort(l1);
		 int count=0,count1=0;
		 for(int i=0;i<l1.size()-1;i++)
			{
				for(int j=0;j<l1.size();j++)
				{
				if(l1.get(i)==l1.get(j)+1)
				{
					count++;
					
				}
				if(l1.get(i)!=l1.get(j)+1)
				{
					
					if(count1<count)
					{
					count1=count;
					System.out.println(count1);
					count=0;
					}
					
				}
				
				}
				//count=0;
			}
		 System.out.println(l1);
		return count1;
	}
	 public static void main(String[] args)
	    {
	        int arr[] =  {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42,45};
	        int n = arr.length;
	 
	        System.out.println(
	            "Length of the Longest "
	            + "contiguous subsequence is "
	            + LongSequence(arr));
	    }

}
