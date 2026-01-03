package linkedlist.studentrecordmanagement;

public class Student {
	public int rollNo;
	public String name;
	public 	int age;
	public String grade;
	public Student next;
	
	public Student(int rollNo, String name, int age, String grade) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}
}
