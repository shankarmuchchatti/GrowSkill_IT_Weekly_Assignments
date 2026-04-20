package april17_assignment;

class Book {
	String title;
	String author;
	static String libraryName = "City Library";
	final int isbn = 12345;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	void display() {

		System.out.println("Title : " + this.title);
		System.out.println("Author : " + this.author);

	}

	void getDescription() {
		System.out.println("This is a physical book.");
	}

	static void showLibrary() {
		System.out.println("Library : " + libraryName);

	}
}

class Ebook extends Book {
	String fileSize;

	Ebook(String title, String author, String fileSize) {
		super(title, author);
		this.fileSize = fileSize;

	}

	void getDescription() {
		super.getDescription();
		System.out.println("This is an electronic book.");
	}

}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ebook first = new Ebook("Atomic Habits", "James Clear", "5 MB");
		first.display();
		System.out.println("File Size : " + first.fileSize);
		first.getDescription();
		first.showLibrary();
		System.out.println("ISBN : " + first.isbn);

		String bookTitle = "java programming";
		System.out.println("UpperCase : " + bookTitle.toUpperCase());
		System.out.println("Length : " + bookTitle.length());
		System.out.println("Contains Java : " + bookTitle.contains("java"));

	}

}
