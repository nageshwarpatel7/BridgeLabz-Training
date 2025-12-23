import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;


public class AddDateMonthYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date(format dd/MM/yyyy): ");
		String time = sc.next();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate date = LocalDate.parse(time, formatter);
		
		LocalDate dateAfterAdd = date.plusDays(7).plusMonths(1).plusYears(2);
		
		System.out.println("Date after adding (7days, 1month, 2years): "+dateAfterAdd);
		
		LocalDate minusWeekDate = dateAfterAdd.minusWeeks(3);
		
		System.out.println("Date before 3 weeks: "+minusWeekDate);
		
	}
}