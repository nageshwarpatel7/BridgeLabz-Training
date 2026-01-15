package sorting;

public class SmartShelf {
	static String books[] = new String[10];
    static int count = 0;

    // ---------- MODULE 1: ADD BOOK ----------
    static void addBook(String title) {
        books[count] = title;
        count++;
        insertionSort();
        displayBooks();
    }

    // ---------- MODULE 2: INSERTION SORT ----------
    static void insertionSort() {
        int i, j;
        String key;

        for (i = 1; i < count; i++) {
            key = books[i];
            j = i - 1;

            while (j >= 0 && books[j].compareTo(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }
    }

    // ---------- MODULE 3: DISPLAY ----------
    static void displayBooks() {
        System.out.println("Current Book List:");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
        System.out.println();
    }

    // ---------- MAIN MODULE ----------
    public static void main(String[] args) {

        addBook("Data Structures");
        addBook("Algorithms");
        addBook("Computer Networks");
        addBook("Operating Systems");
    }
}
