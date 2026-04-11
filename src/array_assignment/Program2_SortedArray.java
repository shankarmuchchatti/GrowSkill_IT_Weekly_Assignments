package array_assignment;

public class Program2_SortedArray {

	public static boolean isSorted(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 9, 8, 4, 6, 3, 5 };

		boolean result_1 = isSorted(arr1);
		boolean result_2 = isSorted(arr2);

		System.out.println(result_1);
		System.out.println(result_2);

	}

}
