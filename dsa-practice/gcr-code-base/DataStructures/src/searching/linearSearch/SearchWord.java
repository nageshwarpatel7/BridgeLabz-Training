package searching.linearSearch;

public class SearchWord {
	public static boolean isAvailable(String[] arr, String word) {
		
		for(String i: arr) {
			if(i.equals(word))
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		String arr[] = {"Lucky", "Himesh", "Nageshwar", "Rajeev"};
		
		String word = "Nageshwar";
		
		if(isAvailable(arr, word))
			System.out.println("Word is available");
		else
			System.out.println("Not found");
	}
}
