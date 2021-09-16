package exceptionsDemo;

class AgeException extends Exception
{
	AgeException(String msg)
	{
		super(msg);
	}
}

 class Verif123 
 {

	 void verifyAge1(int age) throws AgeException
	{
		if(age<18)
			throw new AgeException("not valid");
			else
				System.out.println("valid");
	}
 }


public class ExceptionValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Verif123 v1=new Verif123();
		try
		{
			v1.verifyAge1(12);
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
	}

}
