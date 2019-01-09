
public class Nested_try_catch_statement {
	public static void main(String args[]) {
		try {
			try {
				/**
				 * an integer "divide by zero" throws an instance of this class
				 */
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			/**
			 * the array is calling a value outside of the array
			 */

			try {
				int a[] = new int[5];
				a[5] = 10;
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {

		}

	}
}
