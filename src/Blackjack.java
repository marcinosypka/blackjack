import java.io.IOException;

public class Blackjack {
	Deck deck;
	Card card;
	Integer sum;
	Character c;
	
	Blackjack() {	
		deck = new Deck();
		deck.shuffle();
		sum = 0;
	}
	void play(){
		while(true) {
		show();
		c = decision();
		if(c == 'y') {
			draw();
		}
		if(c == 'n') {
			return;
		}
		}
	}
	void show() {
		System.out.println("You' ve got: " + sum + ".");
		System.out.println("Do you want to draw a card ?");
		System.out.println("Y/N ?");
	}
	void draw() {
		card = deck.drawCard();
		sum += card.getValue();
	}
	Character decision() {
		Character c = null;
		try {
			c = (char)System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return c;
	}
}
