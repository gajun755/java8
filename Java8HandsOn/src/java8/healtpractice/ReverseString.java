package java8.healtpractice;



class Reves{
	
	
	public String reversestring(String s) {
		
		if(s.isEmpty()) {
			return s;
		}
		
		else {
			
			return reversestring(s.substring(1))+s.charAt(0);
		}
		
		
	}
	
	
}


public class ReverseString {

	public static void main(String[] args) {
		
		Reves s=new Reves();
		System.out.println(s.reversestring("Gajanan"));
		
	}
}
