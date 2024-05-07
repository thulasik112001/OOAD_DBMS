package com.ilp03.entity;

import java.util.Scanner;

public class TestPrepInstructor extends Trainer implements numberOfStudentsInABatch {

	private double salary;
	private double allowance;
	private double payCut;
	private int noOfStudents;

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary, int hours) {
		this.salary = salary * hours;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public double getPayCut() {
		return payCut;
	}

	public void setPayCut(double payCut) {
		this.payCut = payCut;
	}

	public TestPrepInstructor(String trainerId, String trainerName) {
		super(trainerId, trainerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double payCut() {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public double allowance() {
		// TODO Auto-generated method stub

		return 0;

	}

	@Override
	public int numberOfStudents() {
		System.out.println("Enter the number of Students in a batch:");
		Scanner scanner = new Scanner(System.in);
		int students = scanner.nextInt();
		// TODO Auto-generated method stub
		return students;

	}

	@Override
	public double salary(double monthlySalary) {

		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public double salary(double paymentPerHour, int numberOfHours) {
		// TODO Auto-generated method stub
		double salary = paymentPerHour * numberOfHours;

		return salary;
	}

}
