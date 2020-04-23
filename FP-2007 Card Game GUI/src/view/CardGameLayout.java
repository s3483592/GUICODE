package view;
import javax.swing.*;
import model.menu.*;

public class CardGameLayout extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//menu bar
	//tool bar
	//status bar
	//player panel
		// name, current points, Bet information (bet amount, bet type, suit that was used), player icon
	//player hand panel
		// take up most of the space, should display solid color background for part A
	// two dialog boxes 
	//about dialog box from the menu dropdown
		// my name, student number, current date and time
	// results
	public CardGameLayout() {
		GameMenu gameMenu = new GameMenu();
		
		setTitle("Black Jack Card Game");
		setJMenuBar(gameMenu.createMenuBar());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		setLayout(null);
		setVisible(true);
		
	}

}
