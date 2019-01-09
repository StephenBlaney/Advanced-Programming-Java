import javax.swing.*;
import java.awt.*;
import java.io.*;

public class TestDeclaringExceptions {

	public static void main(String args[]) {

		/**
		 * 
		 */

		reverseString();

		try {
			openfile();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void reverseString() throws NullPointerException {

		StringBuffer a = new StringBuffer("Stephen");
		System.out.println(a.reverse());

	}

	public static void openfile() throws IOException {

		File file = new File("c: \\Users\\Stephen Blaney\\workspace\\Lab1Part1\\src\\EclpesSimpleExample.java");
		boolean NewFile = file.exists();
		System.out.println(file.exists());

	}

}
