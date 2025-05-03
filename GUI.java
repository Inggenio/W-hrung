import javax.swing.*;
import java.awt.*;

public class GUI {
	JFrame meinFenster = new JFrame("W-hrung");
	JPanel panel = new JPanel();

	GridBagLayout gLayout = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();

	JLabel message = new JLabel("Hola Helena");

	JTextField wahrung1F = new JTextField(10);
	JLabel wahrung1T = new JLabel("Ausgangswährung");

	JTextField wahrung2F = new JTextField(10);
	JLabel wahrung2T = new JLabel("Zielwährung");

	JTextField wechsel = new JTextField("Wechselkurs");


	public void go(){

		//Layout
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(5,5,5,5);
		gbc.weightx = 0.2;
		gbc.weighty = 0.2;
		gbc.ipady = 10;
		gbc.ipadx = 10;
		gbc.gridheight = 1;

		//Panel Set
		panel.setLayout(gLayout);
		panel.setBackground(Color.darkGray);
		panel.setForeground(Color.darkGray);

		//Eingangs
		gbc.gridx = 0;
		gbc.gridy = 0;
		message.setForeground(Color.cyan);
		panel.add(message);

		//Knöpfe und Felder

		//Währung 1
		gbc.gridx = 0;
		gbc.gridy = 1;
		wahrung1T.setForeground(Color.LIGHT_GRAY);
		panel.add(wahrung1T,gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		panel.add(wahrung1F,gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		wahrung2T.setForeground(Color.LIGHT_GRAY);
		panel.add(wahrung2T,gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		message.setForeground(Color.cyan);
		panel.add(wahrung2F,gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		message.setForeground(Color.cyan);
		panel.add(wechsel,gbc);


		//Window
		meinFenster.add(panel);
		meinFenster.setSize(new Dimension(500,700));
		meinFenster.setVisible(true);
		meinFenster.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
