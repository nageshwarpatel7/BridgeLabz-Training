package com.oops.learningplatform;

import java.util.List;

public class Quiz {
    private List<String> questions;
    private List<String> answers;
    private final int totalQuestions;
    private int score;

    public Quiz(List<String> questions, List<String> answers) {
        this.questions = questions;
        this.answers = answers;
        this.totalQuestions = questions.size();
        this.score = 0;
    }
    public List<String> getQuestions() {
        return questions;
    }

    public List<String> getAnswers() {
        return answers;
    }
    
    public void scoreQuiz(List<String> learnerAnswers) {
        if (learnerAnswers.size() != answers.size()) {
            throw new IllegalArgumentException("Answers count does not match the questions count.");
        }

        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).equals(learnerAnswers.get(i))) {
                score++;
            }
        }
    }

    public double getPercentage() {
        return ((double) score / totalQuestions) * 100;
    }

    public int getScore() {
        return score;
    }
}
