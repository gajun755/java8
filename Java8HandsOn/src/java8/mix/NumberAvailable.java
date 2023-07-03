package java8.mix;

import java.util.Comparator;
import static java.util.Comparator.comparingDouble;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
public class NumberAvailable {

	public static void main(String[] args) {

		List<Person> persons = List.of(
			    new Person(1, "Alex", 100d, new Department(1, "HR")),
			    new Person(2, "Brian", 200d, new Department(1, "HR")),
			    new Person(3, "Charles", 900d, new Department(2, "Finance")),
			    new Person(4, "David", 200d, new Department(2, "Finance")),
			    new Person(5, "Edward", 200d, new Department(2, "Finance")),
			    new Person(6, "Frank", 800d, new Department(3, "ADMIN")),
			    new Person(7, "George", 900d, new Department(3, "ADMIN")));

	 	//Map<Department, Optional<Person>> result= persons.stream().collect(Collectors.groupingBy(Person::getDeparment,Collectors.maxBy(Comparator.comparing(Person::getSalary))));
	
	    //result.forEach((x,y)->System.out.println(x+  "  "+y));
	
		Map<Department, List<Person>> resu= persons.stream().collect(Collectors.groupingBy(Person::getDeparment));
	    //resu.forEach((x,y)->System.out.println(x+ "   "+y));
		Comparator<Person> bySalary = Comparator.comparing(Person::getSalary);
		
		/*
		 * Map<Department, Optional<Person>> re=
		 * persons.stream().collect(Collectors.groupingBy(Person::getDeparment,
		 * Collectors.reducing(BinaryOperator.maxBy(bySalary))));
		 * re.forEach((x,y)->System.out.println(x+"   "+y));
		 */
	    
	    
		/*
		 * Map<String, Long> s=
		 * persons.stream().collect(Collectors.groupingBy(Person::getName,Collectors.
		 * counting())); s.forEach((x,y)->System.out.println(x+"  "+y));
		 */
		
				//persons.stream().collect(Collectors.groupingBy(Person::getDeparment)).forEach((x,y)->System.out.println(x+"   "+y));
		
	    	 //persons.stream().sorted(Comparator.comparing(Person::getSalary).reversed()).limit(3).forEach(x->System.out.println(x));
	
		
	}
}
