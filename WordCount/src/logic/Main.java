package logic;

import tad.AVLTree;
import tad.SearchTree;

public class Main {

	public static void main(String[] args) {
		
		AVLTree t = new AVLTree();
		System.out.println("-------");
		t.add(new Word("M"));
		System.out.println("-------");
		t.add(new Word("F"));
		System.out.println("-------");
		t.add(new Word("C"));
		System.out.println("-------");
		t.add(new Word("U"));
		System.out.println("-------");
		t.add(new Word("V"));
		System.out.println("-------");
		t.add(new Word("O"));
		System.out.println("-------");
		t.add(new Word("Y"));
		System.out.println("-------");
		t.add(new Word("A"));
		System.out.println("-------");
		t.add(new Word("G"));
		System.out.println("-------");
		t.add(new Word("P"));System.out.println("-------");
		t.add(new Word("K"));System.out.println("-------");
		t.add(new Word("W"));System.out.println("-------");
		t.add(new Word("B"));System.out.println("-------");
		t.add(new Word("D"));System.out.println("-------");
		t.add(new Word("E"));System.out.println("-------");
		t.add(new Word("H"));System.out.println("-------");
		t.add(new Word("I"));System.out.println("-------");
		t.add(new Word("J"));System.out.println("-------");
		t.add(new Word("L"));System.out.println("-------");
		t.add(new Word("N"));System.out.println("-------");
		t.add(new Word("Z"));System.out.println("-------");
		t.add(new Word("Q"));System.out.println("-------");
		t.add(new Word("R"));System.out.println("-------");
		t.add(new Word("S"));System.out.println("-------");
		t.add(new Word("T"));System.out.println("-------");
		t.add(new Word("X"));System.out.println("-------");
	
		System.out.println("\n\nPreOrder\n--------"); 
		t.printPreOrder();
		System.out.println("\n\nInOrder\n-------"); 
		t.printInOrder();
		System.out.println("\n\nPostOrder\n---------");
		t.printPostOrder();
		System.out.println("\n\nAlçada: "+t.height());
	}

}
