package java8.mix;

import static java.util.Comparator.comparingDouble;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Top3salaryOfEachDepartment {

	public static void main(String[] args) {

		List<Person> persons = List.of(
			    new Person(1, "Alex", 100d, new Department(1, "HR")),
			    new Person(2, "Brian", 200d, new Department(1, "HR")),
			    new Person(3, "Charles", 900d, new Department(2, "Finance")),
			    new Person(4, "David", 200d, new Department(2, "Finance")),
			    new Person(5, "Edward", 200d, new Department(2, "Finance")),
			    new Person(6, "Frank", 800d, new Department(3, "ADMIN")),
			    new Person(7, "George", 900d, new Department(3, "ADMIN")));
		
		Map<Object, Object> topEmployees =
			    persons.stream()
			                .collect(groupingBy(
			                    e -> e.getDeparment(),
			                    collectingAndThen(maxBy(comparingDouble(e -> e.getSalary())), Optional::get) 
			                ));
		
		topEmployees.forEach((x,y)->System.out.println(x.toString()+"  "+y.toString()));

	}

}
