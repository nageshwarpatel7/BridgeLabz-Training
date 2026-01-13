package callcenter;
import java.util.HashMap;

public class CallCenter {
	private CustomerQueue normalQueue = new CustomerQueue();
    private PriorityCustomerQueue vipQueue = new PriorityCustomerQueue();
    private HashMap<String, Integer> callCount = new HashMap<>();

    public void receiveCall(String name, boolean isVIP) {
        callCount.put(name, callCount.getOrDefault(name, 0) + 1);

        if (isVIP) {
            vipQueue.enqueue(new Customer(name, 2));
            System.out.println("VIP Call received from " + name);
        } else {
            normalQueue.enqueue(new Customer(name, 1));
            System.out.println("Normal Call received from " + name);
        }
    }

    public void serveCall() {
        Customer customer;

        if (!vipQueue.isEmpty()) {
            customer = vipQueue.dequeue();
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.dequeue();
        } else {
            System.out.println("No calls in queue.");
            return;
        }

        System.out.println("Serving call from: " + customer.name);
    }

    public void showCallStats() {
        System.out.println("\nCall Count This Month:");
        for (String name : callCount.keySet()) {
            System.out.println(name + " → " + callCount.get(name));
        }
    }

}
