package TailorShop;
import java.time.LocalDate;

public class Order {
	public String name;
	public LocalDate deliveryDate;
	
	public Order(String name, LocalDate date) {
		this.name = name;
		this.deliveryDate = date;
	}
}
