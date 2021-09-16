package Overload;

public class Overloadsample {
	
	int max(int x,int y)
	{
		if(x<y)
			return y;
		else
			return x;
	}


	double max(double x,double y)
	{
		if(x<y)
			return y;
		else
			return x;
	}
	
	public static void main(String[] args)
	{
		Overloadsample o1=new Overloadsample();
		System.out.println("the max is "+o1.max(10, 20));
		System.out.println("the max is "+o1.max(10.5, 20.3));
		System.out.println("the max is "+o1.max(10.5, 20));
		System.out.println("the max is "+o1.max(10, 20.2));
	}
}
