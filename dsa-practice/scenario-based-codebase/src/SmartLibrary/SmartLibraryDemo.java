package SmartLibrary;
import java.util.*;

public class SmartLibraryDemo {
	public static void main(String[] args) {
		ArrayList<String> borrowedBooks = new ArrayList<>();
		InsertionSort sort = new InsertionSort();

        // Already sorted list
        borrowedBooks.add("Algorithms");
        borrowedBooks.add("Data Structures");
        borrowedBooks.add("Operating Systems");

        String newBook = "Computer Networks";

        sort.addBook(borrowedBooks, newBook);

        // Display sorted list
        System.out.println("Borrowed Books (Sorted):");
        for (String book : borrowedBooks) {
            System.out.println(book);
        }
	}
}
