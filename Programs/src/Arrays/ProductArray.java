package Arrays;

import java.util.Scanner;

public class ProductArray {
	

	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter No of Products:");
	    int prodsCount=sc.nextInt();
	   
	    Product []prodArray=new Product[prodsCount]; // Making Object Array [Product ]
	   
	    int prodid ; String name ;  int price;
	    for(int x=0;x<prodArray.length;x++)
	    {
	        System.out.println("Enter Product ["+(x+1)+"] Info:");
	        System.out.print("ProdID:");
	        prodid=sc.nextInt();
	        System.out.print("Name:");
	        name=sc.next();
	        System.out.print("Price:");
	        price=sc.nextInt();
	       
	        prodArray[x]=new Product(prodid,name,price);   
	    }
	    System.out.println(" Product Details..");
	    for(int x=0;x<prodArray.length;x++)
	    {
	        System.out.println(prodArray[x]);
	    }
	    sc.close();
	   
	}
}


