package problems;

public class Parts {
	
	public int solution(int[] A)
	{
		int sum2=0;
		int sum1=A[0];
		for(int i=1;i<A.length;i++)
		{
			sum2+=A[i];
		}
		int diff=Math.abs(sum1-sum2);
		int g,diff2;
		for(g=1;g<A.length-1;g++)
		{
			sum1=sum1+A[g];
			sum2-=A[g];
			diff2=Math.abs(sum1-sum2);
			if(diff>diff2)
            diff=diff2;
				
		}
		return diff;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {3,1,2,4,3};
		System.out.println(new Parts().solution(ar));
	}

}
