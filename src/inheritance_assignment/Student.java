package inheritance_assignment;

public class Student extends Person {
	int marks;

	Student(String name, int age, int marks) {
		super(name, age);
		this.marks = marks;
	}

	void display() {
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Marks : " + this.marks);
	}

	public static void main(String[] args) {

		Student std = new Student("Rajat", 27, 95);
		std.display();

	}

}
