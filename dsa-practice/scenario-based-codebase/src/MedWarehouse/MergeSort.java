package MedWarehouse;
import java.util.*;
import java.time.LocalDate;

public class MergeSort {
	
	public void mergeSort(Medicine[] arr, int low, int high) {
		
		if(low<high) {
		
		int mid = low + (high-low)/2;
		
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		
		merge(arr, low,mid,high);
		}
		
	}
	public void merge(Medicine arr[], int low, int mid, int high) {
		int n1 = mid-low+1;
		
		int n2 = high-mid;
		
		Medicine[] leftArr =new Medicine[n1];
		Medicine[] rightArr = new Medicine[n2];
		
		System.arraycopy(arr, low, leftArr, 0, n1);
		System.arraycopy(arr, mid+1, rightArr, 0, n2);
		
		int i=0, j=0, k=low;
		
		while(i<n1 && j<n2) {
			if(leftArr[i].expiryDate.isBefore(rightArr[j].expiryDate)) {
				arr[k++] = leftArr[i++];
			}
			else {
				arr[k++] = rightArr[j++];
			}
		}
		while(i<n1) arr[k++] = leftArr[i++];
		while(j<n2) arr[k++] = rightArr[j++];
	}
}
