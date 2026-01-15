package parceltracker;

public class ParcelTrackerDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParcelTracker tracker = new ParcelTracker();

	        tracker.insertStage("Packed");
	        tracker.insertStage("Shipped");
	        tracker.insertStage("In Transit");
	        tracker.insertStage("Delivered");

	        tracker.trackParcel();
	        System.out.println();

	        // Add custom checkpoint
	        tracker.addCustomStage("Shipped", "Customs Check");
	        tracker.trackParcel();
	        System.out.println();

	        // Check parcel status
	        tracker.checkForLoss();
	}
}
