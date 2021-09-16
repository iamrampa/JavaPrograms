package Codility;

public class Solution {
	public String solution(String S) {
		String s1="";
		for(int i=0;i<S.length();i++)
		{
			if(S.indexOf(S.charAt(i))!=S.lastIndexOf(S.charAt(i)))
			{
				
					s1+=S.charAt(i);
					break;
			}
		}
		return s1;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().solution("zz"));

	}

}
