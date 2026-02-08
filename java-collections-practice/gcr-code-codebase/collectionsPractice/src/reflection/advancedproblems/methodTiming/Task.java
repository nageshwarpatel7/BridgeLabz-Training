package reflection.advancedproblems.methodTiming;

public class Task {

    public void fastTask() {
        for (int i = 0; i < 1_000_000; i++) { }
    }

    public void slowTask() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}