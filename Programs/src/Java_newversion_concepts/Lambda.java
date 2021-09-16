package Java_newversion_concepts;

import java.util.ArrayList;
import java.util.List;

interface RBI
{
	void setRepo();
}
interface Calc
{
	int sum(int x,int y);
}

public class Lambda {
	public static void main(String[] args) {
		
	

	RBI obj;
	obj=()->System.out.println("setting repo rate");
	obj.setRepo();
	
	Calc c1;
	c1=(int x,int y)->{
		return x+y;
	};
	System.out.println(c1.sum(10, 20));
	
	List<Integer>  l1=new ArrayList<Integer>();
	l1.add(10);
	l1.add(13);
	l1.add(15);
	l1.add(20);
	
	l1.forEach(n->System.out.println(n));
	l1.forEach(n->{ if(n%5==0) System.out.println(n);});
	}
}
