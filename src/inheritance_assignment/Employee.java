package inheritance_assignment;

public class Employee {

	int id;
	String name;
	double basicSalary;

	Employee(int id, String name, double basicSalary) {
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	double calculateSalary() {
		double hra = (this.basicSalary * 20) / 100;
		double bonus = (this.basicSalary * 10) / 100;
		double totalSalary = this.basicSalary + bonus + hra;
		return totalSalary;

	}

	void display(double totalSalary) {

		System.out.println("Id : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("Basic Salary : " + this.basicSalary);
		System.out.println("Total Salary : " + totalSalary);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee(45, "Revanth", 30000d);
		emp.display(emp.calculateSalary());

	}

}
