package com.oops.learningplatform;
import java.util.List;

public class EduMentorApp {
    public static void main(String[] args) {
        
        Learner learner1 = new Learner("Himesh", "himesh.kurmi@email.com", "L001", 5);
        Instructor instructor1 = new Instructor("Lucky", "lucky.pal@email.com", "I001", 10);

        Quiz quiz1 = new Quiz(List.of("What is 2+2?", "What is 3+3?"), List.of("4", "6"));
        quiz1.scoreQuiz(List.of("4", "6"));

        System.out.println("Quiz Score: " + quiz1.getScore());
        System.out.println("Quiz Percentage: " + quiz1.getPercentage() + "%");

        Certifiable shortCourseCert = new ShortCourseCertificate(learner1.getName());
        shortCourseCert.generateCertificate();

        Certifiable fullTimeCert = new FullTimeCourseCertificate(learner1.getName());
        fullTimeCert.generateCertificate();
    }
}
