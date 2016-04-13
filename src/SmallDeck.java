
public class SmallDeck extends Deck{
	
	final protected static int amoutOfCards = 24;
	
	SmallDeck() {
		super();
	}
	
	SmallDeck(int amoutOfDecks) {
		super(amoutOfDecks);
	}
	
	public void addDeck() {
		for(int i = 0; i < amoutOfDecks; i++) {
			for(Suit s : Suit.values()) {
				for(CardName c: CardName.values()) {
					if(c.getCardValue() > 8) {
					stack.push(new Card(s,c));
					}
				}
			}
		}
	}
}
