package april24_assignment;

abstract class Payment {
	int amount;

	abstract void makePayment();

	void paymentDetails(int amount) {
		this.amount = amount;
		System.out.println("Payment Amount : " + amount);
	}
}

class CreditCardPayment extends Payment {
	void makePayment() {
		System.out.println("Paid " + super.amount + " using Credit Card ending with 1234");
	}
}

class UpiPayment extends Payment {

	void makePayment() {
		System.out.println("Paid " + super.amount + " using UPI ID: user@upi");

	}

}

public class Program2_AbstractClass {

	public static void main(String[] args) {
		CreditCardPayment crd = new CreditCardPayment();
		crd.paymentDetails(5000);
		crd.makePayment();

		UpiPayment upi = new UpiPayment();
		upi.paymentDetails(1500);
		upi.makePayment();

	}

}
