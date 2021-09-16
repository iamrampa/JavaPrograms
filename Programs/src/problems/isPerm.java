package problems;

import java.util.*;

public class isPerm {
	
	public int solution(int[] A)
	{
		TreeSet<Integer> h1=new TreeSet<Integer>();
		
		for(int i=0;i<A.length;i++)
			h1.add(A[i]);
		for(int i=0;i<A.length;i++)
		{
			if(!h1.contains(i+1))
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {4,1,3,2};
       System.out.println(new isPerm().solution(arr));
	}

}
