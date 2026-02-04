package javastream;
import java.util.*;
import java.util.stream.Collectors;

public class CityWithMaxStudent {
	public static void main(String[] args) {
		
		List<StudentInfo> students = List.of(
                new StudentInfo("Nageshwar Prashad Patel", 111, "Nageshwar", 22, "M", "Bhopal", 1, List.of("7447878384", "7447878385")),
                new StudentInfo("Lucky Pal", 98, "Lucky", 22, "M", "Bhopal", 2, List.of("8378492379")),
                new StudentInfo("Himesh Kurmi", 83, "Himesh", 20, "M", "Bhopal", 3, List.of("6524783574", "6524783575")),
                new StudentInfo("xysd iad", 78, "xysd", 26, "F", "Mumbai", 102, List.of("6724893471")),
                new StudentInfo("jhsjfy hjs", 67, "jhsjfy", 38, "F", "hskf", 183, List.of("7346274823", "7346274824"))
        );
		
		Optional<Map.Entry<String, Long>> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                s->s.city,
                                Collectors.counting()
                        ))
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue());
		
		result.ifPresent(entry ->
        System.out.println(
                "City with maximum students: " +
                entry.getKey() + " (" + entry.getValue() + ")"
        ));

	}
}
