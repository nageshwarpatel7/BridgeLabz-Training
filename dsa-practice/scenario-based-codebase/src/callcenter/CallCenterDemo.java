package callcenter;

public class CallCenterDemo {
	public static void main(String[] args) {
        CallCenter center = new CallCenter();

        center.receiveCall("Amit", false);
        center.receiveCall("Neha", true);
        center.receiveCall("Ravi", false);
        center.receiveCall("Neha", true);

        center.serveCall();
        center.serveCall();
        center.serveCall();

        center.showCallStats();
    }

}
