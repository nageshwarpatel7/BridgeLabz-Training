package SmartLibrary;
import java.util.*;

public class InsertionSort {
	
	public void addBook(ArrayList<String> borrowBook, String newBook) {
		borrowBook.add(newBook);
		
		int i = borrowBook.size()-1;
		
		while(i>0 && borrowBook.get(i-1).compareTo(borrowBook.get(i))>0) {
			String temp = borrowBook.get(i);
			borrowBook.set(i,borrowBook.get(i-1));
			borrowBook.set(i-1, temp);
			i--;
		}
	}
}
