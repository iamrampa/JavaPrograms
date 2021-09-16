package problems;

public class FrogJumps {
	
	 public int solution(int X, int Y, int D)
	 { 
		 if ((Y - X) % D == 0) {
		    return (Y - X) / D;
	 }
	 return (Y - X) / D + 1;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(new FrogJumps().solution(10, 85,30));
		
		
	}

}
