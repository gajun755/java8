package java8.healtpractice;

import java.util.HashMap;
import java.util.Map;

public class Frequencyofcharacter {

	public static void main(String[] args) {
		char[] arr= {'a','b','a','c','b'};
		
		
		Map<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
			}
			
			else {
				
				map.put(arr[i], 1);
			}
			
		}
		
		map.forEach((x,y)->System.out.println("key   "+x+"   "+"Value  "+y));
		

	}

}
