package browserbuddy;

public class Node {
	public String url;
	public Node prev;
	public Node next;
	
	public Node(String url) {
		this.url = url;
	}
}
