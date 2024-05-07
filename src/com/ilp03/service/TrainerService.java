package com.ilp03.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.entity.Trainer;
import com.ilp03.entity.TestPrepInstructor;
import com.ilp03.entity.Tutor;

public class TrainerService {
	public static Trainer createTrainer(int choice) {
		Trainer trainer = null;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Trainer ID : ");
		String trainerId = scanner.nextLine();
		System.out.println("Enter Trainer Name : ");
		String Trainername = scanner.nextLine();
		

		if (choice == 1) {
			
			trainer = new Tutor(trainerId, Trainername);
			Tutor tutor = (Tutor) trainer;
			trainer.payCut();
			trainer.allowance();
			
			int batches = tutor.numberOfBatches();
			tutor.setNoOfBatches(batches);
			

		} else if (choice == 2) {
			trainer = new TestPrepInstructor(trainerId, Trainername);
			TestPrepInstructor testPrepInstructor = (TestPrepInstructor) trainer;
			
			
			
			
			
			trainer.payCut();
			trainer.allowance();
			int noOfStudents = testPrepInstructor.numberOfStudents();
			testPrepInstructor.setNoOfStudents(noOfStudents);
		}
		return trainer;

	}

	public static void displayAllTrainers(ArrayList<Trainer> trainerList) {
		// TODO Auto-generated method stub

		double monthlySalary = 0;
		double paymentPerHour = 0;
		
		for (Trainer trainer : trainerList) {
			
			
			if (trainer instanceof Tutor) {

				Tutor tutor = (Tutor) trainer;
				
			
				System.out.println("________details______");

				System.out.println("Trainer ID :" + trainer.getTrainerId());
				System.out.println("Trainer Name :" + trainer.getTrainerName());
				System.out.println("Allowance :" + tutor.getAllowance());
				System.out.println("Pay cut due to leave:" + tutor.getPayCut());
				System.out.println("Salary:" + (tutor.getSalary()+tutor.getAllowance()-tutor.getPayCut()));
				System.out.println("Number of batches handles :" + tutor.getNoOfBatches());
				System.out.println("");

			} else if (trainer instanceof TestPrepInstructor) {

				TestPrepInstructor testPrepInstructor = (TestPrepInstructor) trainer;
				
				System.out.println("Trainer ID:" + trainer.getTrainerId());
				System.out.println("Trainer Name :" + trainer.getTrainerName());
				System.out.println("Allowance:" + testPrepInstructor.getAllowance());
				System.out.println("Pay cut due to leave:" + testPrepInstructor.getPayCut());
				System.out.println("Salary:" + (testPrepInstructor.getSalary()+testPrepInstructor.getAllowance()-testPrepInstructor.getPayCut()));
				System.out.println("Number of students:" +testPrepInstructor.getNoOfStudents());

			}

		}

	}

	public static Trainer searchTrainer(ArrayList<Trainer> accountList) {
		// TODO Auto-generated method stub
		Trainer searchAccount = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the trainer Id : ");
		String accountNo = scanner.nextLine();
		for (Trainer account : accountList) {
			if (account.getTrainerId().compareTo(accountNo) == 0) {
				searchAccount = account;
				break;
			}
		}
		return searchAccount;
	}

	public static void payCut(Trainer trainer) {
		// TODO Auto-generated method stub
		if (trainer instanceof Tutor) {
			Tutor tutor = (Tutor) trainer;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the PayCut due to leave: ");
			double amount = scanner.nextDouble();
			double pay = tutor.payCut();
			tutor.setPayCut(amount);
		} else {
			TestPrepInstructor testPrepInstructor = (TestPrepInstructor) trainer;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the PayCut due to leave: ");
			double amount = scanner.nextDouble();
			double pay = testPrepInstructor.payCut();
			testPrepInstructor.setPayCut(amount);
		}

	}

	public static void allowance(Trainer trainer) {

		// TODO Auto-generated method stub
		if (trainer instanceof Tutor) {
			Tutor tutor = (Tutor) trainer;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the allowance amount: ");
			double allowanceAmount = scanner.nextDouble();
			double allowance = tutor.allowance();
			tutor.setAllowance(allowanceAmount);
		} else if (trainer instanceof TestPrepInstructor) {
			TestPrepInstructor testPrepInstructor = (TestPrepInstructor) trainer;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the allowance amount: ");
			double allowanceAmount = scanner.nextDouble();
			double allowance = testPrepInstructor.allowance();
			testPrepInstructor.setAllowance(allowanceAmount);

		}

	}

	public static void salary(Trainer trainer) {
		if (trainer instanceof Tutor) {
			Tutor tutor = (Tutor) trainer;
			System.out.println("Enter the monthly Salary: ");
			Scanner scanner = new Scanner(System.in);
			double monthlySalary = scanner.nextDouble();

			double salary = tutor.salary(monthlySalary);
			tutor.setSalary(monthlySalary);
		} else if (trainer instanceof TestPrepInstructor) {
			TestPrepInstructor testPrepInstructor = (TestPrepInstructor) trainer;
			System.out.println("Enter the Payment per hour: ");
			Scanner scanner = new Scanner(System.in);
			double payment = scanner.nextDouble();
			System.out.println("Enter the number of hours: ");
			int hours = scanner.nextInt();

			double salary = testPrepInstructor.salary(payment, hours);
			testPrepInstructor.setSalary(payment, hours);

		}
	}

}
