package java8.codedecode.arrays;

import java.util.Arrays;

public class FetchSecondSmallest {

	public static void main(String[] args) {
		
			int[] numbers= {5,2,8,3,1};
			Arrays.stream(numbers).sorted().skip(1).limit(1).forEach(x->System.out.println(x));
		
	}
	
}
