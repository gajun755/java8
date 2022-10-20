package java8.lambada;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

public class InterviewJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(101, "siva", 101, "active", 2000));
		empList.add(new Employee(102, "readdy", 101, "active", 5000));
		empList.add(new Employee(103, "raju", 102, "inactive", 6000));
		empList.add(new Employee(104, "shivam", 102, "inactive", 400000));
		empList.add(new Employee(105, "bob", 103, "active", 3500));
		empList.add(new Employee(106, "alice", 103, "inactive", 3500));
		empList.add(new Employee(107, "srinu", 104, "active", 35000));
		
		//empList.stream().distinct().forEach(x->System.out.println(x));
		 List<Integer> list= empList.stream().map(emp->emp.getId()).collect(Collectors.toList());
		 IntSummaryStatistics summry= list.stream().mapToInt(x->x).summaryStatistics();
		 
		 System.out.println(summry.getMax());
	}

}
