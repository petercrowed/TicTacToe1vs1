import java.awt.Color;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class TicTacToe {

	private JPanel panel;
	public JButton[] buttons;
	private final int SIZE = 3;
	private GridLayout experimentLayout;

	public int number;
	public int round = 0;
	
	public ArrayList<Integer> mNumbers = new ArrayList<Integer>();
	public ArrayList<String> fieldAndSymbol = new ArrayList<String>();
	public static final int CROSS = 1;
	public static final int NOUGHT = 2;
	public static int currentPlayer;
	public static boolean noDraw = false;
	boolean[] boardState = new boolean[8];

	public TicTacToe(int i) {

		JFrame frame = new JFrame("Tic Tac Toe");

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		experimentLayout = new GridLayout(SIZE, SIZE);
		panel = new JPanel();
		panel.setLayout(experimentLayout);

		buttons = new JButton[9];
		addButtons(panel, i);

		frame.add(panel);

		frame.setVisible(true);
	}

	public void disableButtons() {
		for (int k = 0; k < 3; k++) {
		
				buttons[k].setEnabled(false);
			
		}
	}

	public void showWinMessageForX() {
		noDraw  = true;
		JOptionPane.showMessageDialog(null, " X WINS!", " " + " ", JOptionPane.INFORMATION_MESSAGE);
	}

	public void showWinMessageForO() {
		JOptionPane.showMessageDialog(null, " O WINS!", " " + " ", JOptionPane.INFORMATION_MESSAGE);
		noDraw  = true;
	}
	
	public void showDrawMessage() {
		JOptionPane.showMessageDialog(null, "Draw!", " " + " ", JOptionPane.INFORMATION_MESSAGE);
	}

	public void checkForWinX() {

		for (int k = 0; k < 3; k++) {

			if (buttons[k].getText() == "X" && buttons[k + 3].getText() == "X" && buttons[k + 6].getText() == "X") {

				buttons[k].setBackground(Color.CYAN);
				buttons[k + 3].setBackground(Color.CYAN);
				buttons[k + 6].setBackground(Color.CYAN);
				disableButtons();
				showWinMessageForX();

			}

		}

		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			if (buttons[3 * i].getText() == "X" && buttons[3 * i + 1].getText() == "X"
					&& buttons[3 * i + 2].getText() == "X") {

				buttons[3 * i].setBackground(Color.CYAN);
				buttons[3 * i + 1].setBackground(Color.CYAN);
				buttons[3 * i + 2].setBackground(Color.CYAN);
				disableButtons();
				showWinMessageForX();

			}

		}
		if (buttons[0].getText() == "X" && buttons[4].getText() == "X" && buttons[8].getText() == "X") {
			buttons[0].setBackground(Color.CYAN);
			buttons[4].setBackground(Color.CYAN);
			buttons[8].setBackground(Color.CYAN);
			disableButtons();
			showWinMessageForX();
		}

		if (buttons[2].getText() == "X" && buttons[4].getText() == "X" && buttons[6].getText() == "X") {
			buttons[2].setBackground(Color.CYAN);
			buttons[4].setBackground(Color.CYAN);
			buttons[6].setBackground(Color.CYAN);
			disableButtons();
			showWinMessageForX();
		}

	}

	public void checkForWinO() {

		for (int k = 0; k < 3; k++) {

			if (buttons[k].getText() == "O" && buttons[k + 3].getText() == "O" && buttons[k + 6].getText() == "O") {

				buttons[k].setBackground(Color.CYAN);
				buttons[k + 3].setBackground(Color.CYAN);
				buttons[k + 6].setBackground(Color.CYAN);
				disableButtons();
				showWinMessageForO();

			}

		}

		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			if (buttons[3 * i].getText() == "O" && buttons[3 * i + 1].getText() == "O"
					&& buttons[3 * i + 2].getText() == "O") {

				buttons[3 * i].setBackground(Color.CYAN);
				buttons[3 * i + 1].setBackground(Color.CYAN);
				buttons[3 * i + 2].setBackground(Color.CYAN);
				disableButtons();
				showWinMessageForO();

			}

		}
		if (buttons[0].getText() == "O" && buttons[4].getText() == "O" && buttons[8].getText() == "O") {
			buttons[0].setBackground(Color.CYAN);
			buttons[4].setBackground(Color.CYAN);
			buttons[8].setBackground(Color.CYAN);
			disableButtons();
			showWinMessageForO();
		}

		if (buttons[2].getText() == "O" && buttons[4].getText() == "O" && buttons[6].getText() == "O") {
			buttons[2].setBackground(Color.CYAN);
			buttons[4].setBackground(Color.CYAN);
			buttons[6].setBackground(Color.CYAN);
			disableButtons();
			showWinMessageForO();
		}

	}
	
	public int playerTurn(int i) {
		if (i == 1) {
			currentPlayer = (currentPlayer == CROSS) ? NOUGHT : CROSS;
		}

		if (i == 2) {
			currentPlayer = (currentPlayer == NOUGHT) ? CROSS : NOUGHT;
		}

		return currentPlayer;
	}


	public void addButtons(JPanel panel, int i) {

		// MagicNumbers();

		for (int k = 0; k < 9; k++) {
			 {
				for(int l = 0;  l < 8; l++)
				{
					{
						String valueFromInt = Integer.toString(l);
						buttons[k] = new JButton(" ");
						buttons[k].setName(valueFromInt);

					}

				}
				
				buttons[k].addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						// this makes sure the button you are pressing is the
						// button variable
						if (e.getSource() == buttons[0] || e.getSource() == buttons[1]
								|| e.getSource() == buttons[2] || e.getSource() == buttons[3]
								|| e.getSource() == buttons[4]|| e.getSource() == buttons[5]
								|| e.getSource() == buttons[6] || e.getSource() == buttons[7]
								|| e.getSource() == buttons[8]) 
						{

							if (playerTurn(i) == 1) {
								((AbstractButton) e.getSource()).setText("X");
								((AbstractButton) e.getSource()).setEnabled(false);
								round++;
								System.out.println("X");
							}

							else

							{
								((AbstractButton) e.getSource()).setText("O");
								((AbstractButton) e.getSource()).setEnabled(false);
								System.out.println("O");
								round++;
							}
							System.out.println("Round :" + round);
							
							checkForWinX();
							checkForWinO();
													
							if(round == 9 && noDraw  == false)
							{
								showDrawMessage();
							}
						}
					}
				});

				panel.add(buttons[k]);

			}
		}
	}

	public static void main(String[] args) {

		final JFrame parent = new JFrame();
		JButton button = new JButton();
		button.setPreferredSize(new Dimension(40, 40));

		button.setText("Start The Game!");
		parent.setSize(200, 100);
		parent.setLocationRelativeTo(null);
		parent.add(button);

		parent.setVisible(true);

		String btnString1 = "X";
		String btnString2 = "O";

		Object[] options = { btnString1, btnString2 };

		button.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				int result = JOptionPane.showOptionDialog(null, "X or O? X Starts!", "Warning",
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				switch (result) {
				case 0:
					new TicTacToe(1);
					break;
				case 1:
					new TicTacToe(2);
					break;
				}

			}
		});

	}

}