package april17_assignment;

class Vehicle {
	String brand;
	int speed;
	static String company = "Auto World Ltd";
	final String engineType = "Standard Engine";

	Vehicle(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}

	void run() {
		System.out.println("Vehicle is Running");
	}

	static void displayCompany() {
		System.out.println("Company : " + company);
	}

	final void engineType() {
		System.out.println("Engine Type : " + engineType);
	}
}

class Car extends Vehicle {
	String fuelType;

	Car(String brand, int speed, String fuelType) {
		super(brand, speed);
		this.fuelType = fuelType;
		// TODO Auto-generated constructor stub
	}

	void run() {
		super.run();
		System.out.println("Car is running smoothly");
	}

}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car("Hyundia", 120, "Petrol");
		System.out.println("Brand : " + car1.brand);
		System.out.println("Speed : " + car1.speed);
		System.out.println("Fuel Type : " + car1.fuelType);
		car1.run();
		car1.displayCompany();
		car1.engineType();
		
		String brand = "Hyundai";
		StringBuilder sb = new StringBuilder(brand);
		System.out.println("Reversed : "+sb.reverse());
		String brand1 = brand.replace("y","*");
		brand1=brand1.replace("u", "*");
		brand1 = brand1.replace("a", "*");
		brand1 = brand1.replace("i", "*");
		System.out.println("Replaced : "+brand1);
		
		System.out.println("Equals Hyundai : "+brand.equalsIgnoreCase("hyundai"));
		

	}

}
