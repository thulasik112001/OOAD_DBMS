package com.ilp03.entity;

import java.util.Scanner;

public class Tutor extends Trainer implements batchesHandled {
	public Tutor(String trainerId, String trainerName) {
		super(trainerId, trainerName);
		// TODO Auto-generated constructor stub
	}

	private double allowance;
	private double payCut;
	private double salary;
	private int noOfBatches;

	public int getNoOfBatches() {
		return noOfBatches;
	}

	public void setNoOfBatches(int noOfBatches) {
		this.noOfBatches = noOfBatches;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double payCut() {
		// TODO Auto-generated method stub
		System.out.println("");
		return 0;

	}

	@Override
	public double allowance() {
		// TODO Auto-generated method stub
		System.out.println("");
		return 0;
	}

	@Override
	public int numberOfBatches() {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of batches handled:");
		Scanner scanner = new Scanner(System.in);
		int batch = scanner.nextInt();

		return batch;

	}

	@Override
	public double salary(double monthlySalary) {
		// TODO Auto-generated method stub
		return monthlySalary;
	}

	@Override
	public double salary(double paymentPerHour, int numberOfHours) {
		// TODO Auto-generated method stub
		return 0;
	}

}
