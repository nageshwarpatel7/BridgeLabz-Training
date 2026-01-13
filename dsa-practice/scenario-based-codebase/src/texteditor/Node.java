package texteditor;

public class Node {
	public Action action;
    public Node next;

    public Node(Action action) {
        this.action = action;
    }
}
