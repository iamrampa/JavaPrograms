package collections;

import java.util.*;
import java.util.Map.Entry;
import java.util.Map;




public class Map1 {
	public static void main(String[] args) {
		Map<String,Integer> marks=new TreeMap<String,Integer>();
		marks.put("java",90);
		marks.put("c#",89);
		marks.put("html",49);
		marks.put("python",67);
		
		System.out.println(marks);
		System.out.println(marks.containsKey("java"));
		System.out.println(marks.containsValue(49));
		System.out.println(marks.get("html"));
		System.out.println(marks.entrySet());
		
		Set<String> keys=marks.keySet();
		for(String k: keys)
		{
			System.out.println(marks.get(k));
		}
		
		for(Entry<String, Integer> ss : marks.entrySet()) 
{
	System.out.println(ss.getKey()+" "+ss.getValue());
}
		
		
	}

}
