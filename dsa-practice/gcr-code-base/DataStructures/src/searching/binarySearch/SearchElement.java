package searching.binarySearch;

public class SearchElement {
	public static int binarySearch(int arr[], int target) {
		int st =0;
		int ed = arr.length-1;
		
		while(st<=ed) {
			int mid = st+ (ed-st)/2;
			
			if(arr[mid]==target) return mid;
			
			if(target<arr[mid])
				ed = mid-1;
			else
				st = mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int target = 4;
		
		int ans =binarySearch(arr, target);
		if(ans==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index: "+ans);
	}
}
