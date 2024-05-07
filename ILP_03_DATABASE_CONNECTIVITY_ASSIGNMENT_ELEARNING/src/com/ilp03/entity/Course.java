package com.ilp03.entity;

public class Course {

	private int course_id;
	private String title;

	public Course(int course_id, String title) {
		super();
		this.course_id = course_id;
		this.title = title;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
