package sorting;

public class CropMonitor {
	static void quickSort(int[] timestamps, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(timestamps, low, high);
            quickSort(timestamps, low, pivotIndex - 1);
            quickSort(timestamps, pivotIndex + 1, high);
        }
    }

    static int partition(int[] timestamps, int low, int high) {
        int pivot = timestamps[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (timestamps[j] <= pivot) {
                i++;
                int temp = timestamps[i];
                timestamps[i] = timestamps[j];
                timestamps[j] = temp;
            }
        }

        int temp = timestamps[i + 1];
        timestamps[i + 1] = timestamps[high];
        timestamps[high] = temp;

        return i + 1;
    }

    static void displayData(int[] timestamps) {
        System.out.println("Sorted Sensor Timestamps:");
        for (int time : timestamps) {
            System.out.print(time + " ");
        }
    }

    public static void main(String[] args) {

        int[] timestamps = {1590, 1205, 1890, 1100, 1450, 1750, 1300};

        quickSort(timestamps, 0, timestamps.length - 1);
        displayData(timestamps);
    }
}
