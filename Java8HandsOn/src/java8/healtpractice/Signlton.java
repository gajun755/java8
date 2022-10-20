package java8.healtpractice;

import java.util.HashSet;
import java.util.Set;

public class Signlton {

	public static void main(String[] args) {
		
		demo d=demo.checkinstance();
		System.out.println(d.hashCode());
		demo d1=demo.checkinstance();
		System.out.println(d1.hashCode());
		
		Set<String> se=new HashSet<>();
		se.add("one");
		//System.out.println(se.add("one"));
	}

}


class demo{
	
	
	private demo() {
		
	}
	
	static demo d=null;
	
	
	static demo checkinstance() {
		
		if(d==null) {
			d=new demo();
		}	
		
		return d;
	}
	
}
