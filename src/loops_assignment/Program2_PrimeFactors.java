package loops_assignment;

public class Program2_PrimeFactors {

	public static void main(String[] args) {

		int num = 60;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				int count = 0;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}

				if (count == 0) {
					System.out.print(i + " ");
				}

			}
		}
	}

}
