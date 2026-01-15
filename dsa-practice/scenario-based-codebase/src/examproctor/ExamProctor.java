package examproctor;

public class ExamProctor {

    // ---------- STACK IMPLEMENTATION ----------
    public int stack[] = new int[10];
    public int top = -1;

    public void push(int questionId) {
        top++;
        stack[top] = questionId;
        System.out.println("Visited Question: " + questionId);
    }

    public void pop() {
        if (top >= 0) {
            System.out.println("Went back from Question: " + stack[top]);
            top--;
        }
    }

    // ---------- MAP IMPLEMENTATION ----------
    public int qId[] = new int[10];
    public String studentAnswer[] = new String[10];
    public String correctAnswer[] = new String[10];
    public int size = 0;

    public void putAnswer(int questionId, String answer) {
        qId[size] = questionId;
        studentAnswer[size] = answer;
        size++;
    }

    public void setCorrectAnswer(int index, String answer) {
        correctAnswer[index] = answer;
    }

    // ---------- SCORE CALCULATION ----------
    public int calculateScore() {
        int score = 0;

        for (int i = 0; i < size; i++) {
            if (studentAnswer[i].equals(correctAnswer[i])) {
                score++;
            }
        }
        return score;
    }
}
