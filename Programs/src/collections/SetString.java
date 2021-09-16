package collections;

import java.util.*;
public class SetString {

public Set dodel(String str)
{
	Set<Character> s1=new TreeSet<Character>();
	
	char[] s3=str.toCharArray();
	
	for(int i=0;i<s3.length;i++)
		s1.add(s3[i]);
	
	return s1;
	
}



	public static void main(String[] args) {
		SetString s5=new SetString();
		Scanner sc=new Scanner(System.in);
		String s2=sc.next();
		//String s2="cassandra";
		Set<Character> s4=new TreeSet<Character>();
		s4=s5.dodel(s2);
		for(char v:s4)
			System.out.print(v);
		
	}

}
