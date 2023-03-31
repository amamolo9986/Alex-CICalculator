package com.coderscampus.main;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String initialInvestmentInput = collectInput(scan, "What is your initial investment amount?");
		String interestRateInput = collectInput(scan, "What is your interest rate?");

		double newBalance = Double.parseDouble(initialInvestmentInput);
		double interestRate = Double.parseDouble(interestRateInput);

		for (int i = 0; i < 6; i++) {
			newBalance = calculateAndOutput(newBalance, interestRate, i);
			System.out.println("Your investment after " + ((i * 5) + 5) + " years is " + newBalance);
		}
		scan.close();
	}

	private static double calculateAndOutput(double newBalance, double interestRate, int index) {
		for (int i = 0; i < 5; i++) {
			newBalance = newBalance * (interestRate + 1.0);
		}
		return newBalance;

	}

	public static String collectInput(Scanner scan, String displayConsoleMessage) {
		System.out.println(displayConsoleMessage);
		String userInput = scan.nextLine();
		return userInput;
	}

}
