package traincompanion;

public class Compartment {
	String name;
    boolean pantry;
    boolean wifi;

    Compartment prev;
    Compartment next;

    Compartment(String name, boolean pantry, boolean wifi) {
        this.name = name;
        this.pantry = pantry;
        this.wifi = wifi;
    }
}
