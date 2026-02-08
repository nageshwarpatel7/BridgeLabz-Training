package reflection.advancedproblems.dependencyInjection;

public class ReflectionDemo {

    public static void main(String[] args) {

        Client client = DIContainer.getInstance(Client.class);
        client.doWork();
    }
}