package java8.lambada;

public class Employee {

		private int id;
		private String name;
		private int dep_id;
		private String status;
		private int salary;
		
		public Employee() {
			// TODO Auto-generated constructor stub
		}
		
		
		
		
		public Employee(int id, String name, int dep_id, String status, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.dep_id = dep_id;
			this.status = status;
			this.salary = salary;
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
		public int getDep_id() {
			return dep_id;
		}
		public void setDep_id(int dep_id) {
			this.dep_id = dep_id;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}




		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", dep_id=" + dep_id + ", status=" + status + ", salary="
					+ salary + "]";
		}
		
		
		
}
