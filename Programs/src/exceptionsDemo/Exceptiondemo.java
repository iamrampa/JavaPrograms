package exceptionsDemo;


class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg)
	{
		super(msg);
	}
}

class verify
{

void verifyAge(int age ) throws InvalidAgeException
{
	if(age<18)
		throw new InvalidAgeException("age is less than 18");
	System.out.println("verified");
}
}

public class Exceptiondemo {
	
	public static void main(String[] args) {
		verify ver =new verify();
		try {
			ver.verifyAge(12);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}

	
}
