package collections;

import java.util.*;
import java.util.Map.Entry;

public class Map2 {
	List<String> getPassed(Map<String,Integer> input)
	{
		List<String> l1=new ArrayList<String>();
		for(Entry<String, Integer> sss: input.entrySet())
			{
			if(sss.getValue()>70)
			 l1.add(sss.getKey());
			}
		return l1;
		
	}

	public static void main(String[] args) {
		Map<String,Integer> name =new HashMap<String,Integer>();
		name.put("ragav",71);
		name.put("ram", 87);
		name.put("bha", 37);
		System.out.println(new Map2().getPassed(name));
		
	}
}
