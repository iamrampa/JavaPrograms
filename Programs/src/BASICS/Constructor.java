package BASICS;

public class Constructor {
	 
	int x,y,z;
	Constructor()
	{
		this(10,10);
		x=0;y=10;
		System.out.println("hi");
	}
	
	
	Constructor(int x, int y)
	{
		
		this.x=x;
		this.y=y;
		System.out.println("bye");
	}
	void add()
	{
		z=x+y;
	}
	void display()
	{
		System.out.println("the Z is"+z);
	}
	
	public static void main(String[] args)
	{
		Constructor c1=new Constructor();
		c1.add();
		c1.display();
		Constructor c2=new Constructor(20,30);
		c2.add();
		c2.display();
	}
	

}
