package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import encoder.encoding;

public class CodeFrame extends JFrame implements ActionListener {

	JTextField ta2 = new JTextField(20);

	JButton button = new JButton("Encode");

	JLabel CodeLabel = new JLabel("The encoded text is");

	JTextField ta1 = new JTextField(20);

	public CodeFrame() {

		super("Encoded labels");

		Container contentPane = getContentPane();

		JPanel labelpanel = new JPanel();

		JLabel nameLabels = new JLabel("Enter text to encode");

		labelpanel.add(nameLabels);

		labelpanel.add(ta1);

		labelpanel.add(CodeLabel);
		ta2.addActionListener(this);

		labelpanel.add(ta2);

		labelpanel.add(button);
		button.addActionListener(this);

		contentPane.add(labelpanel);

		// set the frame properties
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String args[])

	/**
	 * @parem args these are the command line arguments.
	 */
	{

		CodeFrame myFrame = new CodeFrame();

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			String text = ta1.getText();
			String newText = encoding.encrypt(text);

			ta2.setText(newText);

		}

	}

}// end of class

