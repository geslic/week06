package com.Promineotech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	// Fields
	private List<Card> deck;

	// Constructor
	public Deck() {
		initializeDeck();
}
	private void initializeDeck() {
		deck = new ArrayList<>();
		String[] names = {"Hearts", "Diamonds", "Clubs", "Spades", "Jack", "Queen", "King", "Ace"};
		int[] values = {2, 3, 4, 5, 6, 8, 9, 10};
		
		for (String name: names) {
			for (int value: values) {
				deck.add(new Card(value,value + " of " + name));
			}
		}
	}
	// Methods
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public Card draw() {
		if (deck.isEmpty()) {
			System.out.println("The deck is empty.");
			return null;
		}
		return deck.remove(0);
	}
	public int size() {
		return deck.size();
	}
}
