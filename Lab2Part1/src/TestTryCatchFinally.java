
public class TestTryCatchFinally {

	public static void main(String[] args) {
		try {

			String s = null;
			s.toString();

		}

		catch (NullPointerException e) {
			e.printStackTrace();

		}

		finally {

			System.out.println("PrintStackTrace has been called");

		}

	}

}
