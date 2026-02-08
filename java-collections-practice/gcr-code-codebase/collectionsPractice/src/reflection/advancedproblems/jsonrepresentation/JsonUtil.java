package reflection.advancedproblems.jsonrepresentation;

import java.lang.reflect.Field;

public class JsonUtil {

    public static String toJson(Object obj) {
        if (obj == null) {
            return "null";
        }

        StringBuilder json = new StringBuilder();
        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        json.append("{");

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);

            try {
                json.append("\"").append(field.getName()).append("\":");

                Object value = field.get(obj);

                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        json.append("}");
        return json.toString();
    }
}
