package java8.codedecode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class ShortCircuitOperations {

	public static void main(String[] args) {
		

			List<Integer> list=new ArrayList<Integer>();
			list.add(2);
			list.add(5);
			list.add(3);
			
			list.stream().sorted(Comparator.comparingInt(Integer::intValue)).forEach(x->System.out.println(x));
	}

}
