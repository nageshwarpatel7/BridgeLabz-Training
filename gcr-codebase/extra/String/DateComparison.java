import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a date format(dd/MM/yyyy): ");
		String dateFst = sc.next();
		
		System.out.print("Enter another date: ");
		String dateSec = sc.next();
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate date1 = LocalDate.parse(dateFst, format);
		LocalDate date2 = LocalDate.parse(dateSec, format);
		
		System.out.println(date1+" is before "+date2+": "+date1.isBefore(date2));
		System.out.println(date1+" is after "+date2+": "+date1.isAfter(date2));
		System.out.println(date1+" is equal "+date2+": "+date1.isEqual(date2));
	}
}