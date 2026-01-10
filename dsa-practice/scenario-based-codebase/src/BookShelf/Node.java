package BookShelf;

public class Node {
	public String title;
	public String author;
	public double price;
	public Node next;
	
	public Node(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.next = null;
	}
}
