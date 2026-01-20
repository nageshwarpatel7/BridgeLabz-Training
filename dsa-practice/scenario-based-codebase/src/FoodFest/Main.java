package FoodFest;

public class Main {
	public static void main(String[] args) {
		Zone[] stalls = {
				new Zone("Bhopal",10),
				new Zone("Indore", 5),
				new Zone("Ujjain", 15),
				new Zone("Katni", 20)
		};
		
		MergeSort sort = new MergeSort();
		sort.mergeSort(stalls, 0, stalls.length-1);
		
		for(Zone z: stalls) {
			System.out.println("Zone name: "+z.name);
			System.out.println("Zone cnt: "+z.cnt);
		}
	}
}
