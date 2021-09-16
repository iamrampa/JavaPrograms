package problems;

public class Binary {
	
	public int solution(int N)
	{
		String res=Integer.toBinaryString(N);
		int count=0,count1=0,flag=0;
		for(int i=0;i<res.length();i++)
		{
			if(res.charAt(i)=='1' && flag==0)
			{
				
				flag=1;
			}
			else	if(res.charAt(i)=='0'&& flag==1)
				count++;
			else if(res.charAt(i)=='1'&& flag==1)
			{
				if(count1<count)
				count1=count;
				flag=0;
				count=0;
			}
			else if(res.charAt(i)=='0'&& res.charAt(i-1)=='1' && flag==0)
			{
				count++;
				flag=1;
			}
			else
				return 0;
			
				
			
		}
		return count1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(new  Binary().solution(37));
	}

}
