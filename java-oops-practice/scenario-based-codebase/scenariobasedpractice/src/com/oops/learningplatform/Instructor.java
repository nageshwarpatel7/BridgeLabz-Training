package com.oops.learningplatform;

public class Instructor extends User {
	
	private int taughtCourses;

	public Instructor(String name, String email, String userId,int taughtCourses) {
		super(name, email, userId);
		this.taughtCourses = taughtCourses;
	}
	public int getTaughtCourses() {
        return taughtCourses;
    }

    public void setTaughtCourses(int taughtCourses) {
        this.taughtCourses = taughtCourses;
    }
	
}
