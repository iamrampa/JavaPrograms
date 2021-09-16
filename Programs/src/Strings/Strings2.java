package Strings;



public class Strings2 {
	
	public static String domethod(String str)
	{
		String ram="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='z')
				ram+='a';
			else if(str.charAt(i)=='Z')
			  ram+='A';
			else if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
				ram+=(char)(str.charAt(i));
			else
				ram+=(char)(str.charAt(i)+1); 
		}
		
		return ram;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new String("RzramAj");
		
		System.out.println(domethod(str));

	}

}
