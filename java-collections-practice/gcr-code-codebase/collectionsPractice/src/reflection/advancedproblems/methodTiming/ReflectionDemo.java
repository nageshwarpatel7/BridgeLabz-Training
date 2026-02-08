package reflection.advancedproblems.methodTiming;

public class ReflectionDemo {
	public static void main(String[] args) {

        Task task = new Task();
        MethodTimer.measureExecutionTime(task);
    }
}
