package java8streamlogicalquestions;
import java.util.*;
import java.util.stream.Collectors;

public class WordCount {
	public static void main(String[] args) {
		String str = "java is java and java is fast";
		
		Map<String,Long> freq =Arrays.stream(str.split("\\s+"))
				.collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));
		
		System.out.println(freq);
	}
}
