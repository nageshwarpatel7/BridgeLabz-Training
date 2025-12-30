import java.util.*;

public class FitnessTracker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int pushUp[] = new int[6];
		System.out.println("Enter Sandeep 6 days push-ups: ");
		
		for(int i=1;i<=7;i++){
			if(i==7)
				continue;
			System.out.print("Day "+i+": ");
			pushUp[i-1] = sc.nextInt();
		}
		int total = totalPushUp(pushUp);
		System.out.println("Total number of push-ups: "+total);
		System.out.println("Average push-ups: "+ (total/pushUp.length));
	
	}
	public static int totalPushUp(int pushUp[]){
		int total = 0;
		for(int i: pushUp)
			total+=i;
		return total;
	}
}