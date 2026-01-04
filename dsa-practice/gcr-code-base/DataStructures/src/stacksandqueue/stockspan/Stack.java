package stacksandqueue.stockspan;

public class Stack {
	StackNode s;
	
	public void push(int[] data) {
		StackNode newNode = new StackNode(data);
		newNode.next = s;
		s = newNode;
	}
	
	public int[] pop() {
		if(s ==null) {
			return new int[] {0,0};
		}
			int val[] = s.data;
			s = s.next;
			return val;
	}
	
	public boolean isEmpty() {
		return s==null;
	}
	
	public int[] peek() {
		return s.data;
	}
}
