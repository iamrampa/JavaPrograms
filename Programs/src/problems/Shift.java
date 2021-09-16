package problems;
import java.util.*;
public class Shift {
	
	public int[] solution(int[] A, int K)
	{
		int n=A.length;
		
		
		int arr[]=new int[n];
		if(K==0)
			return A;
		for(int i=0;i<n;i++)
		{
			arr[(i+K)%n]=A[i];
		}
		
		
		
		
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]=new int[5];
     Scanner s=new Scanner(System.in);
     for(int i=0;i<5;i++)
    	 arr[i]=s.nextInt();
     int k=s.nextInt();
     int arr1[]=new Shift().solution(arr,k);
     for(int i=0;i<arr1.length;i++)
    	 System.out.print(arr1[i]+" ");
	}

}
