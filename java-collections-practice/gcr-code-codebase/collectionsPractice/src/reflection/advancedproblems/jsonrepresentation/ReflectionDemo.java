package reflection.advancedproblems.jsonrepresentation;

public class ReflectionDemo {

    public static void main(String[] args) {

        User user = new User("Nageshwar", 22);

        String json = JsonUtil.toJson(user);
        System.out.println(json);
    }
}