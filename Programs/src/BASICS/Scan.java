package BASICS;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		String name;
		int age;
		String City;
		
		Scanner s=new Scanner(System.in);
		name=s.next();
		age=s.nextInt();
		City=s.next();
		System.out.println(name+" "+age+" "+City);
		s.close();
		
		// TODO Auto-generated method stub

	}

}
