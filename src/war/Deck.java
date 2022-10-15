package war;

import java.util.*;

public class Deck {

	//Array of cards to new array of cards to add to deck
		ArrayList<Card> cards = new ArrayList<Card>();
		String[] names = {"clubs", "diamonds", "hearts", "spades"};
		
	//Deck constructor	
		public Deck() {
			//Standard deck of 52 cards. 4 names * 14 types of cards = 52. 
			for(int i = 0; i < names.length; i++)
	            for(int j = 2; j <= 14; j++)
	     	
	            {
	            	//adds cards to array list        	
	                this.cards.add(new Card(j, names[i]));// first loop - Clubs, iterates 2-14, but all clubs. 
	           
		}
	}
		// Randomizes the order of the cards
			public void  Shuffle() {
				Collections.shuffle(cards);
			}
		//removes and returns the top card of the Cards field	
		public Card draw() {
			this.cards.get(0).describe();
			return this.cards.remove(0);
		}		
		
		
}

	


