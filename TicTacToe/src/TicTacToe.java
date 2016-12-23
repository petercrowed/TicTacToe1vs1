import java.awt.Color;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class TicTacToe {

	private JPanel panel;
	public JButton[][] buttons;
	private final int SIZE = 3;
	private GridLayout experimentLayout;

	public int number;
	public int round = 0;
	
	public ArrayList<Integer> mNumbers = new ArrayList<Integer>();
	public ArrayList<String> fieldAndSymbol = new ArrayList<String>();
	public static final int CROSS = 1;
	public static final int NOUGHT = 2;
	public static int currentPlayer;

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

		buttons = new JButton[SIZE][SIZE];
		addButtons(panel, i);

		frame.add(panel);

		frame.setVisible(true);
	}

	public void disableButtons() {
		for (int k = 0; k < 3; k++) {
			for (int j = 0; j < 3; j++) {
				buttons[k][j].setEnabled(false);
			}
		}
	}

	public void showWinMessageForX() {
		JOptionPane.showMessageDialog(null, " X WINS!", " " + " ", JOptionPane.INFORMATION_MESSAGE);
	}

	public void showWinMessageForO() {
		JOptionPane.showMessageDialog(null, " O WINS!", " " + " ", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void showDrawMessage() {
		JOptionPane.showMessageDialog(null, "Draw!", " " + " ", JOptionPane.INFORMATION_MESSAGE);
	}


	public void checkForWin() {
		if (buttons[0][0].getText() == "X" && buttons[1][0].getText() == "X" && buttons[2][0].getText() == "X") {

			buttons[0][0].setBackground(Color.CYAN);
			buttons[1][0].setBackground(Color.CYAN);
			buttons[2][0].setBackground(Color.CYAN);
			disableButtons();
			showWinMessageForX();

		}

		if (buttons[0][1].getText() == "X" && buttons[1][1].getText() == "X" && buttons[2][1].getText() == "X") {

			buttons[0][1].setBackground(Color.CYAN);
			buttons[1][1].setBackground(Color.CYAN);
			buttons[2][1].setBackground(Color.CYAN);
			disableButtons();
			System.out.println("X Win");
			showWinMessageForX();

		}
		if (buttons[0][2].getText() == "X" && buttons[1][2].getText() == "X" && buttons[2][2].getText() == "X") {

			buttons[0][2].setBackground(Color.CYAN);
			buttons[1][2].setBackground(Color.CYAN);
			buttons[2][2].setBackground(Color.CYAN);
			disableButtons();
			System.out.println("X Win");
			showWinMessageForX();

		}
		// HORIZONTAL

		if (buttons[0][0].getText() == "X" && buttons[0][1].getText() == "X" && buttons[0][2].getText() == "X") {

			buttons[0][0].setBackground(Color.CYAN);
			buttons[0][1].setBackground(Color.CYAN);
			buttons[0][2].setBackground(Color.CYAN);
			disableButtons();
			System.out.println("X Win");
			showWinMessageForX();

		}

		if (buttons[1][0].getText() == "X" && buttons[1][1].getText() == "X" && buttons[1][2].getText() == "X") {

			buttons[1][0].setBackground(Color.CYAN);
			buttons[1][1].setBackground(Color.CYAN);
			buttons[1][2].setBackground(Color.CYAN);
			disableButtons();
			System.out.println("X Win");
			showWinMessageForX();

		}
		if (buttons[2][0].getText() == "X" && buttons[2][1].getText() == "X" && buttons[2][2].getText() == "X") {

			buttons[2][0].setBackground(Color.CYAN);
			buttons[2][1].setBackground(Color.CYAN);
			buttons[2][2].setBackground(Color.CYAN);
			disableButtons();
			System.out.println("X Win");
			showWinMessageForX();

		}

		// CROSSED

		if (buttons[0][0].getText() == "X" && buttons[1][1].getText() == "X" && buttons[2][2].getText() == "X") {

			buttons[0][0].setBackground(Color.CYAN);
			buttons[1][1].setBackground(Color.CYAN);
			buttons[2][2].setBackground(Color.CYAN);
			disableButtons();
			System.out.println("X Win");
			showWinMessageForX();

		}

		if (buttons[2][0].getText() == "X" && buttons[1][1].getText() == "X" && buttons[0][2].getText() == "X") {

			buttons[2][0].setBackground(Color.CYAN);
			buttons[1][1].setBackground(Color.CYAN);
			buttons[0][2].setBackground(Color.CYAN);
			disableButtons();
			System.out.println("X Win");
			showWinMessageForX();

		}

		// For O

		if (buttons[0][0].getText() == "O" && buttons[1][0].getText() == "O" && buttons[2][0].getText() == "O") {

			buttons[0][0].setBackground(Color.CYAN);
			buttons[1][0].setBackground(Color.CYAN);
			buttons[2][0].setBackground(Color.CYAN);
			disableButtons();
			System.out.println("X Win");
			showWinMessageForO();

		}

		if (buttons[0][1].getText() == "O" && buttons[1][1].getText() == "O" && buttons[2][1].getText() == "O") {

			buttons[0][1].setBackground(Color.CYAN);
			buttons[1][1].setBackground(Color.CYAN);
			buttons[2][1].setBackground(Color.CYAN);
			disableButtons();
			System.out.println("X Win");
			showWinMessageForO();

		}
		if (buttons[0][2].getText() == "O" && buttons[1][2].getText() == "O" && buttons[2][2].getText() == "O") {

			buttons[0][2].setBackground(Color.CYAN);
			buttons[1][2].setBackground(Color.CYAN);
			buttons[2][2].setBackground(Color.CYAN);
			disableButtons();
			System.out.println("X Win");
			showWinMessageForO();

		}
		// HORIZONTAL

		if (buttons[0][0].getText() == "O" && buttons[0][1].getText() == "O" && buttons[0][2].getText() == "O") {

			buttons[0][0].setBackground(Color.CYAN);
			buttons[0][1].setBackground(Color.CYAN);
			buttons[0][2].setBackground(Color.CYAN);
			disableButtons();
			System.out.println("X Win");
			showWinMessageForO();

		}

		if (buttons[1][0].getText() == "O" && buttons[1][1].getText() == "O" && buttons[1][2].getText() == "O") {

			buttons[1][0].setBackground(Color.CYAN);
			buttons[1][1].setBackground(Color.CYAN);
			buttons[1][2].setBackground(Color.CYAN);
			disableButtons();
			System.out.println("X Win");
			showWinMessageForO();

		}
		if (buttons[2][0].getText() == "O" && buttons[2][1].getText() == "O" && buttons[2][2].getText() == "O") {

			buttons[2][0].setBackground(Color.CYAN);
			buttons[2][1].setBackground(Color.CYAN);
			buttons[2][2].setBackground(Color.CYAN);
			disableButtons();
			System.out.println("X Win");
			showWinMessageForO();

		}

		// CROSSED

		if (buttons[0][0].getText() == "O" && buttons[1][1].getText() == "O" && buttons[2][2].getText() == "O") {

			buttons[0][0].setBackground(Color.CYAN);
			buttons[1][1].setBackground(Color.CYAN);
			buttons[2][2].setBackground(Color.CYAN);
			disableButtons();
			System.out.println("X Win");
			showWinMessageForO();

		}

		if (buttons[2][0].getText() == "O" && buttons[1][1].getText() == "O" && buttons[0][2].getText() == "O") {

			buttons[2][0].setBackground(Color.CYAN);
			buttons[1][1].setBackground(Color.CYAN);
			buttons[0][2].setBackground(Color.CYAN);
			disableButtons();
			System.out.println("X Win");
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

	public void changeButtonsColorAndCheckForWin(ActionEvent e) {

		// TESTING. Maybe in The future to make the code simpler
		// System.out.println(((AbstractButton) e.getSource()).getName());
		// String a = (String) ((Component) e.getSource()).getName();
		// String b = (String) ((AbstractButton) e.getSource()).getText();
		//
		// number = Integer.parseInt(a);
		//
		// // HORIZONTAL
		//
		// String ab = a + b;
		// fieldAndSymbol.add(ab);
		//
		// if ( fieldAndSymbol.contains("4X") && fieldAndSymbol.contains("3X")
		// && fieldAndSymbol.contains("8X")) {
		//
		// disableButtons();
		// showWinMessageForX();
		// }
		//
		//

		// For X
		// VERTICAL

	}


	public void addButtons(JPanel panel, int i) {

		// MagicNumbers();

		for (int k = 0; k < SIZE; k++) {
			for (int j = 0; j < SIZE; j++) {

				{
					buttons[k][j] = new JButton(" ");
					buttons[k][j].setName(" ");

				}

				buttons[k][j].addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						// this makes sure the button you are pressing is the
						// button variable
						if (e.getSource() == buttons[0][0] || e.getSource() == buttons[0][1]
								|| e.getSource() == buttons[0][2] || e.getSource() == buttons[1][0]
								|| e.getSource() == buttons[1][1] || e.getSource() == buttons[1][2]
								|| e.getSource() == buttons[2][0] || e.getSource() == buttons[2][1]
								|| e.getSource() == buttons[2][2]) {

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
							if(round == 9)
							{
								showDrawMessage();
							}
							checkForWin();

						}
					}
				});

				panel.add(buttons[k][j]);

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