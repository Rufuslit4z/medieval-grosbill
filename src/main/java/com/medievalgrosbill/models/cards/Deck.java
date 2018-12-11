package com.medievalgrosbill.models.cards;

import java.util.List;

public class Deck {
	
	private List<Card> deck;
	
	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
	
	public Deck(List<Card>... cards) {
		for(List<Card> card : cards) {
			for(int i = 0; i < card.size(); i++) {
				this.deck.add(card.get(i));
			}
		}		
	}
}
