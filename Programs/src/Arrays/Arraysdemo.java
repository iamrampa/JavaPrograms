package Arrays;

import java.util.Scanner;

public class Arraysdemo {
	
	public static void main(String[] args)
	{
		int arr[];
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		arr=new int[k];
		System.out.println("enter");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<k;i++)
			System.out.println(arr[i]);
		sc.close();
		
	}

}
