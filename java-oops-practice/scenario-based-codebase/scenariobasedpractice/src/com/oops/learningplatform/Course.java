package com.oops.learningplatform;

import java.util.List;

public class Course {
    private String courseName;
    private Instructor instructor;
    private List<Quiz> quizzes;

    public Course(String courseName, Instructor instructor, List<Quiz> quizzes) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.quizzes = quizzes;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }
}
