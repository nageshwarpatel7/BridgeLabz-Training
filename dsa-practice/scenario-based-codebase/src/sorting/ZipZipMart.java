package sorting;

public class ZipZipMart {

    // Sales data
    static String date[] = {
        "2025-01-12", "2025-01-10", "2025-01-12", "2025-01-11"
    };
    static int amount[] = {500, 300, 200, 400};

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

        String leftDate[] = new String[n1];
        String rightDate[] = new String[n2];
        int leftAmt[] = new int[n1];
        int rightAmt[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftDate[i] = date[left + i];
            leftAmt[i] = amount[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightDate[j] = date[mid + 1 + j];
            rightAmt[j] = amount[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftDate[i].compareTo(rightDate[j]) < 0 ||
               (leftDate[i].compareTo(rightDate[j]) == 0 &&
                leftAmt[i] <= rightAmt[j])) {

                date[k] = leftDate[i];
                amount[k] = leftAmt[i];
                i++;
            } else {
                date[k] = rightDate[j];
                amount[k] = rightAmt[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            date[k] = leftDate[i];
            amount[k] = leftAmt[i];
            i++;
            k++;
        }

        while (j < n2) {
            date[k] = rightDate[j];
            amount[k] = rightAmt[j];
            j++;
            k++;
        }
    }

    static void display() {
        System.out.println("Sorted Sales Report:");
        for (int i = 0; i < date.length; i++) {
            System.out.println(date[i] + "  ₹" + amount[i]);
        }
    }

    public static void main(String[] args) {
        mergeSort(0, date.length - 1);
        display();
    }
}
