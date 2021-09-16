package BASICS;

public class Wrapper {
	
	public static void main(String args[])
	{
		int x1=7;
		Integer i1=new Integer(x1);
		int y=x1;
		System.out.println(y);
		char ch='7';
		Character cha=new Character(ch);
		String chaa=cha.toString();
		int res=Integer.parseInt(chaa);
		System.out.println(res);
		
	}

}
