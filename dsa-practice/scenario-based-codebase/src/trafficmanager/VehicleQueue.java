package trafficmanager;

public class VehicleQueue {
	private QueueNode front, rear;
    private int size;
    private int capacity;

    VehicleQueue(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(String number) {
        if (isFull()) {
            System.out.println("Queue Overflow! Vehicle " + number + " cannot enter.");
            return;
        }

        QueueNode node = new QueueNode(number);

        if (rear == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! No waiting vehicles.");
            return null;
        }

        String num = front.number;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return num;
    }
}
