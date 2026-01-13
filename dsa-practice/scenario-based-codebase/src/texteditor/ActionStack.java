package texteditor;

public class ActionStack {
	private Node top;

    public void push(Action action) {
        Node node = new Node(action);
        node.next = top;
        top = node;
    }

    public Action pop() {
        if (top == null) return null;
        Action action = top.action;
        top = top.next;
        return action;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void clear() {
        top = null;
    }
}
