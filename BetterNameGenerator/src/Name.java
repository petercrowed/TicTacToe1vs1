import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Name {

	public Name() {
		// test
		JFrame f = new JFrame("Name");
		final JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setLayout(new FlowLayout());

		JButton button = new JButton();
		button.setText("Generate Custom Name");
		button.setPreferredSize(new Dimension(100, 50));
		panel.add(button);

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

		GridLayout experimentLayout = new GridLayout(0, 2, 20, 20);

		panel.setLayout(experimentLayout);

		panel.add(button);
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

		button.addActionListener(new ActionListener() {

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

	}

	public static void main(String[] args) {

		new Name();

	}

	// Generate Name
	private static String[] Beginning = { "Kr", "Ca", "Ra", "Mrok", "Cru", "Ray", "Bre", "Zed", "Drak", "Mor", "Jag",
			"Mer", "Jar", "Mjol", "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro", "Mar", "Luk", "a",
			"e", "i", "o", "u", "ei", "ai", "ou", "j", "ji", "y", "oi", "au", "oo" };
	private static String[] Middle = { "air", "ir", "mi", "sor", "mee", "clo", "red", "cra", "ark", "arc", "miri",
			"lori", "cres", "mur", "zer", "marac", "zoir", "slamar", "salmar", "urak", "b", "c", "d", "f", "g", "h",
			"k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z", "ch", "bl", "br", "fl", "gl", "gr", "kl",
			"pr", "st", "sh", "th" };
	private static String[] End = { "d", "ed", "ark", "arc", "es", "er", "der", "tron", "med", "ure", "zur", "cred",
			"mur", "b", "d", "f", "g", "h", "k", "l", "m", "n", "p", "r", "s", "t", "v", "w", "z", "ch", "gh", "nn",
			"st", "sh", "th", "tt", "ss", "pf", "nt" };

	private static Random rand = new Random();

	public static String generateName() {

		String name = Beginning[rand.nextInt(Beginning.length)] + Middle[rand.nextInt(Middle.length)]
				+ End[rand.nextInt(End.length)];
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		return name;

	}

	// Generate Robot Name
	// class variable
	final static String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";

	final static java.util.Random rand1 = new java.util.Random();

	// consider using a Map<String,Boolean> to say whether the identifier is
	// being used or not
	final static Set<String> identifiers = new HashSet<String>();

	public static String randomIdentifier() {
		StringBuilder builder = new StringBuilder();
		while (builder.toString().length() == 0) {
			int length = rand1.nextInt(5) + 5;
			for (int i = 0; i < length; i++) {
				builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
			}
			if (identifiers.contains(builder.toString())) {
				builder = new StringBuilder();
			}
		}
		return builder.toString();
	}

	private static String[] firstWarrior = { "hammer", "stone", "rock", "fist", "strength" };

	private static String[] secondWarriorName = { "an", "ar", "ad", "et", "ief", "ob", "or", "od" };

	public static String generateWarriorName() {

		String fullName = null;

		String name = " ";
		String nameBeginning = Beginning[rand.nextInt(Beginning.length)];
		String nameEnding = secondWarriorName[rand.nextInt(secondWarriorName.length)];

		name = nameBeginning + nameEnding;
		name = name.substring(0, 1).toUpperCase() + name.substring(1);

		String nameBeginning2 = firstWarrior[rand.nextInt(firstWarrior.length)];
		String nameEnding2 = firstWarrior[rand.nextInt(firstWarrior.length)];

		String surName = " ";

		// Need to do Recusrive
		if (nameBeginning2 != nameEnding2) {
			surName = duplicate(nameBeginning2, nameEnding2);

		}

		fullName = name + " " + surName;
		return fullName;

	}

	public static String duplicate(String nameBeginning2, String nameEnding2) {
		String surName = " ";
		surName = nameBeginning2 + nameEnding2;
		surName = surName.substring(0, 1).toUpperCase() + surName.substring(1);
		return surName;
	}

	private static String[] firstWizardName = { "faria", "baro", "strako", "fernot", "rein", "demi" };

	private static String[] secondWizardName = { "es", "as", "ald", "and", "alf", "am", "an" };

	public static String generateWizardName() {

		String name = " ";
		String nameBeginning = firstWizardName[rand.nextInt(firstWizardName.length)];
		String nameEnding = secondWizardName[rand.nextInt(secondWizardName.length)];

		name = nameBeginning + nameEnding;
		name = name.substring(0, 1).toUpperCase() + name.substring(1);

		return name;

	}

}