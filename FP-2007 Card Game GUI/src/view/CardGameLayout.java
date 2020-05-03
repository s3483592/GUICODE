package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import view.menu.GameMenu;
import view.playerpanel.PlayerPanel;
import view.toolbar.GameToolbar;

public class CardGameLayout  {
	
	private JPanel baseContainer = new JPanel();
	private JPanel topContainer = new JPanel();
	private JPanel midContainer = new JPanel();
	private JPanel botContainer = new JPanel();
	private JPanel test1 = new JPanel();
	private JPanel test2 = new JPanel();
	private JPanel test3 = new JPanel();
	private static GameMenu gameMenu = new GameMenu();
	private static GameToolbar gameToolbar = new GameToolbar();
	private PlayerPanel playerPanel = new PlayerPanel();
	
	/**
	 * 
	 */

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
	
	public void populateContent(Container contentPane) {
		FlowLayout tcLayout = new FlowLayout();
		FlowLayout mcLayout = new FlowLayout();
		FlowLayout bcLayout = new FlowLayout();
		baseContainer.setLayout((new BoxLayout(baseContainer, BoxLayout.PAGE_AXIS)));
		topContainer.setLayout((LayoutManager) tcLayout);
		midContainer.setLayout(mcLayout);
		botContainer.setLayout(bcLayout);
		mcLayout.setAlignment(FlowLayout.LEADING);
		bcLayout.setAlignment(FlowLayout.CENTER);
		topContainer.setBackground(Color.black);
		midContainer.setBackground(Color.blue);
		botContainer.setBackground(Color.red);
		//topContainer.setBorder(BorderFactory.createTitledBorder("Player Panel"));
		//test1.setBorder(BorderFactory.createTitledBorder("Player Panel"));
		topContainer.add(playerPanel);
		
		//Add player cards to the test 1 panel
		


		
		
		
		// adding content to base content 
		/*baseContainer.add(topContainer);
		baseContainer.add(midContainer);
		baseContainer.add(botContainer);
		contentPane.add(baseContainer, BorderLayout.CENTER);*/
		baseContainer.add(playerPanel);
		baseContainer.add(midContainer);
		contentPane.add(baseContainer);
		//contentPane.add(midContainer);
		//contentPane.add(botContainer);
		
	}
	
	public void createGui() {
		JFrame frame = new JFrame("Black Jack Card Game");
		Container contentPane = frame.getContentPane();
		frame.setJMenuBar(gameMenu.createMenuBar());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(800, 800);
		populateContent(contentPane);
		contentPane.add(gameToolbar.gameToolbar(), BorderLayout.PAGE_END);
		frame.setVisible(true);
		frame.pack();

		
	}

}


