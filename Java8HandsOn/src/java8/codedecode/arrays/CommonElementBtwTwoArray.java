package java8.codedecode.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonElementBtwTwoArray {

	
		//Given two arrays of integers, write a java 8 program to find the common elements btw them
	//input int[] array1={1,2,3,4,5}
	//input int[] array2={4,5,6,7,8}
	
		public static void main(String[] args) {
				
			int[] array1={1,2,3,4,5};
			int[] array2={4,5,6,7,8};
			
			IntStream str1= Arrays.stream(array1);
			IntStream str2= Arrays.stream(array2);
			List<Integer> commonElements=  str1.filter(n->str2.anyMatch(n2-> n ==n2)).boxed().collect(Collectors.toList());
			commonElements.forEach(x->System.out.println(x));
			
		}
}
