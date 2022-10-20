package java8.healtpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sortingprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr= {1,7,4,8,8};
		List<Integer> list=new ArrayList<>();
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(arr[1]);

	}

}
