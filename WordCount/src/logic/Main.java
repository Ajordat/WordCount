package logic;

import tad.Node;
import tad.SearchTree;

public class Main {

	public static void main(String[] args) {
		SearchTree t =  new SearchTree();
		t.add(new Node(new Word("ALEX")));
		t.add(new Node(new Word("SAMUEL")));
		t.add(new Node(new Word("GABRIEL")));
		t.add(new Node(new Word("ROGER")));
		t.add(new Node(new Word("MARTA")));
		System.out.println("\nPreOrder\n--------"); 
		t.printPreOrder();
		System.out.println("\nInOrder\n-------"); 
		t.printInOrder();
		System.out.println("\nPostOrder\n---------");
		t.printPostOrder();
		System.out.println("\nAlçada: "+t.height());		
	}

}
