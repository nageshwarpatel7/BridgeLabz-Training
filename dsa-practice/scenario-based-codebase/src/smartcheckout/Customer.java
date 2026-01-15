package smartcheckout;

public class Customer {
    String customerName;
    Item[] items;
    int itemCount;

    Customer(String customerName, int maxItems) {
        this.customerName = customerName;
        this.items = new Item[maxItems];
        this.itemCount = 0;
    }

    void addItem(String name, int quantity) {
        items[itemCount++] = new Item(name, quantity);
    }
}
