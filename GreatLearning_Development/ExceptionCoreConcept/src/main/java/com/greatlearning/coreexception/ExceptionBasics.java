package com.greatlearning.coreexception;

public class ExceptionBasics {
	public static void main(String[] args) {

		try {
			int result = 10 / 0;
			System.out.println(result);
		} catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();

		}

		try {
			isAgeEligibleforToDoVote(17);
		} catch (AgeInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void isAgeEligibleforToDoVote(int age) throws AgeInvalidException, NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException {
		if (age < 18) {
			throw new AgeInvalidException("Age Invalid to do vote");
		} else {
			System.out.println("Eligible for vote");
		}
	}
}
