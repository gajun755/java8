package java8.healtpractice;

public class SumInArray {

		public static void main(String[] args) {
			
			
			int[] arr= {1,7,3,8,2};
			int result;
			for(int i=0;i<arr.length;i++) {
				
				for(int j=0;j<arr.length;j++) {
					
					if(i==j) {
						continue;
					}
					
					result=arr[i]+arr[j];
				
					for(int k=0;k<arr.length;k++) {
						
						if(result==arr[k]) {
							System.out.println(result);
						}
					}
					
					
				}
				
			}
			
			
		}
}
