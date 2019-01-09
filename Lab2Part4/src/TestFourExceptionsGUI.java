
//* imported all nessaesary packages 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.io.*;

/**
 * 
 * @author Stephen Blaney
 *
 */

public class TestFourExceptionsGUI extends JFrame implements ActionListener {

	/**
	 * All global varible to allow all methods to acces them
	 */

	JButton exbutton1 = new JButton("Test Null Pointer Exceptions");

	JButton exbutton2 = new JButton("Test IO Exception");

	JButton exbutton3 = new JButton("Test URL Exception");

	JButton exbutton4 = new JButton("Test General Exception");

	JOptionPane pane = new JOptionPane();

	public TestFourExceptionsGUI() {
		super("Exceptions");

		Container contentPane = getContentPane();

		JPanel epanel = new JPanel();

		/**
		 * add Exbutton1 to epanel and add the Listener add Exbutton2 to epanel
		 * and add the listener add Exbutton3 to epanel and add the listener add
		 * Exbutton4 to epanel and add the listener
		 */

		epanel.add(exbutton1);
		exbutton1.addActionListener(this);

		epanel.add(exbutton2);
		exbutton2.addActionListener(this);

		epanel.add(exbutton3);
		exbutton3.addActionListener(this);

		epanel.add(exbutton4);
		exbutton4.addActionListener(this);

		contentPane.add(epanel);

		setSize(300, 200);
		setVisible(true);
	}

	/**
	 * 
	 * @param args
	 *            Start of main method
	 */
	public static void main(String args[]) {

		TestFourExceptionsGUI myFrame = new TestFourExceptionsGUI();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	/**
	 * 
	 * @param str
	 * @param filename
	 * @param url
	 * @param generalExceptionActivated
	 */
	public void testException(String str, String filename, String url, boolean generalExceptionActivated) {
		/**
		 * try and catch on all exceptions
		 */
		try {

			str.toCharArray(); // Null string potential error
			new FileReader(filename); // Unknown filename potential error
			new URL(url); // Badly written URL potential error
			if (generalExceptionActivated) {

				this.clone();
			}
		}

		catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(null, "A URL has been caught" + e.getMessage(), "Title",
					JOptionPane.INFORMATION_MESSAGE);

		}

		catch (IOException e) {
			JOptionPane.showMessageDialog(null, "An IO Exception has been caught" + e.getMessage(), "Title",
					JOptionPane.INFORMATION_MESSAGE);

		}

		catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "A Null Pointer Exception has been caught" + e.getMessage(), "Title",
					JOptionPane.INFORMATION_MESSAGE);

		}

		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Some general unidenitfied Exception has been caught" + e.getMessage(),
					"Title", JOptionPane.INFORMATION_MESSAGE);

		}

		finally {
			JOptionPane.showMessageDialog(null, "The finally block has been called", "Title",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}
	
	/**
	 *Action that will call the exceptions on the buttons  
	 */

	public void actionPerformed(ActionEvent e) {
		 
		if (e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals("Test URL Exception")) {
				testException("Hi", "Real.txt", "ht//www.itb.ie", false);

			} else if (e.getActionCommand().equals("Test IO Exception")) {
				testException("Hi", "Whatever.txt", "http://www.itb.ie", false);

			} else if (e.getActionCommand().equals("Test Null Pointer Exceptions")) {
				testException(null, "Real.txt", "http://www.itb.ie", false);

			} else if (e.getActionCommand().equals("Test General Exception"))

				testException("Hi", "Real.txt", "http://www.itb.ie", true);

		}

	}
}
