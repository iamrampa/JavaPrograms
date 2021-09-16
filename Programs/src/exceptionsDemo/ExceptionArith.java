package exceptionsDemo;

class MyArithmeticException extends Exception
{
	MyArithmeticException(String msg)
	{
		super(msg);
	}
}


class Calculate
{
    void calc(int a,int b) throws MyArithmeticException
    {
        int res=0;
        try
        {
            res=a/b;
        }
        catch (ArithmeticException e)
        {
                throw new MyArithmeticException(e.getMessage());
        }
        System.out.println("Result is "+res);
    }
}

public class ExceptionArith {
	public static void main(String[] args) {
		
	

	try {
        new Calculate().calc(10, 0);
    } catch (MyArithmeticException e) {
        System.out.println(e.getMessage());
    }
}
}
