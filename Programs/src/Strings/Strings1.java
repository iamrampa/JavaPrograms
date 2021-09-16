package Strings;

public class Strings1 {
	
	int findSum(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			//char a =str.charAt(i);
			if(Character.isDigit(str.charAt(i)))
			{
				sum+=Character.getNumericValue(str.charAt(i));
			   
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Strings1().findSum("R2g3h7"));

	}

}
