public class Game {
	Deck deck;
	private static Game game;
	
	Game() {
		deck = new Deck();
		deck.show();
		deck.shuffle();
		deck.show();
	}
	public static void main(String[] args) {

		game = new Game();
		
	}

}
