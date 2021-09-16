package collections;
import java.util.*;
import java.util.Map.Entry;
public class Hashing1 {
	
public Map<Integer , Integer> doOp(int arr[][]){
	
	Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
	Map<Integer,Integer> m2=new HashMap<Integer,Integer>();
	for(int i=0;i<arr.length;i++)
	{
		 m1.put(arr[i][0],arr[i][1]);
		
	}
	for( Entry<Integer , Integer> ss : m1.entrySet())
	{
		int a=ss.getKey();
		int b=ss.getValue();
		if(m1.containsValue(a))
		{
			if(m1.containsKey(b))
			{
				m2.put(a,b);
				
			}
			if(m2.containsKey(a))
					m2.remove(b,a);
		}
		
	}
	
	
	
	return m2;
	
}
 public static void main(String[] args) {
	 int arr[][] = new int[5][2];
     arr[0][0] = 11; arr[0][1] = 20;
     arr[1][0] = 30; arr[1][1] = 40;
     arr[2][0] = 5;  arr[2][1] = 10;
     arr[3][0] = 40;  arr[3][1] = 30;
     arr[4][0] = 10;  arr[4][1] = 5;
     Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
     m1=new Hashing1().doOp(arr);
     for( Entry<Integer , Integer> ss : m1.entrySet())
     {
    	 System.out.println("the symmetric sets are {"+ss.getKey()+","+ss.getValue()+"}");
     }
    	 
   
}


}
