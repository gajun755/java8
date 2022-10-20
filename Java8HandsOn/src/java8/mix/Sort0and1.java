package java8.mix;

import java.util.LinkedList;

public class Sort0and1 {

	public static void main(String[] args) {
		int[] arr= {0,1,0,1,0,1,0};
		
		
		LinkedList<Integer> add=new LinkedList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				add.addFirst(arr[i]);
			}else {
				add.addLast(arr[i]);
			}
		}

		add.forEach(x->System.out.print(x));
		
	}

}
