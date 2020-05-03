package view.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import view.dialog.GameDialog;

public class GameMenu implements ActionListener, ItemListener{
	JMenuBar menuBar;
	JMenu menu, submenu;
	JMenuItem menuItem;
	JCheckBoxMenuItem checkboxMenuItem;
	ButtonGroup group;
	
	public JMenuBar createMenuBar () {
		
		menuBar = new JMenuBar();
		menu = new JMenu("Player Management");
		menu.setMnemonic(KeyEvent.VK_P);
		menu.getAccessibleContext().setAccessibleDescription("Player management options");
		menuBar.add(menu);
		
		menuItem = new JMenuItem("Add Player");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("Add a Player to the game");
		menuItem.addActionListener(this);
		menu.add(menuItem);
		menuItem = new JMenuItem("Remove Player");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("Remove a player from the game");
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		menu = new JMenu("Player Actions");
		menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription("Player management options");
		menuBar.add(menu);
		menuItem = new JMenuItem("Deal");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("Add a Player to the game");
		menuItem.addActionListener(this);
		menu.add(menuItem);
		menuItem = new JMenuItem("Place Bet");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("Remove a player from the game");
		menuItem.addActionListener(this);
		menu.add(menuItem);
		menuItem = new JMenuItem("View Results");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("Remove a player from the game");
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		
		menu = new JMenu("Game Configuration");
		menu.setMnemonic(KeyEvent.VK_G);
		menu.getAccessibleContext().setAccessibleDescription("Game Configuration Settings");
		menuBar.add(menu);
		
		// need to add the ability to disable the other check box. Use buttongroup to do this
		checkboxMenuItem = new JCheckBoxMenuItem("Automatic Dealing");
		checkboxMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6, ActionEvent.ALT_MASK));
		checkboxMenuItem.getAccessibleContext().setAccessibleDescription("Automatically deal to players");
		checkboxMenuItem.addActionListener(this);
		menu.add(checkboxMenuItem);
		
		checkboxMenuItem = new JCheckBoxMenuItem("Manual Dealing");
		checkboxMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_7, ActionEvent.ALT_MASK));
		checkboxMenuItem.getAccessibleContext().setAccessibleDescription("Manually deal to players");
		checkboxMenuItem.addActionListener(this);
		menu.add(checkboxMenuItem);

		
		menu = new JMenu("Help");
		menu.setMnemonic(KeyEvent.VK_H);
		menu.getAccessibleContext().setAccessibleDescription("Hepl Menu");
		menuBar.add(menu);
		
		menuItem = new JMenuItem("About", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_8, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("About the program author");
		menuItem.addActionListener(this);
		menu.add(menuItem);

		return menuBar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AbstractButton theButton = (AbstractButton) e.getSource();
		boolean selected = theButton.getModel().isSelected();
		JMenuItem source = (JMenuItem)(e.getSource());
		if(source.getText() == "About") {
			GameDialog aboutPopup = new GameDialog("About");
			aboutPopup.AboutPopup();

		}
		else if(source.getText() == "Add Player") {
			GameDialog addPlayerPopup = new GameDialog("Add Player");
			addPlayerPopup.AddPlayerPopup();
		}
		else if(source.getText() == "Remove Player") {
			GameDialog removePlayerPopup = new GameDialog("Remove Player");
			removePlayerPopup.RemovePlayerPopup();
		}
		else if(source.getText() == "Deal") {
			// do something
		}
		else if(source.getText() == "Place Bet") {
			GameDialog placeBetPopup = new GameDialog("Place Bet");
			placeBetPopup.PlaceBetPopup();
		}
		else if(source.getText() == "View Results") {
			GameDialog viewResultsPopup = new GameDialog("View Results");
			viewResultsPopup.ViewResulstsPopup();
		}
		else if(selected) {
			System.out.print(source.getText()+ " was selected \n");
			
		}
		else {
			System.out.print(source.getText()+ "\n");
			
		}

		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
