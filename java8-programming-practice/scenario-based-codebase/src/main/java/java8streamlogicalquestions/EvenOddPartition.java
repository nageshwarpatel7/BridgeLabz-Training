package java8streamlogicalquestions;
import java.util.*;
import java.util.stream.Collectors;

public class EvenOddPartition {
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> partitioned =
                numbers.stream()
                       .collect(Collectors.partitioningBy(
                               n -> n % 2 == 0
                       ));

        Map<String, List<Integer>> result = new LinkedHashMap<>();
        result.put("even", partitioned.get(true));
        result.put("odd", partitioned.get(false));

        System.out.println(result);
	}
}
