public class PTIT_CNTT3_IT203_Session06_Ex04 {
	static class Employee {
		private String id;
		private String name;
		private double salary;

		public Employee() {
			this.id = "N/A";
			this.name = "N/A";
			this.salary = 0;
		}

		public Employee(String id, String name) {
			this.id = id;
			this.name = name;
			this.salary = 0;
		}

		public Employee(String id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		public void displayInfo() {
			System.out.println("ID: " + id);
			System.out.println("Name: " + name);
			System.out.println("Salary: " + salary);
			System.out.println("----------------------");
		}
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee("E01", "An");
		Employee e3 = new Employee("E02", "Binh", 15000000);

		e1.displayInfo();
		e2.displayInfo();
		e3.displayInfo();
	}
}
