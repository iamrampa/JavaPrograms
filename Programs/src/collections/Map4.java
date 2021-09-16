package collections;

import java.util.*;
import java.util.Map.Entry;

public class Map4 {
	
	public Map<String,Integer> domul(Map<String,Integer> m1,Map<String,Integer> m2)
	{
		Map<String,Integer> m3=new HashMap<String,Integer>();
		m3.putAll(m1);
		for(String k: m2.keySet())
		{
			if(m3.containsKey(k))
				m3.put(k, Math.max(m3.get(k),m2.get(k) ));
				else
					m3.put(k, m2.get(k));
		}
		
		return m3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("sandy",98);
		m1.put("sim", 87);
		m1.put("sai", 23);
		m1.put("ser", 12);
		
		
		Map<String,Integer> m2=new HashMap<String,Integer>();
		m2.put("sandy",12);
		m2.put("sim", 23);
		m2.put("sai", 67);
		m2.put("chot", 99);
		System.out.println(new Map4().domul(m1, m2));
		
		

	}

}
