package Exception;

import Exception.NotMyPhoneMakeException;
import java.util.Scanner;

/**
 * 
 * @author Stephen Blaney 28/02/2016 Language Java
 * 
 */

public class MyMobilePhoneMakeChecker {

	static String inputPhone;
	static String Samsung = "Samsung";

	/**
	 * 
	 * @param args
	 * 
	 */

	public static void main(String[] args) {
		try {
			checkMyMobilePhoneMake(inputPhone);
		} catch (NotMyPhoneMakeException e) {

			e.printStackTrace();
		}

	}

	/**
	 * End of main method
	 */

	/**
	 * 
	 * @param inputPhone
	 * @throws NotMyPhoneMakeException
	 *             when anything other then Samsung is entered This method Asks
	 *             the user to input their make of their phone (Samsung)
	 * 
	 */

	public static void checkMyMobilePhoneMake(String inputPhone) throws NotMyPhoneMakeException {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter a phone make");

		inputPhone = scan.nextLine();

		if (inputPhone.equals("Samsung")) {
			System.out.println("You have entered the correct phone");

		}
		/**
		 * when the inputPhone is not = to Samsung the exception is thrown
		 */

		else if (inputPhone != Samsung) {
			throw new NotMyPhoneMakeException();

		}
	}

}
