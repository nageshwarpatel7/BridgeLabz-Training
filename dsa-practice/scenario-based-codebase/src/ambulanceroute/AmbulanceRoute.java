package ambulanceroute;

public class AmbulanceRoute {
	
	private UnitNode head = null;

    public void addUnit(String name, boolean available) {
        UnitNode newNode = new UnitNode(name, available);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        UnitNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }
    public void findAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units available.");
            return;
        }

        UnitNode current = head;
        do {
            if (current.available) {
                System.out.println("Redirect patient to: " + current.name);
                return;
            }
            current = current.next;
        } while (current != head);

        System.out.println("All units are currently unavailable.");
    }

    public void removeUnit(String name) {
        if (head == null) return;

        UnitNode current = head;
        UnitNode prev = null;

        do {
            if (current.name.equals(name)) {

                if (current.next == head && current == head) {
                    head = null;
                    return;
                }

                if (current == head) {
                    UnitNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = current.next;
                }

                System.out.println(name + " removed (maintenance).");
                return;
            }

            prev = current;
            current = current.next;
        } while (current != head);
    }

    public void displayUnits() {
        if (head == null) {
            System.out.println("No units in route.");
            return;
        }

        UnitNode temp = head;
        do {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to " + head.name + ")");
    }
}
