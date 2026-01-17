package IceCreamRush;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		IceCream[] arr = {new IceCream("Chocolate",5),new IceCream("Vinella",25),new IceCream("MangoDolly",15),new IceCream("Chocolava",20)};
	    System.out.println(Arrays.toString(insertion(arr)));
	}
	public static IceCream[] insertion(IceCream[]arr) {
		   int n = arr.length;
           for (int i = 1; i < n; ++i) {
               IceCream key = arr[i];
               int j = i - 1;
               
               while (j >= 0 && arr[j].sold>key.sold) {
                   arr[j + 1] = arr[j];
                   j = j - 1;
               }
               arr[j + 1] = key;
           }
           return arr;
	}
}
