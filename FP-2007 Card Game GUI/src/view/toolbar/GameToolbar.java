package view.toolbar;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

import view.dialog.GameDialog;

public class GameToolbar extends JToolBar implements ActionListener {
	JToolBar gameToolbar;
	JButton dealButton;
	JButton placeBetButton;
	JButton resultsButton;
	
	public JToolBar gameToolbar() {
		/*Dimension size = getPreferredSize();
		size.height = 125; */
		this.gameToolbar = new JToolBar();
		//this.gameToolbar.setPreferredSize(size);
		FlowLayout tbLayout = new FlowLayout();
		this.gameToolbar.setLayout(tbLayout);
		tbLayout.setAlignment(FlowLayout.CENTER);
		this.gameToolbar.setRollover(true);
		this.dealButton = new JButton("DEAL");
		this.dealButton.addActionListener(this);
		this.placeBetButton = new JButton("PLACE BET");
		this.placeBetButton.addActionListener(this);
		this.resultsButton = new JButton("VIEW RESULTS");
		this.resultsButton.addActionListener(this);
		this.gameToolbar.add(this.dealButton);
		this.gameToolbar.addSeparator();
		this.gameToolbar.add(this.placeBetButton);
		this.gameToolbar.addSeparator();
		this.gameToolbar.add(this.resultsButton);
		return this.gameToolbar;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		JButton source = (JButton)(e.getSource());
		if(source.getText() == "DEAL") {
			System.out.print("Toolbar "+source.getText()+ " button selected \n");
		}
		else if(source.getText() == "PLACE BET") {
			GameDialog placeBetPopup = new GameDialog("Place Bet");
			placeBetPopup.PlaceBetPopup();
		}
		else if(source.getText() == "VIEW RESULTS") {
			GameDialog viewResultsPopup = new GameDialog("View Results");
			viewResultsPopup.ViewResulstsPopup();
		}
		else {
			System.out.print(source.getText()+ "\n");
			
		}

		
	}
	

}
