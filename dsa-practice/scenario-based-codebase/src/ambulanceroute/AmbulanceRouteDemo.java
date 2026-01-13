package ambulanceroute;

public class AmbulanceRouteDemo {
	public static void main(String[] args) {
        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.displayUnits();

        route.findAvailableUnit();

        route.removeUnit("Radiology");
        route.displayUnits();

        route.findAvailableUnit();
    }

}
