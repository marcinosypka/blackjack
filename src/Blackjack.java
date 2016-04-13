import java.util.Scanner;

public class Blackjack {
	Deck deck;
	Card card;
	Integer sum;
	String s;
	
	Blackjack() {	
		deck = new Deck();
		deck.shuffle();
		sum = 0;
	}
	void play(){
		while(true) {
		show();
		s = decision();
		if(s.equals("y")) {
			draw();
		}
		if(s.equals("n")) {
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
	String decision() {
		Scanner reader = new Scanner(System.in);
		String n = reader.nextLine();
		//reader.close();
		n.toLowerCase();
		return n;
		
	}
}
