package collections;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s1=new HashSet();
		s1.add(3);
		s1.add(3.5);
		s1.add("ram");
		s1.add(null);
		s1.add(3);
		System.out.println(s1);
		s1.remove(3);
		System.out.println(s1);
		for(Object x:s1)
			System.out.println(x);//only for each and iterator works
		
		System.out.println(s1.contains("ram"));
		System.out.println(s1.isEmpty());
	}

}
