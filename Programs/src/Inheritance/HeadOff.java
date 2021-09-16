package Inheritance;

abstract class Delhi
{
	int id;
	void approval()
	{
		System.out.println("approved.");
	}
	abstract void verify(int id);
}

class Bglr extends Delhi
{
	void verify(int id)
	{
		this.id=id;
		System.out.println("verified.."+id);
	}
}

public class HeadOff {
	public static void main(String[] args) {
		Delhi d1=new Bglr();
		d1.verify(21);
	}

}
