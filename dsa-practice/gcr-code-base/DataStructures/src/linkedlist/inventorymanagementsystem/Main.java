package linkedlist.inventorymanagementsystem;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList manager = new LinkedList();

        manager.addItem("Laptop", "101", 5, 1200.0);
        manager.addItem("Mouse", "102", 50, 25.0);
        manager.addItem("Keyboard", "103", 20, 45.0);

        System.out.println("Initial Inventory:");
        manager.displayInventory();

        System.out.println("\nTotal Value: $" + manager.calculateTotalValue());

        System.out.println("\nSorting by Name...");
        manager.sortByName();
        manager.displayInventory();
        
        sc.close();
    }
}
