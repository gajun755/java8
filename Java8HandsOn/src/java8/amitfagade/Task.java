package java8.amitfagade;

import java.util.HashMap;
import java.util.Map;

public class Task {

	public static void main(String[] args) {
		String s="abc";
		char [] arr=s.toCharArray();
		Map<Character, Integer> map1=new HashMap<>();
		int owels = 0;
		int consent=0;
		for(int i=0;i<s.length();i++) {
			
			if(map1.containsKey(arr[i])) {
				
				map1.put(arr[i], map1.get(arr[i])+1);
			}
			else {
				map1.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Character, Integer> s1: map1.entrySet()) {
					
					if(s1.getKey().equals('a') || s1.getKey().equals('i') || s1.getKey().equals('o')|| s1.getKey().equals('u') || s1.getKey().equals('e') ) {
							
								
						if(s1.getValue()==1) {
							owels++;
						}		
					}
					
					else {
						if(s1.getValue()==1) {
							consent++;
						}
						
					}
		}
		
		System.out.println(owels);
		System.out.println(consent);

	}

}
