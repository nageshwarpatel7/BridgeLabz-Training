package filehandling;


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class WriteFileUsingInputStream {

    public static void main(String[] args) {
        String fileName = "output.txt";

        try (
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(isr);
            FileWriter writer = new FileWriter(fileName, true)
        ) {
            System.out.println("Enter text (type 'exit' to stop):");

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(line + System.lineSeparator());
            }

            System.out.println("Input successfully written to " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
