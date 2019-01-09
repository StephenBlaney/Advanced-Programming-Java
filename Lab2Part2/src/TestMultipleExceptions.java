
public class TestMultipleExceptions {

	public static void main(String[] args) {
		try {
			
			int[] myIntArray = new int[] { 1, 2, 3, 4 };
			System.out.println(myIntArray[5]);
			//this value is beyond the range of the array

			String s = "FOOBAR";
			int i = Integer.parseInt(s);
			// this line of code will never be reached
			System.out.println("int value = " + i);

		}

		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("The array out of bounds catch was excuted");

		}

		catch (NumberFormatException n) {
			n.printStackTrace();
			System.out.println("The Number format exception catch was excuted");

		}

		catch (Exception l) {
			l.printStackTrace();
			System.out.println("The Exception catch was excuted");

		}

		finally {

		}

	}

}
