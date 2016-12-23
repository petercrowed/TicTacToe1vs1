import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class NameController extends NameModel{

	private DefaultTableModel model;

	
	
	
	private static Random rand = new Random();

	public static String generateName() {

		String name = (String)Beginning[rand.nextInt(Beginning.length)] + (String)Middle[rand.nextInt(Middle.length)]
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

	
	public static String generateWarriorName() {

		String fullName = null;

		String name = " ";
		String nameBeginning = (String) Beginning[rand.nextInt(Beginning.length)];
		String nameEnding = (String) secondWarriorName[rand.nextInt(secondWarriorName.length)];

		name = nameBeginning + nameEnding;
		name = name.substring(0, 1).toUpperCase() + name.substring(1);

		String nameBeginning2 = (String) firstWarrior[rand.nextInt(firstWarrior.length)];
		String nameEnding2 = (String) firstWarrior[rand.nextInt(firstWarrior.length)];

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

	

	public static String generateWizardName() {

		String name = " ";
		String nameBeginning = (String) firstWizardName[rand.nextInt(firstWizardName.length)];
		String nameEnding = (String) secondWizardName[rand.nextInt(secondWizardName.length)];

		name = nameBeginning + nameEnding;
		name = name.substring(0, 1).toUpperCase() + name.substring(1);

		return name;

	}
	
	public static String generateNinjaName() {

		String name = " ";
		String nameBeginning = (String) ninjaName[rand.nextInt(ninjaName.length)];
		String nameEnding = (String) ninjaName[rand.nextInt(ninjaName.length)];

		name = nameBeginning + nameEnding;
		name = name.substring(0, 1).toUpperCase() + name.substring(1);

		return name;

	}
	
	
}
