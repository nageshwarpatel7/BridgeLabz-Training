package BookShelf;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Library library = new Library();
		
		System.out.println("----------------Welcome to Nageshwar Library-------------------");
		int choice=1;
		do {
			
			System.out.println("Enter '1' to view books");
			System.out.println("Enter '2' to add book");
			System.out.println("Enter '3' to borrow book");
			System.out.println("Enter '4' to exit");
			String genre;
			String title;
			String author;
			double price;
			
			choice =sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				library.viewAllBooks();
				break;
			
			case 2:
				System.out.println("Enter genre type: ");
				genre = sc.nextLine();
			
				System.out.println("Enter book title: ");
				title = sc.nextLine();
				
				System.out.println("Enter author name: ");
				author = sc.nextLine();
				
				System.out.println("Enter price of book: ");
				price = sc.nextDouble();
				sc.nextLine();
				library.addBook(genre, title, author, price);
				break;
			case 3:
				System.out.println("Enter genre type: ");
				genre = sc.nextLine();
				
				System.out.println("Enter book title: ");
				title = sc.nextLine();
				
				library.removeBook(genre, title);
				break;
			case 4:
				System.out.println("Exited successfully!");
				break;
			default:
				System.out.println("Wrong choice!, enter again\n");
				break;
				
			}
		}while(choice!=4);
	}

}
