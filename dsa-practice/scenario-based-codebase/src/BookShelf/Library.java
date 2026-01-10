package BookShelf;
import java.util.*;

public class Library {
	
	HashMap<String, LinkedList> library = new HashMap<>();
	
	public void addBook(String genre, String title, String author, double price) {
		
		if(library.containsKey(genre)) {
			LinkedList node = library.get(genre);
			node.add(title, author, price);
			
			library.put(genre, node);
			library.get(genre).display();
		}
		else {
			LinkedList node = new LinkedList();
			node.add(title, author, price);
			library.put(genre, node);
			library.get(genre).display();
		}
	}
	
	public void removeBook(String genre, String title) {
		if(library.containsKey(genre)) {
			LinkedList node = library.get(genre);
			node.remove(title);
			node.display();
		}else {
			System.out.println("No book available in this genre\n");
		}
	}
	public void viewAllBooks() {
		if(library.size()==0) {
			System.out.println("No book available.\n");
			return;
		}
		for(var v :library.entrySet()) {
			System.out.println("------------------");
			System.out.println("Genre   : "+v.getKey());
			
		}
	}
	public void borrow(String genre, String title) {
		if(library.containsKey(genre)) {
			library.get(genre).remove(title);
		}
		else {
			System.out.println("Book is not available\n");
		}
	}
}
