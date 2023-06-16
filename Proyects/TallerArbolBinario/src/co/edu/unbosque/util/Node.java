package co.edu.unbosque.util;

import co.edu.unbosque.model.PersonDTO;

public class Node {
	private PersonDTO object;
	private Node left, right;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	
	public Node(PersonDTO person) {
		this.object = person;
		this.left = this.right = null;
	}

	public PersonDTO getObject() {
		return object;
	}

	public void setObject(PersonDTO object) {
		this.object = object;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}
