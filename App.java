package com.Promineotech;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instantiate a card deck and shuffle it.
		Deck deck = new Deck();
		deck.shuffle();
		
		// Instantiate two players
		Player player1 = new Player("Player 1");
		Player player2 = new Player ("Player 2");
		
		// Game logic
		// Draw cards from the deck and assign them to the players.
		
		// Traditional loop to draw cards and play the game.
		for (int i = 0; i < 52; i++) {
			// Each player
			if (i % 2 == 0) {
				Card card1 = player1.draw(deck);
				Card card2 = player2.draw(deck);
				
				player1.flip(i);
				player2.flip(i);
				
				// Increment the player's scores based on the rules.
				if (card1.getValue() > card2.getValue()) {
					player1.incrementScore();
					System.out.println("Player 1 received a point.");
				} else if (card2.getValue() > card1.getValue()) {
					player2.incrementScore();
					System.out.println("Player 2 received a point.");
				}else {
					deck.draw();
					System.out.println("It's a draw.");
				}
				
			}
		}
		
		
		// Compare the final score from each player and print the result.
		player1.describe();
		player2.describe();
	}

}
