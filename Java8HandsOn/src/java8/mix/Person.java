package java8.mix;

public class Person {

	
		int id;
		
		String name;
		
		double salary;
		
		Department deparment;

		public Person(int id, String name, double salary, Department deparment) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.deparment = deparment;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public Department getDeparment() {
			return deparment;
		}

		public void setDeparment(Department deparment) {
			this.deparment = deparment;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", salary=" + salary + ", deparment=" + deparment + "]";
		}
		
		
		
}
