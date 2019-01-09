import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * 
 * @author Stephen Blaney Student number B00076157 Date 29/02/2016 Language Java
 */

public class RetryCatchBlockGui extends JFrame implements ActionListener {
	/**
	 * create global verables to allow all methods to access them
	 */

	JTextField inputField = new JTextField(20);

	JLabel outputLabel = new JLabel("String length =");

	JButton stringLengthButton = new JButton("Get String Length");

	int Size;

	public RetryCatchBlockGui() {
		/**
		 * Create the Content Jframe and components and add them to the panel
		 */

		super("Retry catch block gui");

		Container contentPane = getContentPane();

		JPanel Guipanel = new JPanel();

		Guipanel.add(outputLabel);

		Guipanel.add(inputField);
		inputField.addActionListener(this);

		Guipanel.add(stringLengthButton);
		stringLengthButton.addActionListener(this);

		contentPane.add(Guipanel);

		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String args[])

	{
		/**
		 * main method
		 */
		RetryCatchBlockGui myFrame = new RetryCatchBlockGui();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	/**
	 * End of main method
	 */

	public void actionPerformed(ActionEvent e) {
		/**
		 * Action Performed method thats will provide functionality to the
		 * button
		 */
		if (e.getSource() instanceof JButton) {
			/**
			 * Try and Catch to catch the Null pointer exception
			 */
			try {
				/**
				 * If their is no input for inputfield generate the exception
				 */
				Size = inputField.getText().length();
				if (Size == 0) {
					String s = null;
					s.toCharArray();

				}
			}

			catch (NullPointerException s) {
				/**
				 * Catch the exception and provide the user with the option of
				 * entering the string
				 */
				String inputValue = JOptionPane.showInputDialog(null, "Please enter a string ");
				inputField.setText(inputValue);

			}
			/**
			 * Set the label to the number of Characters in the Text
			 */
			outputLabel.setText("String length =" + Size);

		}
	}
}
/**
 * End of class
 */
