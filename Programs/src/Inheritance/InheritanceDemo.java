package Inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NRIaccount n1=new NRIaccount();
		n1.depositmoney();
		n1.withdrawmoney();
		n1.applyfixeddeposit();
		senioraccount n2=new senioraccount();
		n2.depositmoney();
		n2.withdrawmoney();
		n2.applyfixeddeposit();


	}

}
