package datatypes_assignment;

public class Problem2 {

	public static void main(String[] args) {
		char character = 'A';
		int value = character;
		System.out.println("ASCII Value : "+value);
		int new_value = value+5;
		System.out.println("New ASCII Value : "+new_value);
		char new_character = (char) new_value;
		System.out.println("New Character : "+new_character);
	}

}
