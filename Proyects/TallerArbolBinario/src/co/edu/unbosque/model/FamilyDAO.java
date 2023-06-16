package co.edu.unbosque.model;

import co.edu.unbosque.util.BinaryTree;

public class FamilyDAO {
	
	private BinaryTree b;
	private BinaryTree bCopy;
	

	public FamilyDAO() {
		b = new BinaryTree();
		bCopy = new BinaryTree();
	}

	public BinaryTree getbCopy() {
		return bCopy;
	}
	
	public void setbCopy(BinaryTree bCopy) {
		this.bCopy = bCopy;
	}
	public BinaryTree getB() {
		return b;
	}

	public void setB(BinaryTree b) {
		this.b = b;
	}
	
}
