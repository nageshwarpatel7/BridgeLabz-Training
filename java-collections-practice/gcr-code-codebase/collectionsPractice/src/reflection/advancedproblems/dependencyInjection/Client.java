package reflection.advancedproblems.dependencyInjection;

public class Client {

    @Inject
    private Service service;

    public void doWork() {
        service.serve();
    }
}