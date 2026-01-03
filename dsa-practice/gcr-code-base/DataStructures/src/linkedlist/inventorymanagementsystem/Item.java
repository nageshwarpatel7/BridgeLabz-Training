package linkedlist.inventorymanagementsystem;

public class Item {
	public String itemName;
	public String itemID;
	public int quantity;
	public double price;
	Item next;
	
	public Item(String itemName, String itemID, int quantity, double price) {
		this.itemName = itemName;
		this.itemID = itemID;
		this.quantity = quantity;
		this.price = price;
		this.next = null;
	}
	
}
