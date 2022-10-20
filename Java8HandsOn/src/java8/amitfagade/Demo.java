package java8.amitfagade;



class A {



	void m1() {	
		System.out.println("A m1()");

		}

		void m2( ) {
				
			System.out.println("A m2()");
		}
	}



class B extends A {



	void m1() {
		System.out.println("B m1()");
	}

	void m3() {
		System.out.println("B m3()");
	}
}



public class Demo {

	
	
	
	
	public static void main(String[] args) {
		
		A a = new B();
		a.m1();
		a.m2();
		//a.m3
		
		
		B a1 = new B();
		a1.m1();
		a1.m2();
		a1.m3();
		
		String[] array= {"K","W","A","S","A","K","I"};
		String s=array.toString();

		System.out.println(s);
		
		

	}

}
