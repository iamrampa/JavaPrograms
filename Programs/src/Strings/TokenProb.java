package Strings;

import java.util.StringTokenizer;

public class TokenProb {
	
	public static boolean isDigit(String str)
	{
		for(char ch: str.toCharArray())
		{
			if(!Character.isDigit(ch))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numb="8968987689,7684758678,7594A85758,7464785985,94749B8768";
		StringTokenizer st=new StringTokenizer(numb,",");
		int count=0;
		while(st.hasMoreTokens())
		{
			String s=st.nextToken();
			if(s.length()==10 && isDigit(s)==true)
				count++;
		}
		System.out.println(count);
		
			
		/*regex code
		 * void pproblem1() {
System.out.print("Enter phone numbers : ");
String numbers = sc.next();
StringTokenizer stz = new StringTokenizer(numbers, ",");
int c = 0;
String regex = "[0-9]+";
while(stz.hasMoreTokens()) {
if(stz.nextToken().length() == 10 && stz.nextToken().matches(regex)) {
c++;
}
}
System.out.println(c);
}


		 */
		

	}

}
