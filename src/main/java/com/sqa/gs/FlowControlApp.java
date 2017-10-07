/**
 * File Name: FlowControlApp.java<br>
 * GS, Sheeba<br>
 * Created: Oct 6, 2017
 */
package com.sqa.gs;

import java.util.*;

import com.sqa.gs.helpers.*;

/**
 * FlowControlApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author GS, Sheeba
 * @version 1.0.0
 * @since 1.0
 */
public class FlowControlApp {

	private static String appName = "Flow Control App";

	public static void main(String[] args) {
		String name = AppBasics.greetUserandGetName(appName);
		evalNumberAgainst10();
		determineMonthBasedOnInt();
		evalGrade();
		AppBasics.farewellUser(name, appName);
	}

	/**
	 * Write a program that prints the name of month using switch statement
	 * given a number from the user. *You will need to use the
	 * Integer.parseInt() method to convert a user supplied string to a number
	 * type variable that can be evaluated.
	 */
	private static void determineMonthBasedOnInt() {
		System.out.println("Please enter a integer between 1 and 12");
		Scanner scanner = new Scanner(System.in); // Obtain input from user
													 // System.in
		String input = scanner.nextLine(); // Store that input as a string
		int num = Integer.parseInt(input); // Convert string input from user to
											 // a "int" - in order to use Switch
		switch (num) {
		case 1:
			System.out.println("Month is January");
			break;
		case 2:
			System.out.println("Month is February");
			break;
		case 3:
			System.out.println("Month is March");
			break;
		case 4:
			System.out.println("Month is April");
			break;
		case 5:
			System.out.println("Month is May");
			break;
		case 6:
			System.out.println("Month is June");
			break;
		case 7:
			System.out.println("Month is July");
			break;
		case 8:
			System.out.println("Month is August");
			break;
		case 9:
			System.out.println("Month is September");
			break;
		case 10:
			System.out.println("Month is October");
			break;
		case 11:
			System.out.println("Month is November");
			break;
		case 12:
			System.out.println("Month is December");
			break;
		default:
			System.out.println("Please provide a number between 1 and 12");
			break;
		}
	}

	/**
	 * Write a program that can ask the user for a grade value and print the
	 * associated grade letter.
	 */
	private static void evalGrade() {
		System.out.println("Please enter your grade value \n");
		Scanner scanner = new Scanner(System.in); // Obtain input from user
													 // System.in
		String input = scanner.nextLine(); // Store that input as a string
		double num = Double.parseDouble(input); // Using double data type for
												 // precision
		if (num > 4) {
			System.out.println("Enter a valid grade between 0 and 4");
		} else if (num > 3.29) {
			System.out.println("Grade is A! Congrats");
		} else if (num > 2.29) {
			System.out.println("Grade is B!");
		} else if (num > 1.29) {
			System.out.println("Grade is C!");
		} else if (num > 0) {
			System.out.println("Grade is D!");
		} else if (num == 0) {
			System.out.println("Grade is E!");
		} else
			System.out.println("Enter a valid grade between 0 and 4");
	}

	/**
	 * Write a function which takes a int parameter and print the message on
	 * screen that “number is greater than 10” otherwise it should print “number
	 * is smaller than 10” (Can you support if parameter is equal to 10)
	 */
	private static void evalNumberAgainst10() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number to evaluate against 10: ");
		String input = scanner.nextLine();
		int number = Integer.parseInt(input);
		if (number > 10) {
			System.out.println("Number is greater than 10");
		} else if (number < 10) {
			System.out.println("Number is smaller than 10");
		} else {
			System.out.println("Number is equal to 10");
		}
	}
}
