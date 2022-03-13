package com.csi.controller;

import java.util.Scanner;

import com.csi.model.Employee;
import com.csi.service.EmployeeCredentialService;

public class EmployeeController {
	public static void main(String[] args) {

		Employee employee = new Employee("KIRAN", "JADHAV");

		EmployeeCredentialService credentialService = new EmployeeCredentialService();
		String generatedEmail;

		char[] generatedPassword;

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n Please enter options: ");

		System.out.println("\n 1. Technical\n 2. Admin \n 3. Human Resource\n 4. Legal");

		int option = scanner.nextInt();

		switch (option) {
		case 1:

			generatedEmail = credentialService.generatedEmail(employee.getFirstName(), employee.getLastName(), "tech");

			generatedPassword = credentialService.generatedPassword();

			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
			break;

		case 2:
			generatedEmail = credentialService.generatedEmail(employee.getFirstName(), employee.getLastName(), "admin");

			generatedPassword = credentialService.generatedPassword();

			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
			break;

		case 3:
			generatedEmail = credentialService.generatedEmail(employee.getFirstName(), employee.getLastName(), "hr");

			generatedPassword = credentialService.generatedPassword();

			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
			break;

		case 4:
			generatedEmail = credentialService.generatedEmail(employee.getFirstName(), employee.getLastName(), "legel");

			generatedPassword = credentialService.generatedPassword();

			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
}
