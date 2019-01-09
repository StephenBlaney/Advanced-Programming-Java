
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Sample GUI that uses resource bundles to internationalize 
public class StopTheLights extends JFrame implements ActionListener {

	JButton Button1 = new JButton("On");
	JButton Button2 = new JButton("off");
	
	public StopTheLights() {
		super("Traffic light");

		Container contentPane = getContentPane();

		JPanel guiPanel = new JPanel();
		
		
		guiPanel.add(Button1);
		guiPanel.add(Button2);

		contentPane.add(guiPanel,BorderLayout.SOUTH);
				 

		setSize(300,400 );
		setVisible(true);
	}

	public void paint(Graphics g) {

		super.paint(g);

		//green

		g.setColor(Color.GREEN);

		g.fillOval(100, 200, 70, 70);

		g.setColor(Color.BLACK);

		g.drawOval(100, 200, 70, 70);

		// red

		g.setColor(Color.RED);

		g.fillOval(100, 40, 70, 70);

		g.setColor(Color.BLACK);

		g.drawOval(100, 40, 70, 70);
		
		
		
		//yellow
		g.setColor(Color.YELLOW);

		g.fillOval(100, 120, 70, 70);

		g.setColor(Color.BLACK);

		g.drawOval(100, 120, 70, 70);

	}

	public static void main(String[] args) {
		StopTheLights myGui = new StopTheLights();
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() instanceof JButton) {

		}
	}
}
