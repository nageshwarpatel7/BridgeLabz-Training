package java8streamlogicalquestions;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,7,8,10,13};
		
		List<Integer> ans =Arrays.stream(arr).filter(n->n%2==0)
		.boxed().collect(Collectors.toList());
		
		System.out.println(ans);
	}

}
