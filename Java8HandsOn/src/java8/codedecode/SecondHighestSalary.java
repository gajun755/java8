package java8.codedecode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import java8.lambada.Employee;

public class SecondHighestSalary {

	public static void main(String[] args) {
	
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(101, "siva", 101, "active", 2000));
		empList.add(new Employee(102, "readdy", 101, "active", 5000));
		empList.add(new Employee(103, "raju", 102, "inactive", 6000));
		empList.add(new Employee(104, "shivam", 102, "inactive", 400000));
		empList.add(new Employee(105, "alice", 103, "active", 3500));
		empList.add(new Employee(106, "alice", 103, "inactive", 3500));
		empList.add(new Employee(107, "raju", 104, "active", 35000));
		
	System.out.println(empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst());
		//String s="abc";
		//s.codePoints().mapToObj(Character::toString).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

	}

}
