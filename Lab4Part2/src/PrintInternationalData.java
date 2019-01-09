import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;

/**
 * 
 * @author Stephen Blaney Student Number B00076157 Language Java
 */

public class PrintInternationalData {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * 3 methods that are used tp print out all all the difffent pieces of
		 * information in each of the 3 lanuages.
		 */

		Germany(); // Call the Germany Method
		France(); // Call the France Method
		English(); // Call the English Method

	}

	public static void Germany() {
		/**
		 * Start of the germany Method
		 */

		System.out.println(
				"GERMAN:"); /**
							 * Print out the world GERMANY to the screen
							 */

		double pintOfMilk = 2.50; // Declare and initionilse pintOfMilk

		Locale locale = new Locale("de", "DE"); // Created the German Locale

		DateFormat full = DateFormat.getDateInstance(DateFormat.LONG, locale);
		System.out.println(full.format(new Date()));// Date formater to localise
													// german date

		NumberFormat percForm = NumberFormat.getPercentInstance(locale);
		NumberFormat currencyForm = NumberFormat.getCurrencyInstance(locale);

		percForm.setMinimumFractionDigits(2);

		// Display results in currency format
		System.out.println(currencyForm.format(pintOfMilk));

		// Some internationalised date stuff!!!
		DateFormatSymbols dfs = new DateFormatSymbols(locale);
		String dayNames[] = dfs.getWeekdays();

		// Set calendar days
		for (int i = 0; i < 7; i++) {
			System.out.println(dayNames[i + 1]);
		}
		System.out.println("");

	}

	public static void France() {

		/**
		 * Start of the germany Method
		 */

		System.out.println("FRENCE:");

		double pintOfMilk = 2.50;

		Locale locale = new Locale("fr", "FR");

		DateFormat full = DateFormat.getDateInstance(DateFormat.LONG, locale);
		System.out.println(full.format(new Date()));

		NumberFormat percForm = NumberFormat.getPercentInstance(locale);
		NumberFormat currencyForm = NumberFormat.getCurrencyInstance(locale);

		percForm.setMinimumFractionDigits(2);

		// Display results in currency format
		System.out.println(currencyForm.format(pintOfMilk));

		// Some internationalised date stuff!!!
		DateFormatSymbols dfs = new DateFormatSymbols(locale);
		String dayNames[] = dfs.getWeekdays();

		// Set calendar days
		for (int i = 0; i < 7; i++) {
			System.out.println(dayNames[i + 1]);
		}
		System.out.println("");

		/**
		 * End of method French
		 */

	}

	public static void English() {
		/**
		 * Start of English method
		 */
		System.out.println("ENGLISH:");

		double pintOfMilk = 2.50;

		Locale locale = new Locale("en", "UK");

		DateFormat full = DateFormat.getDateInstance(DateFormat.LONG, locale);
		System.out.println(full.format(new Date()));

		NumberFormat percForm = NumberFormat.getPercentInstance(locale);
		NumberFormat currencyForm = NumberFormat.getCurrencyInstance(locale);

		percForm.setMinimumFractionDigits(2);

		// Display results in currency format
		System.out.println(currencyForm.format(pintOfMilk));

		// Some internationalised date stuff!!!
		DateFormatSymbols dfs = new DateFormatSymbols(locale);
		String dayNames[] = dfs.getWeekdays();

		// Set calendar days
		for (int i = 0; i < 7; i++) {
			System.out.println(dayNames[i + 1]);
		}
		System.out.println("");
		// end of english method

	}

}
