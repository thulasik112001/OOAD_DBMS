package com.ilp03.entity;

public class Progress {
	private String completion_status;
	private String score;
	private Course course;
	private Module module;
	private Employee employee;

	public Progress(String completion_status, String score, Course course, Module module, Employee employee) {
		super();
		this.completion_status = completion_status;
		this.score = score;
		this.course = course;
		this.module = module;
		this.employee = employee;
	}

	public String getCompletion_status() {
		return completion_status;
	}

	public void setCompletion_status(String completion_status) {
		this.completion_status = completion_status;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
