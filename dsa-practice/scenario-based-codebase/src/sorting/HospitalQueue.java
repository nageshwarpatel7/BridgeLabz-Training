package sorting;
import java.util.*;

public class HospitalQueue {
	public void sortPatient(int arr[], int n) {
		for(int i=n-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				if(arr[i]>arr[j]) {
					int temp =arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		HospitalQueue patient = new HospitalQueue();
		
		System.out.print("Enter no. of patient: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int critical[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter criticality level of patient: ");
			critical[i] = sc.nextInt();
		}
		
		System.out.println("Patient queue accrding to arrival time: "+Arrays.toString(critical));
		patient.sortPatient(critical, n);
		
		System.out.println("Patinet queue after sorting: "+Arrays.toString(critical));
	}
}
