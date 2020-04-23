package model.dialog;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextPane;

public class GameDialog{
	
	public JDialog About() {
		String name;
		String id;
		JFrame frame = new JFrame();
		JDialog about = new JDialog(frame, "About");
		about.setSize(100,100);
		about.setLocationRelativeTo(null);
		about.setVisible(true);
		return about;
	}
	
	
	public JDialog anotherAbout() {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		JFrame frame = new JFrame();
		JDialog about = new JDialog(frame, "About ver 2");
		JTextPane namePanel = new JTextPane();
		JTextPane idPanel = new JTextPane();
		JTextPane datePanel = new JTextPane();
		namePanel.setText("Joshua Nicholson");
		idPanel.setText("s3483592");
		datePanel.setText(dateTime.format(formatter));
		about.add(namePanel);
		//about.add(idPanel);
		//about.add(datePanel);
		about.setSize(300,300);
		about.setLocationRelativeTo(null);
		about.setVisible(true);
		return about;
	

}
}
