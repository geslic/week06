package com.Promineotech;

public class Card {
// Fields
	private int value;
	private String name;
	
	// Constructor
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}

	// Methods
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String toString() {
		return name;
	}
	
}
