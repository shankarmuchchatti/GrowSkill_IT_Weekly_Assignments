package april24_assignment;

public class Program1_LongestCommonPrefix {

	public static void main(String[] args) {
		String[] words = { "interview", "internet", "internal", "interval" };

		String prefix = words[0];

		for (int i = 1; i < words.length; i++) {
			while (!words[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}

		}
		System.out.println(prefix);

	}
}
