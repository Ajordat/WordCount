package logic;

import tad.Tree;

public class Main {

	public static void main(String[] args) {
		Tree t =  new Tree();
		t.add(new Node(new Word("C")));
		t.add(new Node(new Word("B")));
		t.add(new Node(new Word("A")));
		System.out.println("\nPreorder\n--------"); 
		t.printPreOrder();
		t.getNode().rotationLL();
		System.out.println("\nPreorder\n--------"); 
		t.printPreOrder();
		
	}

}
