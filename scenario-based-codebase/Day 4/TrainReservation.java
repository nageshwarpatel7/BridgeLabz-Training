import java.util.*;

public class TrainReservation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int sheets  =10;
		while(sheets>0){
		showMenu();
		System.out.print("Enter you choice: ");
		int choice = sc.nextInt();
		
		switch(choice){
			case 1: 
				sheets-=1;
				System.out.println("Seat booked successfully");
				break;
			case 2:
				System.out.println("Available sheets: "+sheets);
				break;
			case 3:
				sheets+=1;
				System.out.println("Last ticket canceled successfully");
				break;
			default: 
				System.out.println("Invalid choice!");
				break;
		}
		System.out.println();
		}
		System.out.println("All seats are filled");
		
	}
	public static void showMenu(){
		System.out.println("------------------------Ticket Menu------------------------");
		System.out.println("1. Book ticket");
		System.out.println("2. Check available sheet");
		System.out.println("3. Cancle ticket");
	}
}