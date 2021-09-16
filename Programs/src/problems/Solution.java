package problems;

public class Solution {
	 public String solution(String message, int K)
	 {
		 if(message.length()<=K)
			 return message;
		 String []msg=message.split(" ");
		 String s1="";
		 //System.out.println(msg.length);
		 int sum=0,i=0,j=0;
		 for( i=0;i<msg.length;i++)
		 {
			 if(msg[i].length()<=K)
				 {
				 sum+=msg[i].length()+1;
				 //System.out.println(sum);
				 }
			 if(sum-1>K)
			 {
				 //System.out.println(sum);
				 j=i;
				 break;
			 }
			// System.out.println(j);
			
		 }
		 //System.out.println(j);
		 for(i=0;i<j;i++)
			 s1=s1+msg[i]+" ";
		  return s1;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(new Solution().solution("Why not", 21));
	}

}
