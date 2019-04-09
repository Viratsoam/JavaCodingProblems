package TicTacToe;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TicToc extends JFrame {
	public static int BOARD_SIZE = 3;

	public static enum GameStatus {
		Incomplete, XWins, ZWins, Tie
	}

	private JButton[][] buttons = new JButton[BOARD_SIZE][BOARD_SIZE];

	public TicToc() {
		super.setTitle("TicTacToe");
		super.setSize(500, 500);
		GridLayout grid = new GridLayout(BOARD_SIZE, BOARD_SIZE);
		super.setLayout(grid);
		Font font = new Font("Comic Sans", 1, 150);
		for (int row = 0; row < BOARD_SIZE; row++) {
			for (int col = 0; col < BOARD_SIZE; col++) {
				JButton button = new JButton("");
				buttons[row][col] = button;
				button.setFont(font);
				super.add(button);
			}
		}
		super.setResizable(false);
		super.setVisible(true);
	}

}
