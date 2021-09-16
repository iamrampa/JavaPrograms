package Inheritance;

interface Bank2
{
    void withdraw();																																																																																														
   
	void deposit();
}

interface Vaccination
{
	void numbervaccEmp();
}
class Axis implements Bank2,Vaccination
{
	public void withdraw()
	{
		System.out.println("withdrawn");
	}
	public void deposit()
	{
		System.out.println("deposited");
	}
	public void numbervaccEmp()
	{
		System.out.println(1200);
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Axis a1=new Axis();
	   a1.withdraw();
		a1.deposit();
		a1.numbervaccEmp();
	}

}
