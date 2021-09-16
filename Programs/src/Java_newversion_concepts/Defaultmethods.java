package Java_newversion_concepts;

interface ramp
{
	default void cool() {
		System.out.println("cool..");
	}
	void hot();
}

public class Defaultmethods implements ramp {
public void hot()
{
	System.out.println("hot..");
}
public void cool()
{
	System.out.println("very cool..");
}
public static void main(String[] args) {
	Defaultmethods d1=new Defaultmethods();
	d1.hot();
	d1.cool();
}
}
