package war;

import java.util.*;

public class Player {

	ArrayList<Card> hand = new ArrayList<Card>();
	
	int score = 0;
	String name;
	//Describes players hand
	public void describe() {
		for (int i = 0; i < hand.size(); i++) {	//size is for ArrayList	
			this.hand.get(i).describe();
						
		}
	}	
	//removes and returns the top card of the Hand
		public Card flip() {
			return this.hand.remove(0);
			
		}
	//takes a Deck as an argument and calls the draw method on the deck,
	//adding the returned Card to the hand field
		public void draw(Deck cards) {
			this.hand.add(cards.draw());
			
		}
		//adds 1 to the Player’s score field
		public void incremeentScore() {
			this.score ++; //adds 1 to the Player’s score field
			
		}
		
		public Player(String Name)	{
			this.name = Name;
		}
		public int getScore() {
			return this.score;
		}
			
		}
	
		
	

