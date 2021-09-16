package Streams;
import java.util.*;
import java.util.stream.Collectors;
public class Streamsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1=new ArrayList<Integer>();
		l1=Arrays.asList(1,2,3,4,5,6,7,8);
		
		List<Integer> result = l1.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(result);
		
		List<String> l2=new ArrayList<String>();
		l2=Arrays.asList("ram","rampa","potti","shru");
		List<String> res=l2.stream().filter(x->x.startsWith("r")).collect(Collectors.toList());
		System.out.println(res);
		List<String> l3=new ArrayList<String>();
		l3=Arrays.asList("ram","rampa","potti","shru");
		List<String> res1=l3.stream().sorted().collect(Collectors.toList());
		System.out.println(res1);
		l3.stream().forEach(x->System.out.println(x));
		
		//forEach,reduce
		
		
	}

}
