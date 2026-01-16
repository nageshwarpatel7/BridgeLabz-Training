package sorting;

public class ExamCell {

    static int scores[] = {88, 92, 95, 70, 75, 80, 60, 65, 68};
    static int n = scores.length;

    static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    static void merge(int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = scores[left + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = scores[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                scores[k] = leftArr[i];
                i++;
            } else {
                scores[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            scores[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            scores[k] = rightArr[j];
            j++;
            k++;
        }
    }

    static void displayRanks() {
        System.out.println("State-Level Rank List:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println("Rank " + (n - i) + " : " + scores[i]);
        }
    }

    public static void main(String[] args) {
        mergeSort(0, n - 1);
        displayRanks();
    }
}
