package exceptionsDemo;

class SalaryNegativeException extends Exception
{
	SalaryNegativeException(String msg)
	{
		super(msg);
	}
	
}
class SalaryOutOfBoundsException extends Exception
{
	

	SalaryOutOfBoundsException(String msg)
	{
		super(msg);
	}
	
}

class Verify12 

{
	 void verifySal(int sal) throws SalaryNegativeException, SalaryOutOfBoundsException
	 {
		 if(sal<0)
			 throw new SalaryNegativeException("Negative Salary");
		else if(sal<1000 || sal>5000)
			 throw new SalaryOutOfBoundsException("salary is not in range");
		else
			System.out.println("salary is in range");
		 
}
}

public class Exceptionsalary {
	public static void main(String[] args) {
		Verify12 ver=new Verify12();
		try
		{
			ver.verifySal(6000);
		}
		
		catch(SalaryNegativeException e)
		{
			System.out.println(e.getMessage());
		}
		catch(SalaryOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
	


