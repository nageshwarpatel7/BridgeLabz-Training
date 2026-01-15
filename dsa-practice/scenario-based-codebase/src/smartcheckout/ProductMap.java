package smartcheckout;

public class ProductMap {
    Product[] table;
    int size;

    ProductMap(int size) {
        this.size = size;
        table = new Product[size];
    }

    int hash(String key) {
        int sum = 0;
        for (int i = 0; i < key.length(); i++)
            sum += key.charAt(i);
        return sum % size;
    }

    void put(String name, int price, int stock) {
        int index = hash(name);
        Product product = new Product(name, price, stock);

        if (table[index] == null) {
            table[index] = product;
        } else {
            Product temp = table[index];
            while (temp.next != null)
                temp = temp.next;
            temp.next = product;
        }
    }

    Product get(String name) {
        int index = hash(name);
        Product temp = table[index];

        while (temp != null) {
            if (temp.name.equals(name))
                return temp;
            temp = temp.next;
        }
        return null;
    }
}
