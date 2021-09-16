package problems;
import java.util.*;


public class Unpaired {

	
		public int solution(int[] A) 
		{  HashMap<Integer,Integer> hmap = new HashMap<>();   
		for(int i = 0; i < A.length; i++) 
		{  if(hmap.containsKey(A[i])) 
		{  
			int val = hmap.get(A[i]); 
		hmap.put(A[i], val + 1); 
		} 
		else  hmap.put(A[i], 1); 
		}  for(Integer a:hmap.keySet()) 
		{  if(hmap.get(a) % 2 != 0) 
			return a;  
		} 
		return -1;
		}
			
	
	
	public static void main(String[] args) {
		int ar[]= {1,2,1,2,3};
		System.out.println(new Unpaired().solution(ar));
	}
}
