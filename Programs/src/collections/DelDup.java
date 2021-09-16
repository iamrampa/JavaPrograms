package collections;

import java.util.*;

public class DelDup {
	
	public List dodup(ArrayList l1)
	{
		for(int i=0;i<l1.size()-1;i++)
		{
			for(int j=0;j<l1.size();j++)
			{
			if(l1.get(i)==l1.get(j))
			{
				l1.remove(l1.get(j));
			}
			}
		}
		
		return l1;
	}
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=s.nextInt();
			l1.add(a);
		}
		System.out.println(new DelDup().dodup(l1));
	}

}
