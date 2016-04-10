import java.io.IOException;

public class Blackjack {
	Deck deck;
	Character c;
	
	Blackjack() {
		try{
			
		deck = new Deck();
		c = '1';
		game();
	}
	  catch(IOException e)
	  {
	  System.out.println("IOException has been caught");
	  }
	}
	void game() throws IOException {
		while(true) {
			show(c);
			c = (char) System.in.read();
			if(c == 'q') {
				return;
			}
			
			
		}
	}
	void show(Character c) { 
		System.out.println("################################################################################");
		System.out.println("################################################################################");
		System.out.println("########################    BLACKJACK   ########################################");
		switch(c) {
		case '1':
			helloScreen();
			break;		
		}
		
		System.out.println("################################################################################");
		System.out.println("################################################################################");
		
	}
	void helloScreen() {
		System.out.println("");
		System.out.println("###                   Witaj w grze blackjack.                              ###");
		System.out.println("");
		System.out.println("###         Nacisnij \"n\" aby rozpoczac nowa gre.                           ###");
		System.out.println("");
		System.out.println("###         Nacisnij \"q\" aby zakonczyc dzialanie programu.                 ###");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

}
