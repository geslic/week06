package com.Promineotech;

import java.util.ArrayList;
import java.util.List;

public class Player {
// Fields
	private String name;
	private List<Card> hand;
	private int score;
	
// Constructor
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
		this.score = 0;
		
	}
// Methods
	public void describe() {
		System.out.println("Player: " + name);
		System.out.println("Score: " + score);
		System.out.println("Hand: " + hand);
	}
	public void flip(int index) {
		if (index >= 0 && index < hand.size()) {
			Card card = hand.get(index);
			System.out.println(name + " flipped a " + card);
		}
	}
	public Card draw(Deck deck) {
		Card card = deck.draw();
		if (card != null) {
			hand.add(card);
		}
		return card;
	}
	public void incrementScore() {
		score++;
	}
}
