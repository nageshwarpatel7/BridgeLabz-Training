import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryFine{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num =5;
		while(num>0){
			System.out.print("Entet book return date(in format dd-MM-yyyy): ");
			String returnDate = sc.next();
			
			System.out.print("Enter book due date(in format dd-MM-yyyy): ");
			String dueDate = sc.next();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
			LocalDate returnD = LocalDate.parse(returnDate, formatter);
			LocalDate dueD = LocalDate.parse(dueDate, formatter);
			
			long totalDays = ChronoUnit.DAYS.between(dueD, returnD);
			
			if(totalDays>0)
				System.out.println("Your fine is: "+ (totalDays*5));
			else
				System.out.println("No fine");
			num--;
		}
		
	}
}