package java8.interviewprep;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.text.DateFormatter;

public class Java8Expert {

	
	public static void main(String[] args) {
		
		
		List<Emp> list=new ArrayList<Emp>();
		list.add(new Emp("Gajanan", LocalDate.of(2022, 06, 24)));
		list.add(new Emp("Gajanan", LocalDate.of(2022, 06, 23)));
		list.add(new Emp("Gajanan", LocalDate.of(2022, 06, 25)));
	
		//list.stream().sorted(Comparator.comparing(Emp::getDate).reversed()).forEach(x->System.out.println(x));
	
		
		//sort date which is in string format
		List<String> l1=new ArrayList<String>();
		String s1="06/23/2022";
		String s2="06/24/2022";
		String s3="06/25/2022";
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		Collections.sort(l1,(ss1,ss2)->LocalDate.parse(ss2,formatter).compareTo(LocalDate.parse(ss1,formatter)));
		l1.stream().forEach(x->System.out.println(x));
		
	}
}
