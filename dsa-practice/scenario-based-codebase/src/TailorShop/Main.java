package TailorShop;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Order arr[] = { new Order("Himesh", LocalDate.of(2026, 1, 20)),
						new Order("Nageshwar", LocalDate.of(2026, 2, 15)),
						new Order("Lucky", LocalDate.of(2026, 1, 31)),
						new Order("Rajeev", LocalDate.of(2026, 2, 10)),
						new Order("Raj", LocalDate.of(2026,2,1))};
		
		InsertionSort sort = new InsertionSort();
		sort.insertionSort(arr);
		
		for(Order o: arr) {
			System.out.println("Name: "+o.name+", Delivery date: "+o.deliveryDate.toString());
		}
	}
}
