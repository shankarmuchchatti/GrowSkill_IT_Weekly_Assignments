package may1_assignment;

import java.util.ArrayList;
import java.util.Collections;

class Book implements Comparable<Book> {
	int bookId;
	String bookName;
	int price;

	Book(int bookId, String bookName, int price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}

	public int getBookId() {
		return this.bookId;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBookName() {
		return this.bookName;
	}

	@Override
	public int compareTo(Book bk) {
		// TODO Auto-generated method stub
		return this.price - bk.price;
	}
}

public class BookManagementSystem {

	public static void main(String[] args) {

		ArrayList<Book> books = new ArrayList<Book>();
		Book bk1 = new Book(101, "Psychology", 350);
		Book bk2 = new Book(102, "Money Purse", 265);
		Book bk3 = new Book(103, "Rich dad Poor dad", 199);
		Book bk4 = new Book(104, "Bhagavadgita", 399);

		books.add(bk1);
		books.add(bk2);
		books.add(bk3);
		books.add(bk4);

		System.out.println("Original List ");
		for (Book bk : books) {
			System.out
					.println("Book Id : " + bk.bookId + ", Book Name : " + bk.bookName + ", Book Price : " + bk.price);
		}

		Collections.sort(books);

		System.out.println("Sorted books based on price- Ascening ");
		for (Book bk : books) {
			System.out
					.println("Book Id : " + bk.bookId + ", Book Name : " + bk.bookName + ", Book Price : " + bk.price);
		}

		int removeBookId = 102;
		books.removeIf(bk -> bk.getBookId() == removeBookId);

		System.out.println("After Removing BookId 102 :");
		for (Book bk : books) {
			System.out
					.println("Book Id : " + bk.bookId + ", Book Name : " + bk.bookName + ", Book Price : " + bk.price);
		}

		int updateBookId = 104;
		for (Book book : books) {
			if (book.getBookId() == updateBookId) {
				book.setPrice(500);
			}
		}

		System.out.println("After Updating Price : ");
		for (Book bk : books) {
			System.out
					.println("Book Id : " + bk.bookId + ", Book Name : " + bk.bookName + ", Book Price : " + bk.price);
		}

		String bookNm = "Psychology";
		for (Book book : books) {
			if (book.getBookName() == bookNm) {
				System.out.println("Book Found : " + bookNm);
			}
		}

		System.out.println("Final List :");
		for (Book bk : books) {
			System.out
					.println("Book Id : " + bk.bookId + ", Book Name : " + bk.bookName + ", Book Price : " + bk.price);
		}

	}

}
