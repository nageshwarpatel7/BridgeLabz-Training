package MovieTime;

import java.util.Arrays;

public class TheaterShowDemo {
	public static void main(String[] args) {
		int arr[] = {1,2, 8,9,10,3,2,12};
		
		TheaterShowListing s = new TheaterShowListing();
		s.sortData(arr);
		
		System.out.println("Sorted array: "+Arrays.toString(arr));
	}
}
