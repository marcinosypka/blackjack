import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

class Deck {
final protected static int amoutOfCards = 52;
protected int amoutOfDecks = 1;
protected Card card;
protected Stack<Card> stack = new Stack<Card>();

public Deck() {
	
	addDeck();
	
}
public Deck(int amoutOfDecks) {
	
	this.amoutOfDecks = amoutOfDecks;
	addDeck();
}

public void addDeck() {
	for(int i = 0; i < amoutOfDecks; i++) {
		for(Suit s : Suit.values()) {
			for(CardName c: CardName.values()) {
				stack.push(new Card(s,c));
			}
		}
	}
}
public Card drawCard(){
	
	card = stack.pop();
	if(stack.isEmpty()) {
		addDeck();		
	}
	return card;
}
public Card getCard(){
	return card;
}

public void show(){
	Stack<Card> temp = new Stack<Card>();
	Card shownCard;
	while(!stack.isEmpty()){
		shownCard = stack.pop();
		temp.push(shownCard);
		System.out.println(shownCard);
	}
	while(!temp.isEmpty()) {
		
		stack.push(temp.pop());
		
	}
	

	System.out.println("########################### END OF STACK #####################################");
}
public void shuffle() {
	Random rand = new Random();
	Set<Integer> indexes = new LinkedHashSet<Integer>();

	Card[] cards = new Card[amoutOfCards];
	
	int i = 0;
	while(!stack.isEmpty()) {
		cards[i] = stack.pop();
		i++;
	}
	while(indexes.size() < i) {
		indexes.add(rand.nextInt(i));	
	}
	for(Integer j : indexes) {
		stack.push(cards[j]);
	}
}
public void reset() {
	while(!stack.isEmpty()) {
		stack.pop();
	}
	addDeck();
}
}
