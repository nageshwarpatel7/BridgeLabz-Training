package sorting;
import java.util.*;

public class FleetManager {
	public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            rightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge sorted sublists
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k++] = leftArray[i++];
        }

        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        int[] vehicleMileage = { 12000, 5000, 30000, 20000, 15000 };

        System.out.println("Unsorted depot list:");
        for (int m : vehicleMileage) {
            System.out.print(m + " ");
        }

        mergeSort(vehicleMileage, 0, vehicleMileage.length - 1);

        System.out.println("\n\nSorted depot lists:");
        for (int m : vehicleMileage) {
            System.out.print(m + " ");
        }
    }
}
