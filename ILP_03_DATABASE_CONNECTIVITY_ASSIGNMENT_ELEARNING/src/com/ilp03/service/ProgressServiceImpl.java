package com.ilp03.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.ProgressDAO;
import com.ilp03.entity.Progress;

public class ProgressServiceImpl implements ProgressService {
	public void getProgress() {
		// TODO Auto-generated method stub
		try {
			Connection connection = ProgressDAO.getConnection();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Course :\n");
			String courseName = scanner.nextLine().trim();
			ArrayList<Progress> progressList = ProgressDAO.getEmployeeBasedOnCourseName(connection, courseName);
			System.out.println(
					"********************Employees entrolled in the course and Their progress************************ \n");
			System.out.println("FirstName \t" + "LastName\t" + "Course Opted\t " + "Completion Status\t" + "Score\t"
					+ "Modules Completed\t");
			for (Progress progress : progressList) {
//				System.out.println("FirstName \t" + "LastName\t" + "Course Opted\t " + "Completion Status\t" + "Score\t"
//						+ "Modules Completed\t");
				System.out.println(progress.getEmployee().getFirstname() + "\t\t" + progress.getEmployee().getLastname()
						+ "\t\t" + progress.getCourse().getTitle() + "\t\t\t" + progress.getCompletion_status() + "\t\t"
						+ progress.getScore() + "\t" + progress.getModule().getTitle());
			}
			System.out.println("***********************************End************************ \n");
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void insertProgress() {
		Connection connection = ProgressDAO.getConnection();
		ProgressDAO.insertIntoData(connection);
	}

	// TODO Auto-generated method stub

}
