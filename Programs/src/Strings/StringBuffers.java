package Strings;

public class StringBuffers {
	
	public static void main(String[] args) {
		StringBuffer stb=new StringBuffer("Virat");
		stb.setCharAt(0, 'M');
		stb.insert(0,"captain");
		stb.delete(0, 3);
		//stb.replace(0, 6, "v");
		//stb.insert(1,"i");
		System.out.println(stb);
	}

}
