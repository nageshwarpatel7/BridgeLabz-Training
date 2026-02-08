package reflection.intermediateproblem.modifystaticfield;

public class Configuration {

    private static String API_KEY = "OLD_KEY";

    public static void printKey() {
        System.out.println("API_KEY: " + API_KEY);
    }
}