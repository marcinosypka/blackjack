import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

class Deck {
private static final int amoutOfCards = 52;	
private Card card;
private Stack<Card> stack = new Stack<Card>();
private Stack<Card> discarded = new Stack<Card>();

public Deck() {
	for(Suit s : Suit.values()) {
		for(CardName c: CardName.values()) {
			stack.push(new Card(s,c));
		}
	}
}
public Card drawCard(){
	
	card = stack.pop();
	discarded.push(card);
	if(stack.empty()) {
		switchStacks();		
	}
	return card;
}
public Card getCard(){
	return card;
}
private void switchStacks() {
	Stack<Card> temp;
	temp = stack;
	stack = discarded;
	discarded = temp;
}
public void show(){
	while(!stack.empty()){
		card = stack.pop();
		discarded.push(card);
		System.out.println(card);
	}
	switchStacks();
	while(!stack.empty()){
		card = stack.pop();
		discarded.push(card);
	}
	switchStacks();
	System.out.println("########################### END OF STACK #####################################");
}
public void shuffle() {
	Random rand = new Random();
	Set<Integer> indexes = new LinkedHashSet<Integer>();

	Card[] cards = new Card[amoutOfCards];
	
	int i = 0;
	while(!stack.empty()) {
		cards[i] = stack.pop();
		i++;
	}
	while(indexes.size() < i) {
		indexes.add(rand.nextInt(i));	
	}
	//System.out.println(indexes);
	for(Integer j : indexes) {
		stack.push(cards[j]);
	}
}
public void reset() {
	while(!discarded.empty()) {
		stack.push(discarded.pop());
	}

}
}
