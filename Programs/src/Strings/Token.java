package Strings;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		
		String fruits="apple,Grape,Pineapple";
		StringTokenizer st=new StringTokenizer(fruits,",");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
