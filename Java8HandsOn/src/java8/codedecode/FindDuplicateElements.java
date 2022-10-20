package java8.codedecode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import java8.lambada.Employee;

public class FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(101, "siva", 101, "active", 2000));
		empList.add(new Employee(102, "readdy", 101, "active", 5000));
		empList.add(new Employee(103, "raju", 102, "inactive", 6000));
		empList.add(new Employee(104, "shivam", 102, "inactive", 400000));
		empList.add(new Employee(105, "alice", 103, "active", 3500));
		empList.add(new Employee(106, "alice", 103, "inactive", 3500));
		empList.add(new Employee(107, "raju", 104, "active", 35000));
		
		//find duplicate name from above list
		List<String> namesInRepo=empList.stream().map(emp->emp.getName()).collect(Collectors.toList());;
		Set<String> uniqueNames=new HashSet<>();
		Set<String> duplicateNames= namesInRepo.stream().filter(name->!uniqueNames.add(name)).collect(Collectors.toSet());
		//duplicateNames.stream().forEach(x->System.out.println(x));
		//uniqueNames.forEach(x->System.out.println(x));
		
		//grouping by clause
		Map<String,Long> mapofnames=  namesInRepo.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Set<String> names= mapofnames.entrySet().stream().filter(e->e.getValue()>1).map(entr->entr.getKey()).collect(Collectors.toSet());
			//names.forEach(x->System.out.println(x));
		//mapofnames.forEach((x,y)->System.out.println(x+"   "+y));
		
		
		//third way
		  List<String> namesInRepo1= empList.stream().map(x->x.getName()).collect(Collectors.toList());
		  Set<String> names12= namesInRepo.stream().filter(name->Collections.frequency(namesInRepo1, name) > 1).collect(Collectors.toSet());
		 
		  names12.forEach(x->System.out.println(x));
		  
		  
		 //find active employee who name is alice
		  List<Employee> result= empList.stream().filter(x->x.getStatus().equals("active")).filter(x->x.getName().equals("alice")).collect(Collectors.toList());
		  result.forEach(x->System.out.println(x));
	}

}
