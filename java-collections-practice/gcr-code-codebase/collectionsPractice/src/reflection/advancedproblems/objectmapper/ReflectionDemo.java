package reflection.advancedproblems.objectmapper;

import java.util.HashMap;
import java.util.Map;

public class ReflectionDemo {

    public static void main(String[] args) {

        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Nageshwar");
        properties.put("age", 22);

        User user = ObjectMapperUtil.toObject(User.class, properties);
        user.display();
    }
}
