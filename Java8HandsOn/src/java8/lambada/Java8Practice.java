package java8.lambada;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find duplicate number in given list
		List<Integer> list=Arrays.asList(1,2,4,4,1,2,3,3);
		Set<Integer> set=new HashSet<>();
		//list.stream().filter(x->!set.add(x)).forEach(x->System.out.println(x));

		//find first element of list
		List<Integer> list1=Arrays.asList(1,2,4,4,1,2,3,3);
		//list1.stream().findFirst().ifPresent(System.out::println);
		
		//find total numbers in list
		List<Integer> list3=Arrays.asList(1,2,4,5,1,2,3,3);
		long count= list3.stream().count();
		//System.out.println("count is "+count);
		
		//find max value in given string
		List<Integer> list4=Arrays.asList(1,2,4,54,1,2,3,3);
		int max=list4.stream().max(Integer::compare).get();
		//System.out.println("max value "+max);
		
		
		//first non-repeated character
	      String input = "Java Hungry Blog Alive is Awesome";
	      Character result = input.chars() // Stream of String       
                  .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
                  .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                  .entrySet()
                  .stream()
                  .filter(entry -> entry.getValue() > 1L)
                  .map(entry -> entry.getKey())
                  .findFirst()
                  .get();
	     // System.out.println(result);
	      
	      //sort the list ascending order
	      List<Integer> list5 = Arrays.asList(10,15,8,49,25,98,98,32,15);
	      Set<Integer> set1=new HashSet<Integer>();
	      list5.stream()
	      .filter(x->set1.add(x))
	      .sorted().forEach(x->System.out.println(x));
	      
	      
	     //sort the descending order
	      List<Integer> list6 = Arrays.asList(10,15,8,49,25,98,98,32,15);
	      list6.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	      
		
		
	}

}
