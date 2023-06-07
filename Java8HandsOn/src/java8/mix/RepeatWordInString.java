package java8.mix;

import java.util.Arrays;
import java.util.List;

public class RepeatWordInString {

	public static void main(String[] args) {
		
		String s="Hello world Hello";
		List<String> list=Arrays.asList(s.split(" "));
		//Long fsd= list.stream().map(Function.identity()).forEach(System.out::println);
	}

}
