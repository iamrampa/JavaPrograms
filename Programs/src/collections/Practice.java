package collections;

import java.util.*;

public class Practice {
	
	List returnList(String input)
	{
		ArrayList l1=new ArrayList();
		String var[]=input.split(",");
		for(int i=0;i<var.length;i++)
			l1.add(var[i]);
		for(int i=0;i<l1.size();i++)
		{
			String s1=(String)l1.get(i);
			String s2=s1.substring(0,1);
			String s3=s1.substring(1);
			s2=s2.toUpperCase();
			s1=s2+s3;
			l1.set(i,s1);
		}
		
		return l1;
		
	}
	public static void main(String[] args) {
		String input="apple,grapes,banana,lemon";
		System.out.println(new Practice().returnList(input));
	}

}
