


public class Card {
	
	private Suit suit;
	private CardName cardName;
	
	public Card(Suit suit, CardName cardName) {
		this.suit = suit;
		this.cardName = cardName;
	}
	
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public CardName getCardName() {
		return cardName;
	}
	public void setCardName(CardName cardName) {
		this.cardName = cardName;
	}
	
	public String toString() {
		return cardName + " of " + suit;
	}
}
