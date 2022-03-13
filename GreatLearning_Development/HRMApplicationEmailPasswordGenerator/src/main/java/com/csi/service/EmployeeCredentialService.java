package com.csi.service;

import java.util.Random;

import com.csi.model.Employee;

public class EmployeeCredentialService {

	public char[] generatedPassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;

		// Using random method
		Random random = new Random();

		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			password[i] = values.charAt(random.nextInt(values.length()));

		}
		return password;
	}

	public String generatedEmail(Employee employee, String generatedEmail, String department) {
		return employee.getFirstName() + employee.getLastName() + "@" + generatedEmail + ".cs.com";

	}

	public void showCredentials(Employee employee, String email, char[] password) {
		System.out.println("\n Employee: " + employee.getFirstName());
		System.out.println("\n Email: " + email);
		System.out.println("\n Password: " + String.valueOf(password));
	}

}
