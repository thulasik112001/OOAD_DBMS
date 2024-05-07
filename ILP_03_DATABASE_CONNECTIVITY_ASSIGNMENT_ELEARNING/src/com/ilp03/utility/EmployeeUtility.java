package com.ilp03.utility;

import java.util.Scanner;

import com.ilp03.service.ProgressServiceImpl;

public class EmployeeUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgressServiceImpl progressServiceImpl = new ProgressServiceImpl();
		char goToMainMenu = 'y';
		do {
			System.out.println("Press 1. to Display 2. to insert");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				progressServiceImpl.getProgress();
				break;
			case 2:
				progressServiceImpl.insertProgress();
				break;
			default:
				System.out.println("Invalid Choice");

			}
			System.out.println("If you want to continue, press Y");
			goToMainMenu = scanner.next().charAt(0);
		} while (goToMainMenu == 'y');

	}

}
