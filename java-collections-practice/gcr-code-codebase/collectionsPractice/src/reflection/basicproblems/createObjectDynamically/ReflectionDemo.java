package reflection.basicproblems.createObjectDynamically;

public class ReflectionDemo {

    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("reflection.basicproblems.createObjectDynamically.Student");

            Student student = (Student) cls.getDeclaredConstructor().newInstance();

            student.display();

        } catch (Exception e) {
        	
            e.printStackTrace();
        }
    }
}
