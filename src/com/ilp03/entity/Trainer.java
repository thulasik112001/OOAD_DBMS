package com.ilp03.entity;

public abstract class Trainer {
	private String trainerId;
	private String trainerName;

	public abstract double payCut();

	public abstract double salary(double monthlySalary);

	public abstract double salary(double paymentPerHour, int numberOfHours);

	public abstract double allowance();

	public String getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public Trainer(String trainerId, String trainerName) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
	}

}
