package co.edu.unbosque.model;
import java.util.Random;

public class DeckDAO {
	private List deck;
	
	public DeckDAO() {
		for(int i=0; i<10; i++) {
			if(i==0) {
				deck.add(new CardsDTO((i)+"", "blue"));
			}
			else{
				deck.add(new CardsDTO((i)+"", "blue"));
				deck.add(new CardsDTO((i)+"", "blue"));
			}
		}
		deck.add(new CardsDTO("take2", "blue"));
		deck.add(new CardsDTO("take2", "blue"));
		deck.add(new CardsDTO("reverse", "blue"));
		deck.add(new CardsDTO("reverse", "blue"));
		deck.add(new CardsDTO("skip", "blue"));
		deck.add(new CardsDTO("skip", "blue"));

		
		for(int i=0; i<10; i++) {
			if(i==0) {
				deck.add(new CardsDTO((i)+"", "green"));
			}
			else{
				deck.add(new CardsDTO((i)+"", "green"));
				deck.add(new CardsDTO((i)+"", "green"));
			}
		}
		deck.add(new CardsDTO("take2", "green"));
		deck.add(new CardsDTO("take2", "green"));
		deck.add(new CardsDTO("reverse", "green"));
		deck.add(new CardsDTO("reverse", "green"));
		deck.add(new CardsDTO("skip", "green"));
		deck.add(new CardsDTO("skip", "green"));
		
		for(int i=0; i<10; i++) {
			if(i==0) {
				deck.add(new CardsDTO((i)+"", "red"));
			}
			else{
				deck.add(new CardsDTO((i)+"", "red"));
				deck.add(new CardsDTO((i)+"", "red"));
			}
		}
		deck.add(new CardsDTO("take2", "red"));
		deck.add(new CardsDTO("take2", "red"));
		deck.add(new CardsDTO("reverse", "red"));
		deck.add(new CardsDTO("reverse", "red"));
		deck.add(new CardsDTO("skip", "red"));
		deck.add(new CardsDTO("skip", "red"));
		
		for(int i=0; i<10; i++) {
			if(i==0) {
				deck.add(new CardsDTO((i)+"", "yellow"));
			}
			else{
				deck.add(new CardsDTO((i)+"", "yellow"));
				deck.add(new CardsDTO((i)+"", "yellow"));
			}
		}
		deck.add(new CardsDTO("take2", "yellow"));
		deck.add(new CardsDTO("take2", "yellow"));
		deck.add(new CardsDTO("reverse", "yellow"));
		deck.add(new CardsDTO("reverse", "yellow"));
		deck.add(new CardsDTO("skip", "yellow"));
		deck.add(new CardsDTO("skip", "yellow"));

		
		deck.add(new CardsDTO("wildcard", "*"));
		deck.add(new CardsDTO("wildcard", "*"));
		deck.add(new CardsDTO("wildcard", "*"));
		deck.add(new CardsDTO("wildcard", "*"));
		deck.add(new CardsDTO("take4", "*"));
	}
	
	public void shuffle() {
		Random r1 = new Random(); 
        for (int i = deck.getCards().length - 1; i >= 1; i--) {
        	CardsDTO temp = deck.getCards()[i];
            deck.getCards()[i] = deck.getCards()[r1.nextInt(i + 1)];
            deck.getCards()[r1.nextInt(i + 1)] = temp;
        }
	}
}
