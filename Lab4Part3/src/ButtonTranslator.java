
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Resource.ProgramResource_fr;

//Sample GUI that uses resource bundles to internationalize 
public class ButtonTranslator extends JFrame implements ActionListener {

	JButton computeButton = new JButton("One");
	JButton computeButton1 = new JButton("Two");
	JButton computeButton2 = new JButton("Three");
	JButton computeButton3 = new JButton("Translate");

	public ButtonTranslator() {

		Container contentPane = getContentPane();

		JPanel guiPanel = new JPanel();

		guiPanel.add(computeButton);
		computeButton.addActionListener(this);

		guiPanel.add(computeButton1);
		computeButton1.addActionListener(this);

		guiPanel.add(computeButton2);
		computeButton3.addActionListener(this);

		guiPanel.add(computeButton3);
		computeButton3.addActionListener(this);

		contentPane.add(guiPanel);

		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		ButtonTranslator myGui = new ButtonTranslator();
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() instanceof JButton) {
			ProgramResource_fr fr = new ProgramResource_fr();
			computeButton.setText((String) fr.getObject("One"));
			computeButton1.setText((String) fr.getObject("Two"));
			computeButton2.setText((String) fr.getObject("Three"));
		}
	}
}
