package collections;

import java.util.*;

public class Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
		Set<Integer> s1=new TreeSet<Integer>();
		l1.add(30);
		l1.add(10);
		l1.add(20);
		l1.add(20);
		s1.addAll(l1);
		
		Iterator<Integer> itr=s1.iterator();
		while(itr.hasNext())
			{
			System.out.println(itr.next());
			}
		
		for(int v : s1)
		System.out.println(v);
		
		
		
		

	}

}
