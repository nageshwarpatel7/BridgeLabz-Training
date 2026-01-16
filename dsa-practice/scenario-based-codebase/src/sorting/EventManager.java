package sorting;

public class EventManager {
	static int ticketPrice[] = {1200, 500, 3000, 1500, 800, 2000};

    static void quickSort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSort(low, pivotIndex - 1);
            quickSort(pivotIndex + 1, high);
        }
    }

    static int partition(int low, int high) {
        int pivot = ticketPrice[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (ticketPrice[j] < pivot) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    static void swap(int i, int j) {
        int temp = ticketPrice[i];
        ticketPrice[i] = ticketPrice[j];
        ticketPrice[j] = temp;
    }

    static void display() {
        System.out.println("Sorted Ticket Prices:");
        for (int i = 0; i < ticketPrice.length; i++) {
            System.out.print(ticketPrice[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        quickSort(0, ticketPrice.length - 1);
        display();

        System.out.println("Cheapest Tickets:");
        for (int i = 0; i < 3; i++) {
            System.out.print(ticketPrice[i] + " ");
        }

        System.out.println("\nMost Expensive Tickets:");
        for (int i = ticketPrice.length - 3; i < ticketPrice.length; i++) {
            System.out.print(ticketPrice[i] + " ");
        }
    }
}
