package collections;

import java.util.*;

public class ArrayListself {
	
	public static List sort(ArrayList l1)
	{
		int temp;
		for(int i=0;i<l1.size()-1;i++)
		{
			for(int j=i+1;j<l1.size();j++)
			{
				if((int)l1.get(i)>(int)l1.get(j))
				{
					temp=(int)l1.get(i);
					l1.set(i, l1.get(j));
					l1.set(j, temp);
				}
			}
		}
		
		return l1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList l1=new ArrayList();
     
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int i=0;i<n;i++)
      {
    	  int a=s.nextInt();
    	  l1.add(a);
      }
      ArrayListself a1=new ArrayListself();
      System.out.println(a1.sort(l1));
      s.close();
      
	}

}
