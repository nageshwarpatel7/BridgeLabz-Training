package traincompanion;

public class TrainCompanionDemo {
	public static void main(String[] args) {
        Train train = new Train();

        train.addCompartment("C1", false, true);
        train.addCompartment("C2", true, false);
        train.addCompartment("C3", false, false);
        train.addCompartment("C4", false, true);

        train.displayCurrent();

        train.moveForward();
        train.moveForward();
        train.moveBackward();

        train.searchService("pantry");

        train.removeCompartment("C3");
        train.moveForward();
    }
}
