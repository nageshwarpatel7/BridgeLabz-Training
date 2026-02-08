package reflection.intermediateproblem.retrieveannotation;

public class ReflectionDemo {

    public static void main(String[] args) {

        Class<SampleClass> cls = SampleClass.class;

        if (cls.isAnnotationPresent(Author.class)) {

            Author author = cls.getAnnotation(Author.class);

            System.out.println("Author Name: " + author.name());
        }
    }
}