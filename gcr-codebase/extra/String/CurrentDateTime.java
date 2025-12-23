import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime{
	public static void main(String args[]){
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MM, dd, yy");
		
		ZonedDateTime date = ZonedDateTime.now();
		
		System.out.println("Current date: "+date.format(format1));
		System.out.println("Current date: "+date.format(format2));
		System.out.println("Current date: "+date.format(format3));
	}
}