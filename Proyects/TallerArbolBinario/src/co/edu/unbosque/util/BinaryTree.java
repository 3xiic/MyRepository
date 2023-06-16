package co.edu.unbosque.util;

import java.util.ArrayList;

import co.edu.unbosque.model.PersonDTO;

public class BinaryTree {
	private Node root; 
	private int nodes;
	private Node[] arr;
	private int i = 0;
	
//	public static void main(String[] args) {
//		BinaryTree bt = new BinaryTree();
//		BinaryTree bt2 = new BinaryTree();
//		bt.add("*", new PersonDTO("Juan", 76, "H"));
//		bt.add("Juan", new PersonDTO("Pepe", 55, "H"));
//		bt.add("Juan", new PersonDTO("Maria", 54, "M"));
//		bt.add("Pepe", new PersonDTO("Yuya", 32, "M"));
//		bt.add("Maria", new PersonDTO("Mateo", 25, "H"));
//		
//		System.out.println(bt.nodes);
//		System.out.println();
//		System.out.println(bt.exist("Mateo"));
//		System.out.println();
//		System.out.println(bt.preorden());
//		System.out.println();
//		System.out.println(bt.postorden());
//		System.out.println();
//		System.out.println(bt.inorden());
//		System.out.println();
//		for (int i = 0; i < bt.arr.length; i++) {
//			bt2.createCopy(bt.arr[i].getObject());
//		}
//		System.out.println(bt2.nodes);
//		System.out.println();
//		System.out.println(bt2.exist("Mateo"));
//		System.out.println();
//		System.out.println(bt2.preorden());
//		System.out.println();
//		System.out.println(bt2.postorden());
//		System.out.println();
//		System.out.println(bt2.inorden());
//		System.out.println();
//	}
	
	public BinaryTree() {
		root = null;
		nodes = 0;
	}
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public Node[] getArr() {
		return arr;
	}

	public void setArr(Node[] arr) {
		this.arr = arr;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public boolean isEmpty() {
		return this.root == null;
	}
	public int size() {
		return nodes;
	}
	
	//Search
	public boolean exist(String name) {
        return exist(this.root, name);
    }

    private boolean exist(Node n, String name) {
        if (isEmpty()) {
            return false;
        }
        if (n.getObject().getName().equals(name)) {
            return true;
        } else if (n.getLeft() != null && exist(n.getLeft(), name)) {
            return true;
        } else if (n.getRight() !=  null && exist(n.getRight(), name)) {
        	return true;
        }else {
            return false;
        }
    }

	//Add
	public boolean add(String father, PersonDTO newperson) {
		try {
			   if (this.root == null && father.equals("*")) {
		        	this.nodes++;
		            this.root = new Node(newperson);
		            return true;
		        } else {
		            return this.add(this.root, father, newperson);
		        }
		} catch (Exception e) {
			return false;
		}
     
    }

    private boolean add(Node father_node, String father, PersonDTO newperson) {
        if (father.equals(father_node.getObject().getName())) {
            if (father_node.getLeft() == null) {
            	this.nodes++;
            	father_node.setLeft(new Node(newperson));
            	return true;
            } else if (father_node.getRight() == null) {
            	this.nodes++;
            	father_node.setRight(new Node(newperson));
            	return true;
            } else {
                return false;
            }
        } else {
        	if (father_node.getLeft() != null && this.add(father_node.getLeft(), father, newperson)) {
        		return true;
        	} else if (father_node.getRight() != null && this.add(father_node.getRight(), father, newperson)) {
        		return true;
        	} else {
        		return false;
        	}
        }
    }
    
    //Show
    private String preorden(Node n) {
    	StringBuilder sb = new StringBuilder();
        if (n != null) {
        	sb.append("("+n.getObject().getName()+" "+n.getObject().getAge()+" "+n.getObject().getGender()+") ");
            sb.append(preorden(n.getLeft()));
            sb.append(preorden(n.getRight()));
        }
        return sb.toString();
    }

    private String inorden(Node n) {
    	StringBuilder sb = new StringBuilder();
        if (n != null) {
        	sb.append(inorden(n.getLeft()));
        	sb.append("("+n.getObject().getName()+" "+n.getObject().getAge()+" "+n.getObject().getGender()+") ");
        	arr[i] = n;
        	i++;
        	sb.append(inorden(n.getRight()));
        }
        return sb.toString();
    }

    private String postorden(Node n) {
    	StringBuilder sb = new StringBuilder();
        if (n != null) {
        	sb.append(postorden(n.getLeft()));
        	sb.append(postorden(n.getRight()));
            sb.append("("+n.getObject().getName()+" "+n.getObject().getAge()+" "+n.getObject().getGender()+") ");
        }
        return sb.toString();
    }

    public String preorden() {
        return this.preorden(this.root);
    }

    public String inorden() {
    	i = 0;
    	arr = new Node[nodes];
    	for (int i = 0; i < arr.length; i++) {
			arr[i] = new Node();
		}
        return this.inorden(this.root);
    }

    public String postorden() {
        return this.postorden(this.root);
    }
    
    //Create copy of the tree
    public void createCopy(PersonDTO newperson) {
        if (this.root == null) {
        	this.nodes++;
            this.root = new Node(newperson);
        } else {
            this.createCopy(this.root, newperson);
        }
    }
    
    private void createCopy(Node padre, PersonDTO newperson) {
        if (newperson.getAge() > padre.getObject().getAge()) {
            if (padre.getRight() == null) {
            	this.nodes++;
                padre.setRight(new Node(newperson));
            } else {
                this.createCopy(padre.getRight(), newperson);
            }
        } else {
            if (padre.getLeft() == null) {
            	this.nodes++;
                padre.setLeft(new Node(newperson));
            } else {
                this.createCopy(padre.getLeft(), newperson);
            }
        }
    }

	public int getNodes() {
		return nodes;
	}

	public void setNodes(int nodes) {
		this.nodes = nodes;
	}
}
