package reflection.basicproblems.classinfo;

public class Student {
	
	private int id;
    public String name;
    protected double marks;

    public Student() {
        System.out.println("Default Constructor");
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private Student(int id) {
        this.id = id;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    private void calculateGrade() {
        System.out.println("Grade calculated");
    }

    protected double getMarks() {
        return marks;
    }
}
