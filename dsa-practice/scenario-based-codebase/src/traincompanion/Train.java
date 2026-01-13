package traincompanion;

public class Train {
	private Compartment head;
    private Compartment tail;
    private Compartment current;

    // Add compartment at end
    public void addCompartment(String name, boolean pantry, boolean wifi) {
        Compartment newComp = new Compartment(name, pantry, wifi);

        if (head == null) {
            head = tail = current = newComp;
            return;
        }

        tail.next = newComp;
        newComp.prev = tail;
        tail = newComp;
    }

    // Remove a compartment
    public void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } 
                else if (temp == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } 
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                if (current == temp) {
                    current = head;
                }

                System.out.println(name + " compartment removed.");
                return;
            }
            temp = temp.next;
        }
    }

    // Move forward
    public void moveForward() {
        if (current != null && current.next != null) {
            current = current.next;
            displayCurrent();
        } else {
            System.out.println("No next compartment.");
        }
    }

    // Move backward
    public void moveBackward() {
        if (current != null && current.prev != null) {
            current = current.prev;
            displayCurrent();
        } else {
            System.out.println("No previous compartment.");
        }
    }

    // Display current and adjacent compartments
    public void displayCurrent() {
        System.out.println("\nYou are at: " + current.name);

        if (current.prev != null)
            System.out.println("Previous: " + current.prev.name);
        else
            System.out.println("Previous: None");

        if (current.next != null)
            System.out.println("Next: " + current.next.name);
        else
            System.out.println("Next: None");

        System.out.println("Services → Pantry: " +
                (current.pantry ? "Yes" : "No") +
                ", WiFi: " + (current.wifi ? "Yes" : "No"));
    }

    // Search service
    public void searchService(String service) {
        Compartment temp = head;

        while (temp != null) {
            if ((service.equalsIgnoreCase("pantry") && temp.pantry) ||
                (service.equalsIgnoreCase("wifi") && temp.wifi)) {

                System.out.println(service + " available in " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println(service + " not found in train.");
    }
}
