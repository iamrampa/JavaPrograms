package collections;

import java.util.*;

public class Map3 {
	
	public Map<Character,Integer> doCount(String input)
	{
		Map<Character,Integer> m1=new TreeMap<Character,Integer>();
		int count=0;
		for(char ch : input.toCharArray())
		{
			if(m1.containsKey(ch))
				m1.put(ch,m1.get(ch)+1);
			else
				m1.put(ch,1);
		}
		return m1;
	}
	public static void main(String[] args) {
		String s1="apple";
		System.out.println(new Map3().doCount(s1));
		
	}

}
