package linkedlist.inventorymanagementsystem;

public class LinkedList {
    private Item head;

    public void addItem(String name, String id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    public void removeItem(String id) {
        if (head == null) return;

        
        if (head.itemID.equals(id)) {
            head = head.next;
            return;
        }
        
        Item temp = head;
        
        while (temp.next != null && !temp.next.itemID.equals(id)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void updateQuantity(String id, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemID.equals(id)) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Item temp = head;
        while (temp != null) {
            System.out.println("Name: " + temp.itemName + "\nID: " + temp.itemID + 
                               "\nPrice: " + temp.price + "\nQty: " + temp.quantity);
            temp = temp.next; 
        }
    }

    public void sortByName() {
        head = mergeSort(head);
    }

    private Item mergeSort(Item h) {
        if (h == null || h.next == null) return h;
        Item middle = getMiddle(h);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(h);
        Item right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    private Item sortedMerge(Item a, Item b) {
        if (a == null) return b;
        if (b == null) return a;

        Item result;
        if (a.itemName.compareToIgnoreCase(b.itemName) <= 0) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public double calculateTotalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += (temp.price * temp.quantity);
            temp = temp.next;
        }
        return total;
    }
}