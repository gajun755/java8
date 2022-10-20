package java8.lambada;

import java.util.ArrayList;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		
		list.stream().filter(x->x.endsWith("o")).forEach(x->System.out.println(x));
		

	}

}
