package com.oops.learningplatform;

public class Learner extends User{
	private int completedCourses;
	
	public Learner(String name, String email, String userId, int completedCourses) {
		super(name, email, userId);	
		this.completedCourses = completedCourses;
	}
	
	public int getCompletedCourses() {
        return completedCourses;
    }

    public void setCompletedCourses(int completedCourses) {
        this.completedCourses = completedCourses;
    }
}
