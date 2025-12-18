import java.util.Scanner;

class Friends{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amar's age and height: ");
		int ageAmar = sc.nextInt();
		int heightAmar = sc.nextInt();
		
		System.out.println("Enter Akabar's age and height: ");
		int ageAkbar = sc.nextInt();
		int heightAkbar = sc.nextInt();
		
		System.out.println("Enter Anthony's age and height: ");
		int ageAnthony = sc.nextInt();
		int heightAnthony = sc.nextInt();
		
		if(ageAkbar<ageAmar && ageAkbar<ageAnthony)
			System.out.println("Youngest friend is: Akbar");
		else if(ageAmar<ageAkbar && ageAmar<ageAnthony)
			System.out.println("Youngest friend is: Amar");
		else
			System.out.println("Youngest friend is: Anthony");
		
		if(heightAkbar>heightAmar && heightAkbar>heightAnthony)
			System.out.println("Tallest friend is: Akbar");
		else if(heightAmar>heightAkbar && heightAmar>heightAnthony)
			System.out.println("Tallest friend is: Amar");
		else 
			System.out.println("Tallest friend is: Anthony");
	}
}