package cypher;

public class CodeBreaker {

	/**
	 * 
	 * 
	 * @param call methods from other class's
	 */

	public static void main(String[] args) {

		String passcode = Encoder.encrypt("Password");

		System.out.println(passcode);
		System.out.println(Decoder.decrypt(passcode));

	}

}
