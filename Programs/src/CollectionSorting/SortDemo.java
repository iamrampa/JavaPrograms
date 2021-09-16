package CollectionSorting;

import java.util.*;

public class SortDemo {
	
	public static void main(String[] args) {
		 List<Product> l1=new ArrayList<Product>();
		 Product p1=new Product(57,"colgate",200);
		 Product p2=new Product(56,"aolgate",200);
		 Product p3=new Product(55,"dolgate",200);
		 Product p4=new Product(54,"bolgate",200);
		 
		 l1.add(p1);
		 l1.add(p2);
		 l1.add(p3);
		 l1.add(p4);
		 Collections.sort(l1,new IdSorting());
		 Collections.sort(l1,new NameSorting());
		 System.out.println(l1);
	}

}
