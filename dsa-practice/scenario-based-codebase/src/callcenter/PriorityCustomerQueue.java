package callcenter;

public class PriorityCustomerQueue {
	private Node head;

    public void enqueue(Customer customer) {
        Node newNode = new Node(customer);

        if (head == null || customer.priority > head.customer.priority) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null &&
               current.next.customer.priority >= customer.priority) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public Customer dequeue() {
        if (head == null) return null;

        Customer customer = head.customer;
        head = head.next;
        return customer;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
