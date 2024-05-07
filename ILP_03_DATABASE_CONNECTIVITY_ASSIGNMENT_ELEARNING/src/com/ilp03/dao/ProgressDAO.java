
package com.ilp03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.entity.Progress;
import com.ilp03.entity.Employee;
import com.ilp03.entity.Course;
import com.ilp03.entity.Module;

public class ProgressDAO {

	public static Connection getConnection() {
		String connectionString = "jdbc:mysql://localhost:3306/online_learning";
		String userName = "root";
		String password = "Workcase@1";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionString, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<Progress> getEmployeeBasedOnCourseName(Connection connection, String courseName) {

		PreparedStatement statement = null;
		ArrayList<Progress> accountList = new ArrayList<>();

		// Module module=null;
		try {

			String query = "SELECT * " + "FROM employee\r\n"
					+ "INNER JOIN progress ON employee.employee_id = progress.employee_id\r\n"
					+ "INNER JOIN module ON progress.module_id = module.module_id\r\n"
					+ "INNER JOIN course ON module.course_id = course.course_id\r\n" + "WHERE course.title =?";
			statement = connection.prepareStatement(query);
			statement.setString(1, courseName);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {

				Employee employee = new Employee(resultSet.getInt(1), resultSet.getString("firstname"),
						resultSet.getString("lastname"));
				Course course = new Course(resultSet.getInt("course.course_id"), resultSet.getString("course.title"));
				Module module = new Module(resultSet.getInt("module.module_id"), resultSet.getString("module.title"));
				Progress progress = new Progress(resultSet.getString("progress.completion_status"),
						resultSet.getString("progress.score"), course, module, employee);

				accountList.add(progress);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return accountList;

	}

	public static void insertIntoData(Connection connection) {
		Scanner scanner = new Scanner(System.in);
		PreparedStatement statement = null;
		try {
			String query = "insert into progress(module_id,employee_id,completion_status,score)\r\n"
					+ "values(?,?,?,?)";
			statement = connection.prepareStatement(query);
			System.out.println("Enter the Module  id:");
			int moduleID = scanner.nextInt();
			System.out.println("Enter the Employee  id:");
			int employeeID = scanner.nextInt();
			System.out.println("Enter the Completion Status:");
			String completion = scanner.next();
			System.out.println("Enter the Score:");
			double score = scanner.nextDouble();

			statement.setInt(1, moduleID);
			statement.setInt(2, employeeID);
			statement.setString(3, completion);
			statement.setDouble(4, score);
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
