package linkedlist.moviemanagement;

public class Main {
	public static void main(String[] args) {
	    DoublyLinkedList movies = new DoublyLinkedList();
	    movies.addMovieAtEnd("Inception", "Nolan", 2010, 8.8);
	    movies.addMovieAtEnd("The Matrix", "Wachowskis", 1999, 8.7);
	    movies.addMovieAtBeginning("Interstellar", "Nolan", 2014, 8.6);

	    movies.displayForward();  
	    movies.displayReverse();  
	}
}
