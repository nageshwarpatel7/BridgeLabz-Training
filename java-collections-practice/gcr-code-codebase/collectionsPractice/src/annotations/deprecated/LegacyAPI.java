package annotations.deprecated;

public class LegacyAPI {
	
	@Deprecated
	public void oldFeature() {
		System.out.println("This is old method");
	}
	
	public void newFeature() {
		System.out.println("This is new method");
	}
}
