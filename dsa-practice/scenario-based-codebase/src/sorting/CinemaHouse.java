package sorting;

public class CinemaHouse {
	static void bubbleSort(int[] showtimes) {
        int n = showtimes.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (showtimes[j] > showtimes[j + 1]) {
                    int temp = showtimes[j];
                    showtimes[j] = showtimes[j + 1];
                    showtimes[j + 1] = temp;
                }
            }
        }
    }

    static void displayShowtimes(int[] showtimes) {
        System.out.println("Movie Showtimes (Sorted):");
        for (int time : showtimes) {
            System.out.println(time);
        }
    }

    public static void main(String[] args) {

        int[] showtimes = {1830, 1100, 1500, 2100, 1300, 1000};

        bubbleSort(showtimes);      // Sorting logic
        displayShowtimes(showtimes); // Display result
    }
}
