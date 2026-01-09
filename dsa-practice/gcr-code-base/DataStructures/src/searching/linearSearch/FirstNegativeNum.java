package searching.linearSearch;

public class FirstNegativeNum {
	public static int findEle(int[] arr) {
		int idx = -1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				idx= i;
				break;
			}
		}
		return idx;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2, 3, -4, 5,6, -7};
		
		int ans = findEle(arr);
		
		if(ans==-1) System.out.println("Element not found");
		
		else System.out.println("Element found at index: "+ans);
	}
}
