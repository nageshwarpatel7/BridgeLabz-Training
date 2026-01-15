package smartcheckout;

public class Main {
    public static void main(String[] args) {
        ProductMap productMap = new ProductMap(10);
        productMap.put("Apple", 50, 100);
        productMap.put("Milk", 30, 50);

        CustomerQueue queue = new CustomerQueue(5);

        Customer c1 = new Customer("Lucky", 5);
        c1.addItem("Apple", 2);
        c1.addItem("Milk", 1);

        queue.enqueue(c1);

        while (!queue.isEmpty()) {
            Customer customer = queue.dequeue();
            SmartCheckout.processCustomer(customer, productMap);
        }
    }
}
