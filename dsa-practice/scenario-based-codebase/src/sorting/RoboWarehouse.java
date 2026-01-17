package sorting;

public class RoboWarehouse {
	public static void insertionSort(int arr[], int n) {
		
		for(int i=1;i<n;i++) {
			int key =arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] =key;
		}
	}
	
	public static void main(String[] args) {
		int[] packageWeights = { 20, 10, 30, 15, 25 };
		int n = packageWeights.length;

        System.out.println("Before Loading:");
        for (int w : packageWeights) {
            System.out.print(w + " ");
        }

        insertionSort(packageWeights, n);

        System.out.println("\n\nAfter Robot Loading (Sorted Shelf):");
        for (int w : packageWeights) {
            System.out.print(w + " ");
        }
	}
}
