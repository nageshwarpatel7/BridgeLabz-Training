package smartcheckout;

public class CustomerQueue {
    Customer[] queue;
    int front, rear, size, capacity;

    CustomerQueue(int capacity) {
        this.capacity = capacity;
        queue = new Customer[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(Customer customer) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear] = customer;
        size++;
    }

    Customer dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        Customer customer = queue[front];
        front++;
        size--;
        return customer;
    }

    boolean isEmpty() {
        return size == 0;
    }
}
