package java8.codedecode;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		
		int [] arr= {1,8,7,4};
		int [] arr1= {4,2};
	
		int len=arr.length+arr1.length;
		int[] result=new int[len];
		
		for(int i=0;i<arr.length;i++) {
			result[i]=arr[i];
		}
		
		for(int i=0,k=arr.length;i<arr1.length;i++,k++) {
			result[k]=arr1[i];
		}
		
		Arrays.sort(result);
		
		for(int i=0;i<len;i++) {
			System.out.print(result[i]);
		}
			
		
		
		

	}

	

}
