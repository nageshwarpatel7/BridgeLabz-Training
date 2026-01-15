package smartcheckout;

public class SmartCheckout {
    static void processCustomer(Customer customer, ProductMap map) {
        int total = 0;

        for (int i = 0; i < customer.itemCount; i++) {
            Item item = customer.items[i];
            Product product = map.get(item.name);

            if (product != null && product.stock >= item.quantity) {
                total += product.price * item.quantity;
                product.stock -= item.quantity;
            } else {
                System.out.println(item.name + " out of stock");
            }
        }

        System.out.println("Customer: " + customer.customerName);
        System.out.println("Total Bill: " + total);
    }
}