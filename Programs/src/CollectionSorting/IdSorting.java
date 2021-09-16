package CollectionSorting;

import java.util.*;

public class IdSorting implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getProdid()-o2.getProdid();
	}
	
	

}
