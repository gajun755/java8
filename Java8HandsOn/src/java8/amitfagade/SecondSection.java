package java8.amitfagade;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Fruit> fruits=Arrays.asList(
					
					new Fruit("Mango", 60, 400, "Yellow"),
					new Fruit("Orange", 47, 20, "Orange"),
					new Fruit("PineApple", 150, 70, "Yellow"),
					new Fruit("Apple", 250, 30, "Red")
				);
		
		//Q 1. Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.
		fruits.stream().filter(x->x.getCalories() < 100).sorted(Comparator.comparing(Fruit::getCalories)).forEach(x->System.out.println(x));
		
		//Q 2 Display color wise list of fruit names.
		
				
				
		

	}

}
