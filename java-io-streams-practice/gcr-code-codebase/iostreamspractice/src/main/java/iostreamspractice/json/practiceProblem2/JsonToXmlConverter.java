package iostreamspractice.json.practiceProblem2;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.InputStream;

public class JsonToXmlConverter {

    public static void main(String[] args) throws Exception {

        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        InputStream is = JsonToXmlConverter.class
                .getClassLoader()
                .getResourceAsStream("students.json");

        if (is == null) {
            throw new RuntimeException("students.json not found in resources folder");
        }

        JsonNode jsonArray = jsonMapper.readTree(is);

        ObjectNode rootNode = jsonMapper.createObjectNode();
        ArrayNode studentsNode = jsonMapper.createArrayNode();

        for (JsonNode node : jsonArray) {
            studentsNode.add(node);
        }

        rootNode.set("student", studentsNode);

        String xmlOutput = xmlMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(rootNode);

        System.out.println(xmlOutput);
    }
}
