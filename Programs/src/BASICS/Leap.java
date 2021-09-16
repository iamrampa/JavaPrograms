package BASICS;

public class Leap {
	
	
	int isLeap(int a)
	{
		
		 if(a%4==0 ||a%400==0)
			return 0;
		else if(a%100==0)
			return 1;
		else
			return 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leap l1=new Leap();
		System.out.println(l1.isLeap(2000));

	}

}
