import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

class Deck {
private static final int amoutOfCards = 52;	
Card card;
Stack<Card> stack = new Stack<Card>();
Stack<Card> discarded = new Stack<Card>();

public Deck() {
	for(Suit s : Suit.values()) {
		for(CardName c: CardName.values()) {
			stack.push(new Card(s,c));
		}
	}
}
public void popCard(){
	card = stack.pop();
	discarded.push(card);
	
}
private void switchStacks() {
	Stack<Card> temp;
	temp = stack;
	stack = discarded;
	discarded = temp;
}
public void show(){
	while(!stack.empty()){
		popCard();
		System.out.println(card);
	}

	switchStacks();
	System.out.println("########################### END OF STACK #####################################");
}
public void shuffle() {
	Random rand = new Random();
	Set<Integer> indexes = new LinkedHashSet<Integer>();
	
	while(indexes.size() < 52) {
		indexes.add(rand.nextInt(52));	
	}
	System.out.println(indexes);
	Card[] cards = new Card[amoutOfCards];
	
	int i = 0;
	while(!stack.empty()) {
		cards[i] = stack.pop();
		i++;
	}
	
	for(Integer j : indexes) {
		stack.push(cards[j]);
	}
	while(!discarded.empty()) {
		discarded.pop();
	}
}
}
