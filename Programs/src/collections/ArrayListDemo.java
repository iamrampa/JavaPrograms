package collections;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList();
		l1.add("Ram");
		l1.add(1);
		l1.add(20.4);
		l1.add(1,3.4);
		List l2=new ArrayList();
		l2.add(3.4);
		l2.add(2890);
		l1.addAll(2,l2);
		l2.clear();
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l1.contains(1));	
		System.out.println(l1.get(3));	
		System.out.println(l1.indexOf("Ram"));	
		System.out.println(l1.lastIndexOf(3.4));	
		l1.remove(2);
		System.out.println(l1);	
		int ram=(int)l1.get(3);
		System.out.println(ram);	
	}

}
