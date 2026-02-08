package reflection.basicproblems.createObjectDynamically;

public class Student {

    public String name;
    public int age;

    public Student() {
        name = "John";
        age = 20;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
