package array_assignment;

public class Program1_SecondSmallestElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 4, 5, 6 };
		int smallest = Integer.MAX_VALUE;
		int second_smallest = Integer.MAX_VALUE;

		for (int num : arr) {
			if (num < smallest) {
				second_smallest = smallest;
				smallest = num;
			} else if (num > smallest && num < second_smallest) {
				second_smallest = num;
			}

		}

		if (second_smallest == Integer.MAX_VALUE) {
			second_smallest = smallest;
		}
		System.out.println(second_smallest);

	}

}
