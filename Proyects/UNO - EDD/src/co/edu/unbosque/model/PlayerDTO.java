package co.edu.unbosque.model;

import java.util.ArrayList;

public class PlayerDTO {
	private List hand;
	private String name;
	
	public PlayerDTO() {
		// TODO Auto-generated constructor stub
	}

	public PlayerDTO(List hand, String name) {
		super();
		this.hand = hand;
		this.name = name;
	}

	public List getHand() {
		return hand;
	}

	public void setHand(List hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
