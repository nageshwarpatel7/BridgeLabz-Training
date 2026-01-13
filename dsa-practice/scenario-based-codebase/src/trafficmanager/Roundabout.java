package trafficmanager;

public class Roundabout {
	private Vehicle tail;
    private int count;
    private int capacity;
    private VehicleQueue waitingQueue;

    Roundabout(int capacity, int queueCapacity) {
        this.capacity = capacity;
        this.waitingQueue = new VehicleQueue(queueCapacity);
    }

    public void enter(String number) {
        if (count == capacity) {
            System.out.println("Roundabout full. Sending " + number + " to queue.");
            waitingQueue.enqueue(number);
            return;
        }

        Vehicle vehicle = new Vehicle(number);

        if (tail == null) {
            tail = vehicle;
            tail.next = tail;
        } else {
            vehicle.next = tail.next;
            tail.next = vehicle;
            tail = vehicle;
        }

        count++;
        System.out.println("Vehicle " + number + " entered roundabout.");
    }

    public void exit() {
        if (tail == null) {
            System.out.println("Roundabout empty.");
            return;
        }

        Vehicle head = tail.next;
        System.out.println("Vehicle " + head.number + " exited roundabout.");

        if (head == tail) {
            tail = null;
        } else {
            tail.next = head.next;
        }

        count--;

        String nextVehicle = waitingQueue.dequeue();
        if (nextVehicle != null) {
            enter(nextVehicle);
        }
    }

    public void printState() {
        if (tail == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        System.out.print("Roundabout: ");
        Vehicle temp = tail.next;
        do {
            System.out.print(temp.number + " → ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("(circular)");
    }
}
