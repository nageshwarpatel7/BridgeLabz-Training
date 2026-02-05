package java8streamlogicalquestions;
import java.util.*;
import java.util.stream.Collectors;

public class FirstNonRepeating {
	public static void main(String[] args) {
		
		String str = "stress";
		
		Optional<Character> result =
                str.chars()
                     .mapToObj(c -> (char) c)
                     .collect(Collectors.groupingBy(
                             c -> c,
                             LinkedHashMap::new,   
                             Collectors.counting()
                     ))
                     .entrySet()
                     .stream()
                     .filter(e -> e.getValue() == 1)
                     .map(Map.Entry::getKey)
                     .findFirst();
		
		result.ifPresent(s->System.out.println("First non repeating character: "+s));
	}
}
