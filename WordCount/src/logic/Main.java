package logic;

import tad.AVLTree;
import tad.SearchTree;

public class Main {

	public static void main(String[] args) {
		/*
		SearchTree t =  new SearchTree();
		t.add(new Word("M"));
		t.add(new Word("F"));
		t.add(new Word("C"));
		t.add(new Word("U"));
		t.add(new Word("V"));
		t.add(new Word("O"));
		t.add(new Word("Y"));
		t.add(new Word("A"));
		t.add(new Word("G"));
		t.add(new Word("P"));
		t.add(new Word("K"));
		t.add(new Word("W"));
		t.add(new Word("B"));
		t.add(new Word("D"));
		t.add(new Word("E"));
		t.add(new Word("H"));
		t.add(new Word("I"));
		t.add(new Word("J"));
		t.add(new Word("L"));
		t.add(new Word("N"));
		t.add(new Word("Z"));
		t.add(new Word("Q"));
		t.add(new Word("R"));
		t.add(new Word("S"));
		t.add(new Word("T"));
		t.add(new Word("X"));
		*/
		AVLTree t = new AVLTree();
		System.out.println("\n\nPreOrder\n--------"); 
		t.printPreOrder();
		t.add(new Word("M"));
		t.add(new Word("F"));
		t.add(new Word("C"));
		t.add(new Word("U"));
		t.add(new Word("V"));
		t.add(new Word("O"));
		t.add(new Word("Y"));
		t.add(new Word("A"));
		t.add(new Word("G"));
		t.add(new Word("P"));
		t.add(new Word("K"));
		t.add(new Word("W"));
		t.add(new Word("B"));
		t.add(new Word("D"));
		t.add(new Word("E"));
		t.add(new Word("H"));
		t.add(new Word("I"));
		t.add(new Word("J"));
		t.add(new Word("L"));
		t.add(new Word("N"));
		t.add(new Word("Z"));
		t.add(new Word("Q"));
		t.add(new Word("R"));
		t.add(new Word("S"));
		t.add(new Word("T"));
		t.add(new Word("X"));
		//t.setNode(t.rotationLL(t.getNode()));

		
		System.out.println("\n\nInOrder\n-------"); 
		t.printInOrder();
		System.out.println("\n\nPostOrder\n---------");
		t.printPostOrder();
		System.out.println("\n\nAlçada: "+t.height());
		
	}

}
