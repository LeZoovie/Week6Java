package war;

public class Card {
		
		//fields: Value & Name	
			int Value;
			String Name;
			
			// Setters for value and name of cards
			public void setCardValue(int Value) {
				this.Value = Value;
				
			}
			
			public void setCardName(String name) {
				this.Name = name;
			}
			//getters for value and names of cards
			
			public int getCardValue() {
				return this.Value;		
			}
			
			public String getCardName() {
				return this.Name;
			}
			// Describing what will print out of x card. 
			public void describe() {
				System.out.println("Value: " + getCardValue( ) +  "Name: " + getCardName());
				
			}
		//Card constructor 
			public Card(int Value, String name) {
				this.Name = name;//i 
				this.Value = Value; //j

				
				
			}
			
		}

