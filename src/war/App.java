package war;

import java.util.*;

public class App {
	
	public static void main(String[] args) {
//Instantiate a Deck and two Players, call the shuffle method on the deck.		
		 Deck deck = new Deck();
	        Player player1 = new Player("1");
	        Player player2 = new Player("2");
	        deck.Shuffle();
//Using a traditional for loop, iterate 52 times calling the Draw method on the other player each
//  iteration using the Deck you instantiated.	
	 for (int i = 0; i < 52; i++) {
         if ( i % 2 == 0) {
             player1.draw(deck);
         } else {
             player2.draw(deck);

         }
     }
//Using a traditional for loop, iterate 26 times and call the flip method for each player	 
	 for (int i = 0; i < 26; i++) {
         Card player_1Card = player1.flip();
         Card player_2Card = player2.flip();
 //Compare the value of each card returned by the two player’s flip methods. Call the
  //       incrementScore method on the player whose card has the higher value.        
         if (player_1Card.getCardValue() > player_2Card.getCardValue()) {
             player1.incremeentScore();
         } else if (player_1Card.getCardValue() < player_2Card.getCardValue()) {
             player2.incremeentScore();
         }
     }
//	 After the loop, compare the final score from each player
	 System.out.println("Player1 score = " + player1.getScore());
     System.out.println("Player2 score = " + player2.getScore());
     
//Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on
 //   which score is higher or if they are both the same     
     if (player1.getScore() > player2.getScore()) {
         System.out.println("Player1 is the winner!");
     } else if (player1.getScore() < player2.getScore()) {
         System.out.println("Player2 is the winner!");
     } else {
         System.out.println("It is a DRAW!");
     }


 }

}


