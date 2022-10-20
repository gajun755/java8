package java8.healtpractice;

public class PrimiNumbers {

	public static void main(String[] args) {
		
			
			for(int i=2;i<=100;i++){
				
				checkprime(i);
				
			}
			
			

	}
	
	

	static void checkprime(int i) {
		
		
		boolean status=true;
		for(int j=2; j<=i/2;j++) {
			
			
			
			if(i%j==0) {
				status=false;
			}
		}
		
		if(status) {
			System.out.println(i);
		}

	
	}

}
