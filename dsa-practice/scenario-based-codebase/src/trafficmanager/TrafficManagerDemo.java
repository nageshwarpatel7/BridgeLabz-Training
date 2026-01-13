package trafficmanager;

public class TrafficManagerDemo {
	public static void main(String[] args) {
        Roundabout rb = new Roundabout(3, 5);

        rb.enter("CAR-101");
        rb.enter("CAR-102");
        rb.enter("CAR-103");
        rb.enter("CAR-104"); // goes to queue

        rb.printState();

        rb.exit();
        rb.printState();

        rb.exit();
        rb.exit();
        rb.exit();
    }

}
