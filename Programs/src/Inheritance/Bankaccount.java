package Inheritance;

public class Bankaccount {

	int depositamount;
	int withdrawamount;
	double interest_rate;
	double balance;
	
	void withdrawmoney()
	{
		balance=depositamount-withdrawamount;
		System.out.println(balance);
	}
	
	void depositmoney()
	{
		System.out.println("deposit amount is "+depositamount);
	}
	
}

class NRIaccount extends Bankaccount
{
	void applyfixeddeposit()
	{
		interest_rate=6.5;
		System.out.println("the interest of nri is "+interest_rate);
	}
}

class senioraccount extends Bankaccount
{
	void applyfixeddeposit()
	{
		interest_rate=10.5;
		System.out.println("the interest of senior is "+interest_rate);
	}
}
