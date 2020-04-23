package model.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import model.dialog.GameDialog;

public class GameMenu implements ActionListener, ItemListener{
	JMenuBar menuBar;
	JMenu menu, submenu;
	JMenuItem menuItem;
	
	public JMenuBar createMenuBar () {
		
		menuBar = new JMenuBar();
		menu = new JMenu("Player Management");
		menu.setMnemonic(KeyEvent.VK_F1);
		menu.getAccessibleContext().setAccessibleDescription("This menu in this program that has menu items");
		menuBar.add(menu);
		
		menuItem = new JMenuItem("Add Player", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuItem.addActionListener(this);
		menu.add(menuItem);
		menuItem = new JMenuItem("Remove Player", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		menu = new JMenu("Test Menu 2");
		menu.setMnemonic(KeyEvent.VK_F1);
		menu.getAccessibleContext().setAccessibleDescription("This menu in this program that has menu items");
		menuBar.add(menu);
		
		menuItem = new JMenuItem("Test Menu 2 - Item 1", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuItem.addActionListener(this);
		menu.add(menuItem);
		menuItem = new JMenuItem("Test Menu 2 - Item 2", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuItem.addActionListener(this);
		menu.add(menuItem);
		menuItem = new JMenuItem("Test Menu 2 - Item 3", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuItem.addActionListener(this);
		
		menu = new JMenu("Help");
		menu.setMnemonic(KeyEvent.VK_F1);
		menu.getAccessibleContext().setAccessibleDescription("This menu in this program that has menu items");
		menuBar.add(menu);
		
		menuItem = new JMenuItem("About", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuItem.addActionListener(this);
		menu.add(menuItem);
		menuItem = new JMenuItem("Help - Item 2", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuItem.addActionListener(this);
		menu.add(menuItem);
		menuItem = new JMenuItem("Help - Item 3", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menuItem.addActionListener(this);
		
		return menuBar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem source = (JMenuItem)(e.getSource());
		if(source.getText() == "About") {
			GameDialog aboutPopup = new GameDialog();
			aboutPopup.anotherAbout();
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
