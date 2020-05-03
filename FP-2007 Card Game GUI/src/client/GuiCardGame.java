package client;


import view.CardGameLayout;

public class GuiCardGame {

	public static void main(String[] args) {
		// starts the gui
		CardGameLayout application = new CardGameLayout();
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	
            	application.createGui();
            }
        });

	}

}
