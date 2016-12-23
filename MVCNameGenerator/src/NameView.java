import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class NameView extends NameController {
	 public NameView()
	 {
		 

	JFrame f = new JFrame("Name");
	final JPanel panel = new JPanel();
	
	panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	panel.setLayout(new FlowLayout());

	JButton warriorButton = new JButton();
	warriorButton.setText("Generate Custom Name");
	warriorButton.setPreferredSize(new Dimension(100, 50));
	panel.add(warriorButton);

	JButton button2 = new JButton();
	button2.setText("Generate Warrior Name");
	panel.add(button2);

	JButton button3 = new JButton();
	button3.setText("Generate Robot Name");
	panel.add(button3);

	JButton button4 = new JButton();
	button4.setText("Generate Wizard Name");
	panel.add(button4);

	JButton button5 = new JButton();
	button5.setText("Generate Ninja Name");
	panel.add(button5);


	warriorButton.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {

			JLabel generatedNameLabel = new JLabel(generateName(), SwingConstants.CENTER);
			JOptionPane.showMessageDialog(f.getComponent(0), generatedNameLabel, null, JOptionPane.PLAIN_MESSAGE);

		}
	});

	
	button2.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {

			JLabel generatedNameLabel = new JLabel(generateWarriorName(), SwingConstants.CENTER);
			JOptionPane.showMessageDialog(f.getComponent(0), generatedNameLabel, null, JOptionPane.PLAIN_MESSAGE);

		}
	});

	button3.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {

			JLabel generatedNameLabel = new JLabel(randomIdentifier(), SwingConstants.CENTER);
			JOptionPane.showMessageDialog(f.getComponent(0), generatedNameLabel, null, JOptionPane.PLAIN_MESSAGE);

		}
	});

	button4.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {

			JLabel generatedNameLabel = new JLabel(generateWizardName(), SwingConstants.CENTER);
			JOptionPane.showMessageDialog(f.getComponent(0), generatedNameLabel, null, JOptionPane.PLAIN_MESSAGE);

		}
	});
	
	button5.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {

			JLabel generatedNameLabel = new JLabel(generateNinjaName(), SwingConstants.CENTER);
			JOptionPane.showMessageDialog(f.getComponent(0), generatedNameLabel, null, JOptionPane.PLAIN_MESSAGE);

		}
	});
	
	
	GridLayout experimentLayout = new GridLayout(0, 2, 20, 20);

	panel.setLayout(experimentLayout);

	panel.add(warriorButton);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(button5);
	f.getContentPane().add(panel, BorderLayout.CENTER);
	f.setSize(400, 400);
	f.pack();

	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLocationRelativeTo(null);
	f.setVisible(true);
	 }
	 
	 
	 
}
