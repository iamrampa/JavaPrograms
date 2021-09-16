package problems;

import java.util.HashSet;

public class FrogTime {

	 public int solution(int X, int[] A)
	 {
		 HashSet<Integer> h1=new HashSet<Integer>();
		 for(int i=0;i<A.length;i++) {
			 if(A[i]<=X)
			 {
				 h1.add(A[i]);
			 }
			 if(h1.size()==X)
				 return i;
		 }
		 return 0;
	 }
	 public static void main(String[] args) {
		int arr[]= {1,3,1,4,2,3,5,4};
		System.out.println(new FrogTime().solution(5, arr));
	}
	
}
