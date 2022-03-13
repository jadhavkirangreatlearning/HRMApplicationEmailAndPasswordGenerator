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

		System.out.println("\n 1. Technical\n 2. HR \n 3. FINANCE");

		int option = scanner.nextInt();

		switch (option) {
		case 1:

			generatedEmail = credentialService.generatedEmail(employee, "cs.com", "tech");

			generatedPassword = credentialService.generatedPassword();

			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
			break;

		case 2:
			generatedEmail = credentialService.generatedEmail(employee, "cs.com", "hr");

			generatedPassword = credentialService.generatedPassword();

			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
			break;

		case 3:
			generatedEmail = credentialService.generatedEmail(employee, "cs.com", "fin");

			generatedPassword = credentialService.generatedPassword();

			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
}
