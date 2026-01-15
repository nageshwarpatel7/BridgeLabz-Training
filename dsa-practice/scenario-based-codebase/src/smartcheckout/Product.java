package smartcheckout;

public class Product {
    String name;
    int price;
    int stock;
    Product next;

    Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.next = null;
    }
}