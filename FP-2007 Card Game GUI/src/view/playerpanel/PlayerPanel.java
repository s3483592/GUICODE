package view.playerpanel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.GameEngine;
import model.GameEngineImpl;
import model.Player;
import model.PlayerImpl;
import model.bet.SuitBetImpl;
import model.card.Suit;

public class PlayerPanel extends JPanel {
	
	JPanel playerInfo;
	JPanel betInfo;
	ImageIcon playerImage;
	JLabel imageLabel;
	JLabel playerName;
	JLabel betName;
	JLabel currenPtsLabel;
	JLabel currentPtsValue;
	JLabel betAmountLabel;
	JLabel betAmountValue;
	JLabel suitLabel;
	JLabel suitValue;
	GameEngine engine = new GameEngineImpl();
	GridBagConstraints gbc = new GridBagConstraints();
	GridBagConstraints gbc2 = new GridBagConstraints();
	
	/*
	public JPanel createPlayerPanel() {
		playerContainer = new JPanel();
		
		playerContainer.setBorder(BorderFactory.createTitledBorder("Player Panel"));
		
		return playerContainer;
	} */
	
	public PlayerPanel() {
		/*Dimension size = getPreferredSize();
		size.width = 350;
		size.height = 250;
		setPreferredSize(size);*/
		setBorder(BorderFactory.createTitledBorder("Player Panel"));
		createPlayers();
		
		for (int i = 0; i < GameEngineImpl.playerList.size(); i++) {
			Player currentPlayer = ((ArrayList<Player>) GameEngineImpl.playerList).get(i);
			add(createPlayerInfoCard(currentPlayer));

		}
		

	}
	
	public void createPlayers() {
		
		this.engine.addPlayer(new PlayerImpl("P1", "Player One", 1000));
		this.engine.addPlayer(new PlayerImpl("P2", "Player Two", 2000));
		this.engine.addPlayer(new PlayerImpl("P3", "Player Three", 3000));
		this.engine.addPlayer(new PlayerImpl("P4", "Player Four", 4000));
		this.engine.placeBet("P1", 100);
		this.engine.placeBet("P2", 300, Suit.CLUBS);
		//this.engine.placeBet("P4", 300);
	}
	
	public JPanel createPlayerInfoCard(Player player) {
		playerInfo = new JPanel();
		betInfo = new JPanel();
		playerImage = new ImageIcon(new ImageIcon("images/004-user.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		imageLabel = new JLabel(playerImage);
		currenPtsLabel = new JLabel("Current Points: ");
		currentPtsValue = new JLabel(String.valueOf(player.getPoints()));
		betAmountLabel = new JLabel("Bet Amount: ");
		betAmountValue = new JLabel(String.valueOf(player.getBet().getAmount()));
		playerInfo.setBorder(BorderFactory.createTitledBorder(player.getName()));
		if (player.getBet().getClass().getName() == "model.bet.ScoreBetImpl") {
			betInfo.setBorder(BorderFactory.createTitledBorder("Score Bet"));
		}
		if (player.getBet().getClass().getName() == "model.bet.Bet$1") {
			betInfo.setBorder(BorderFactory.createTitledBorder(player.getBet().toString()));
		}
		if (player.getBet().getClass().getName() == "model.bet.SuitBetImpl") {
			betInfo.setBorder(BorderFactory.createTitledBorder("Suit Bet - " + ((SuitBetImpl) player.getBet()).getSuit().toString()));

		}
		
		//add the items to the JPANELS
		playerInfo.setLayout(new GridBagLayout());
		gbc.insets = new Insets(4,4,4,4);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 2;
		playerInfo.add(imageLabel, gbc);
		gbc.gridheight = 1;
		gbc.gridx = 1;
		playerInfo.add(currenPtsLabel, gbc);
		gbc.gridx = 2;
		playerInfo.add(currentPtsValue, gbc);
		// BetInfo
		betInfo.add(betAmountLabel);
		betInfo.add(betAmountValue);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		playerInfo.add(betInfo, gbc);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		return playerInfo;
	}
	

}
