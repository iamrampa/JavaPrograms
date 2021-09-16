package Inheritance;

 class Bank1 {

	
	double interest_rate;
	Bank1()
	{
		System.out.println("bNK1");
	}
	Bank1(String name)
	{
		this();
		System.out.println("name");
	}
	void set_interest()
	{
		System.out.println("the bank deposit is"+interest_rate);
	}
}

 class Sbi extends Bank1
 {
	 Sbi()
	 {
		 super("name");
		 System.out.println("sbi");
	 }
	 
	 void set_interest()
	 {
		 super.set_interest();
		 System.out.println("sbi deposit is"+interest_rate);
	 }
 }
 
 class Icici extends Bank1
 {
	 void set_interest()
	 {
		 System.out.println("icici deposit is"+interest_rate);
	 }
	 
	 
 }
 
public class Bank
{
	public static void main(String[] args)
	{
		Bank1 i1=new Sbi();
		i1.set_interest();
	}
}