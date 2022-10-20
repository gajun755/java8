package java8.lambada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeJava8practice {

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
		
		
		//Question 1.Write a program to print employee details working in each department
		Map<Integer, List<Employee>> result=	empList.stream().collect(Collectors.groupingBy(Employee::getDep_id,Collectors.toList()));
		result.forEach((x,y)->System.out.println("key:  "+x+"   "+y));
		
		//2.Write a program to print employees count working in each department
		
		 Map<Integer, Long> basedOndepartmentcount= empList.stream().collect(Collectors.groupingBy(Employee::getDep_id, Collectors.counting()));
		basedOndepartmentcount.forEach((x,y)->System.out.println(x+"    "+y));
		
		//printn count of active members
		long activeEmployee= empList.stream().filter(x->x.getStatus().equals("active")).count();
		long inactiveEmployee= empList.stream().filter(x->x.getStatus().equals("active")).count();
		System.out.println("activeEmployee"+ activeEmployee);
		System.out.println("inactiveEmployee"+inactiveEmployee);
	
		
		//calculate max and min salary
	    Optional<Employee> maxsalary= 	empList.stream().max(Comparator.comparing(Employee::getSalary));
		
			System.out.println("max salary"+maxsalary.get());
			
		//calculate min salary
	     Optional<Employee> minsalary=	empList.stream().min(Comparator.comparing(Employee::getSalary));	
	     System.out.println("min salary"+minsalary.get());
	     
	    //calculating max salary by each department
	     Map<Integer, Optional<Employee>> deptmaxsalry= empList.stream().collect(Collectors.groupingBy(Employee::getDep_id,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
	     deptmaxsalry.forEach((x,y)->System.out.println(x+"   "+y));
	     
	     
	     //find unique number
	     
	     Arrays.asList(1,2,3,4,4).stream().distinct().forEach(x->System.out.println(x));
	}

}
