package loops_assignment;

public class Program1_FibonacciSeries {

	public static void main(String[] args) {
		int terms = 10;
		int first = 0;
		int second = 1;
		int third;
		System.out.print(first + " " + second + " ");

		for (int n = 1; n <= terms; n++) {
			third = first + second;
			System.out.print(third + " ");
			first = second;
			second = third;
			if (third > 100) {
				break;
			}
		}

	}

}
