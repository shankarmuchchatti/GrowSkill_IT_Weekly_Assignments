package loops_assignment;

public class Program3_DigitTransformation {

	public static void main(String[] args) {
		int number = 57243;
		int place_number = 1;
		int new_number = 0;
		int value = 1;

		while (number > 0) {
			int digit = number % 10;
			int new_digit;
			if (place_number % 2 != 0 && digit <= 4) {
				new_digit = digit * 2;
			} else if (place_number % 2 == 0) {
				new_digit = 1;
			} else {
				new_digit = digit;
			}

			new_number = new_number + (new_digit * value);
			value = value * 10;
			place_number++;
			number = number / 10;

		}
		System.out.println(new_number);

	}

}
