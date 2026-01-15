package examproctor;

public interface ExamProctorDemo {
	public static void main(String[] args) {
		
		ExamProctor proctor = new ExamProctor();

        proctor.setCorrectAnswer(0, "A");
        proctor.setCorrectAnswer(1, "C");
        proctor.setCorrectAnswer(2, "B");

        proctor.push(1);
        proctor.putAnswer(1, "A");

        proctor.push(2);
        proctor.putAnswer(2, "B");

        proctor.push(3);
        proctor.putAnswer(3, "B");

        proctor.pop(); 

        int result = proctor.calculateScore();
        System.out.println("Final Score: " + result);
    }
}
