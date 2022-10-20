package java8.healtpractice;

public class StringArrtoString {

	public static void main(String[] args) {
		// This program is about convert string array to string
		
		String [] strarr=new String[] {"K","A","W","A","S","A","K","I"};
		
		StringBuilder s = new StringBuilder();
		
		for(int i=0;i<strarr.length;i++) {
			
			s.append(strarr[i]);
		}
		
		System.out.println(s);
		
		

	}

}
