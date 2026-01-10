package BookShelf;

public class LinkedList {
	Node head =null;
	
	public void add(String title, String author, double price) {
		Node newNode = new Node(title, author, price);
		if(head==null) {
			head= newNode;
			System.out.println("Book added sucessfully\n");
			return;
		}
		Node curr = head;
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next = newNode;
		System.out.println("Book added sucessfully!\n");
	}
	
	public void remove(String Book) {
		if(head==null) {
			System.out.println("No Book available\n");
			return;
		}
		if(head.title.equalsIgnoreCase(Book)) {
			head = head.next;
			System.out.println("Book removed successfully!\n");
			return;
		}
		Node curr = head;
		while(curr.next!=null) {
			if(curr.next.title.equalsIgnoreCase(Book)) {
				curr.next = curr.next.next;
				System.out.println("Book removed successfully!\n");
				return;
			}
			curr=curr.next;
		}
		System.out.println("Book not found!\n");
	}
	
	public void display() {
		Node dummy = head;
		System.out.println("--------------Book available in this genre---------------");
		while(dummy!=null) {
			System.out.println("title   : "+dummy.title);
			System.out.println("Author  : "+dummy.author);
			System.out.println("Price   : "+dummy.price);
			System.out.println();
			dummy = dummy.next;
		}
	}
}
