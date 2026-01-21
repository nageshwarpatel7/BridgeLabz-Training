package MedWarehouse;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Medicine {
	public String name;
	 
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	public LocalDate expiryDate;
	
	public Medicine(String name, String date) {
		this.name = name;
		this.expiryDate = LocalDate.parse(date, formatter);
	}
	
	@Override
    public String toString() {
        return name + " | Expiry: " + expiryDate;
    }
}
