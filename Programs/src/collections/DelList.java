package collections;

import java.util.*;

public class DelList {
	
	public String del(String str)
	{
		List<Character> l1=new ArrayList<Character>();
		String s1="";
		
		for(int i=0;i<str.length();i++)
		{
			if(l1.contains(str.charAt(i)))
					continue;
			else
					l1.add(str.charAt(i));
		}
		for (char ch:l1)
			s1+=ch;
		return s1;
		
	}
	public String del1(String str)
	{
		Set<Character> s1=new LinkedHashSet<Character>();
		String s2="";
		for(char ch : str.toCharArray())
			s1.add(ch);
		for(char ch : s1)
			s2+=ch;
		return s2;
		
		
	}
	public static void main(String[] args) {
		System.out.println(new DelList().del1("Cassandra"));
	}

}
