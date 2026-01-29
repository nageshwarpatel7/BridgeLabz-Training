package iostreamspractice.json.practiceProblem2;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

import java.io.InputStream;
import java.util.Set;

public class JsonEmailValidator {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        InputStream schemaStream =
                JsonEmailValidator.class
                        .getClassLoader()
                        .getResourceAsStream("email-schema.json");

        if (schemaStream == null) {
            throw new RuntimeException("email-schema.json not found in resources");
        }

        JsonSchemaFactory factory =
                JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);

        JsonSchema schema = factory.getSchema(schemaStream);

        JsonNode validJson =
                mapper.readTree("{\"email\":\"test@example.com\"}");

        JsonNode invalidJson =
                mapper.readTree("{\"email\":\"wrong-email\"}");

        validate(schema, validJson);
        validate(schema, invalidJson);
    }

    private static void validate(JsonSchema schema, JsonNode json) {

        Set<ValidationMessage> errors = schema.validate(json);

        if (errors.isEmpty()) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
            errors.forEach(e -> System.out.println(" - " + e.getMessage()));
        }
    }
}
