package java8.healtpractice;



class A{
	void m1() {
		System.out.println("A m1()");
	}
	
	void m2() {
		System.out.println("A m2()");
	}
	
}


class B extends A{
		
		void m1() {
			System.out.println("B m1()");
		}
		
		void m3() {
			
			System.out.println("B m3()");
		}
	
}


public class Kp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new B();
		a.m1();
		a.m2();
		 //a.m3();
		
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
	}

}
