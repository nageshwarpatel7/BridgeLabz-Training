package javastream;
import java.util.*;

public class StudentInfo {
	public String name;
	public int id;
	public String firstName;
	public int age;
	public String gender;
	public String city;
	public int rank;
	public List<String> contact;
	public StudentInfo(String name, int id, String firstName, int age, String gender, String city, int rank,
			List<String> contact) {
		this.name = name;
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.rank = rank;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", firstName=" + firstName + ", age=" + age + ", gender="
				+ gender + ", city=" + city + ", rank=" + rank + ", contact=" + contact + "]";
	}
	
	
	
}
