package BASICS;

public class Hello {
	 
	int roll;
	String name;
	
	void set()
	{
		roll=57;
		name="rampa";
	}
    
	void display()
	{
		System.out.println("the roll is "+roll);
		System.out.println("the name is "+name);
	}
	public static void main(String[] args)
	{
		Hello h1=new Hello();
		h1.set();
		h1.display();
	}
}
