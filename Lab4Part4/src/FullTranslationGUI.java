
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FullTranslationGUI extends JFrame implements ActionListener {

	ResourceBundle res;

	JPanel guiPanel = new JPanel();

	JTextArea area = new JTextArea("ffddf");

	JButton Button = new JButton("List all loales");

	String language[] = { "English", "French" };

	JComboBox<String> combo1 = new JComboBox<String>(language);
	

	public FullTranslationGUI() {

		Container contentPane = getContentPane();

		guiPanel.add(Button);

		guiPanel.add(combo1);
		combo1.setEditable(true);
		combo1.addActionListener(this);

		guiPanel.add(area);

		contentPane.add(guiPanel);

		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		FullTranslationGUI myGui = new FullTranslationGUI();
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() instanceof JButton) {
			try {
				ProgramProperties en = new ProgramProperties();

				String item = combo1.getEditor().getItem().toString();
				combo1.getEditor().setItem(res.getString("greeting"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}
}
