package com.il03.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.entity.Trainer;
import com.ilp03.entity.Tutor;
import com.ilp03.service.TrainerService;

public class TrainerUtility {
	public static void main(String[] args) {
		Trainer account = null;
		Scanner scanner = new Scanner(System.in);
		char goToMainMenu = 'y';
		ArrayList<Trainer> accountList = new ArrayList<Trainer>();
		int choice;
		do {
			System.out.println("1.Tutor, 2. Test Preparation Instructor 3.Search  4.Display");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
			case 2:
				accountList.add(TrainerService.createTrainer(choice));
				break;
			case 3 : account = TrainerService.searchTrainer(accountList);

				TrainerService.salary(account);

				TrainerService.allowance(account);

				TrainerService.payCut(account);
				break;
			case 4:
				
				TrainerService.displayAllTrainers(accountList);
				break;
			}
			System.out.println("Go to main menu(y/n) :");
			goToMainMenu = scanner.next().charAt(0);

		}

		while (goToMainMenu == 'y');

	}
}
