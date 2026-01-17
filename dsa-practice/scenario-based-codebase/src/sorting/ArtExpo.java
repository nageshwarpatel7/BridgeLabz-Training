package sorting;
import java.time.LocalTime;
import java.util.*;

public class ArtExpo {
		public String name;
	     public LocalTime time;
		
	     public ArtExpo(String name, LocalTime time) {
			this.name = name;
			this.time = time;
		 }
	     
	    @Override
	    public String toString() {
	    	return "\nArtist Name : "+this.name+" | Time : "+this.time;
	    }
	    
	    public static ArtExpo[] insertion(ArtExpo[] art) {
	    	   int n = art.length;
	           for (int i = 1; i < n; ++i) {
	               ArtExpo key = art[i];
	               int j = i - 1;
	               
	               while (j >= 0 && art[j].time.isAfter(key.time)) {
	                   art[j + 1] = art[j];
	                   j = j - 1;
	               }
	               art[j + 1] = key;
	           }
	           return art;
		}
	public static void main(String[] args) {
		ArtExpo[] arr = {new ArtExpo("Lucky",LocalTime.of(10,30)),new ArtExpo("himesh",LocalTime.of(6,10)),new ArtExpo("Nageshwar",LocalTime.of(21,30))};
    	System.out.println(Arrays.toString(insertion(arr)));
    }
    
}
