package callcenter;

public class CustomerQueue {
	private Node front, rear;

    public void enqueue(Customer customer) {
        Node newNode = new Node(customer);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public Customer dequeue() {
        if (front == null) return null;

        Customer customer = front.customer;
        front = front.next;

        if (front == null) rear = null;
        return customer;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
