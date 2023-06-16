package co.edu.unbosque.model;

public class PlayerDAO {
	private PlayerDTO[] players;
	
	public PlayerDAO() {
		players = new PlayerDTO[3];
	}
	
	public void playCard(int player, int pos) {
		players[player].getHand().remove(pos);
	}
	
	public void stealCard(int player, CardsDTO card) {
		players[player].getHand().add(card);
	}
	
	public boolean win(int player) {
		if(players[player].getHand().getCards().length == 0) return true;
		else return false;
	}
	
}
