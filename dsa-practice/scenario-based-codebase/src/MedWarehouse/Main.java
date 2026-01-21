package MedWarehouse;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

        Medicine[] medicines = {
                new Medicine("Paracetamol", "12-01-2025"),
                new Medicine("Aspirin", "05-10-2024"),
                new Medicine("Insulin", "20-08-2024"),
                new Medicine("Amoxicillin", "15-12-2024"),
                new Medicine("Vitamin C", "01-03-2025")
        };
        MergeSort sort = new MergeSort();

        sort.mergeSort(medicines, 0, medicines.length - 1);

        System.out.println("📦 Sorted Medicines by Expiry Date:");
        for (Medicine med : medicines) {
            System.out.println(med);
        }

        System.out.println("\n⚠ Medicines Nearing Expiration (within 60 days):");
        LocalDate today = LocalDate.now();
        for (Medicine med : medicines) {
            if (med.expiryDate.isBefore(today.plusDays(60))) {
                System.out.println(med);
            }
        }
    }
}
