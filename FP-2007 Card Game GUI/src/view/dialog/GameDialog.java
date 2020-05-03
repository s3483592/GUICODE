package view.dialog;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameDialog implements ActionListener{
	
	JFrame frame;
	JDialog dialog;
	JPanel contentPane;
	JPanel buttonPane;
	JLabel playerID;
	JLabel playerName;
	JLabel playerPoints;
	JLabel betAmount;
	JLabel suit;
	JButton closeButton;
	JButton submitButton;
	JTextField playerIdField;
	JTextField playerNameField;
	JTextField playerPointsField;
	JTextField betAmountField;
	JTextField suitField;
	String title;
	
	public GameDialog(String title) {
		this.frame = new JFrame();
		this.dialog = new JDialog(this.frame,title);
		this.contentPane = new JPanel();
		this.buttonPane = new JPanel();
		this.closeButton = new JButton("Close");
		this.submitButton = new JButton("Submit");
		this.playerID = new JLabel("Player ID: ");
		this.playerIdField = new JTextField("Enter Player ID",15);
		this.closeButton.addActionListener(this);
		this.submitButton.addActionListener(this);
		this.buttonPane.add(this.submitButton);
		this.buttonPane.add(this.closeButton);
		this.dialog.add(this.contentPane);
		this.dialog.setSize(400, 400);

	}
	
	//All fields are there. Need to work on the layout.
	public JDialog AddPlayerPopup() {
		//this.contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		//player name
		this.playerName = new JLabel("Player Name: ");
		this.playerNameField = new JTextField("Enter Player Name",15);
		//player points
		this.playerPoints = new JLabel("Player Points: ");
		this.playerPointsField = new JTextField("Enter Player Points", 15);
		this.contentPane.add(Box.createRigidArea(new Dimension(5, 25)));
		this.contentPane.add(this.playerID);
		this.contentPane.add(this.playerIdField);
		this.contentPane.add(Box.createRigidArea(new Dimension(5, 25)));
		this.contentPane.add(this.playerName);
		this.contentPane.add(this.playerNameField);
		this.contentPane.add(Box.createRigidArea(new Dimension(5, 25)));
		this.contentPane.add(this.playerPoints);
		this.contentPane.add(this.playerPointsField);
		this.contentPane.add(Box.createRigidArea(new Dimension(5, 25)));
		this.contentPane.add(this.buttonPane);
		this.dialog.setSize(310, 185);
		this.dialog.setVisible(true);
		return this.dialog;
	}
	
	//Completed - DO NOT CHANGE!!!
	public JDialog RemovePlayerPopup() {
		this.dialog.setSize(310, 125);
		this.contentPane.add(this.playerID);
		this.contentPane.add(this.playerIdField);
		this.contentPane.add(this.buttonPane);
		this.dialog.setVisible(true);
		return this.dialog;
	}
	
	//Completed - DO NOT CHANGE!!!
	public JDialog PlaceBetPopup() {
		this.betAmount = new JLabel("Bet Amount: ");
		this.betAmountField = new JTextField("Enter Bet Amount",15);
		this.suit = new JLabel("Suit: ");
		this.suitField = new JTextField("Enter Suit to Bet",15);
		this.contentPane.add(Box.createRigidArea(new Dimension(5, 25)));
		this.contentPane.add(this.playerID);
		this.contentPane.add(this.playerIdField);
		this.contentPane.add(Box.createRigidArea(new Dimension(5, 25)));
		this.contentPane.add(this.betAmount);
		this.contentPane.add(this.betAmountField);
		this.contentPane.add(Box.createRigidArea(new Dimension(5, 25)));
		this.contentPane.add(this.suit);
		this.contentPane.add(this.suitField);
		this.contentPane.add(Box.createRigidArea(new Dimension(5, 25)));
		this.contentPane.add(this.buttonPane);
		this.dialog.setSize(300, 185);
		this.dialog.setVisible(true);
		return this.dialog;
	}
	
	public JDialog ViewResulstsPopup() {
		this.buttonPane.remove(this.submitButton);
		this.contentPane.add(this.buttonPane);
		this.dialog.setSize(700, 225);
		this.dialog.setVisible(true);
		return this.dialog;
	}
	
	//Completed - DO NOT CHANGE!!!
	public JDialog AboutPopup() {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss a");
		JLabel namePanel = new JLabel();
		JLabel idPanel = new JLabel();
		JLabel datePanel = new JLabel();
		this.contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		namePanel.setText("Name: Joshua Nicholson");
		idPanel.setText("Student#: s3483592");
		datePanel.setText("Date: "+ dateTime.format(formatter));
		closeButton.addActionListener(this);
		submitButton.addActionListener(this);
		this.contentPane.add(Box.createRigidArea(new Dimension(10, 0)));
		this.contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
		this.contentPane.add(namePanel);
		this.contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
		this.contentPane.add(idPanel);
		this.contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
		this.contentPane.add(datePanel);
		this.contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
		this.buttonPane.remove(this.submitButton);
		this.contentPane.add(buttonPane);
		this.dialog.add(contentPane);
		this.dialog.setSize(300,175);
		this.dialog.setLocationRelativeTo(null);
		this.dialog.setVisible(true);
		return this.dialog;
	

}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		JButton source = (JButton)(e.getSource());

		if(source.getText() == "Close") {
			this.frame.dispose();
		}
		else if(source.getText() == "Submit") {
			System.out.print(source.getText() + " was pushed in " + this.dialog.getTitle() + " dialog box\n");

		}

	
}
}
