/**
 * File Name: AppBasics.java<br>
 * GS, Sheeba<br>
 * Created: Oct 6, 2017
 */
package com.sqa.gs.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author GS, Sheeba
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Helper method which farewells user at the end of application and says
	 * Thank you Wish you well.
	 *
	 * @param name
	 *            represents Name of User
	 * @param appName
	 *            represents Name of application
	 */
	public static void farewellUser(String name, String appName) {
		System.out.println("Thank you " + name + ", for using the" + appName + ".\nHave a great day!");
	}

	/**
	 * Helper method which greets the user and welcomes them to the application.
	 * This method then takes their name and returns it to calling method
	 *
	 * @param appName
	 *            represents The name of the application
	 * @return Name of assigned User
	 */
	public static String greetUserandGetName(String appName) {
		System.out.println("Welcome to my " + appName + " application");
		System.out.print("Could I get your name please?");
		return scanner.nextLine();
	}
}
