package tad;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import logic.Word;

public abstract class BTree {
	protected NodeB tree;
	protected int size = 0;
	
	public abstract Element getValue(String key);
	public abstract void add(Element e);
	
	public void printPreOrder(){
		if(tree != null) tree.printPreOrder();
	}
	
	public void printInOrder(){
		if(tree != null) tree.printInOrder();
	}
	
	public void printPostOrder(){
		if(tree != null) tree.printPostOrder();
	}
	
	public int size(){
		return size;
	}
	
	public int height(){
		if(tree != null) return tree.height();
		return 0;
	}
	
	public NodeB getTree() {
		return tree;
	}
	
	public void setTree(NodeB tree) {
		this.tree = tree;
	}
	
	public Element first(){
		if(tree == null) return null;
		return tree.first();
	}
	
	public Element last(){
		if(tree == null) return null;
		return tree.last();
	}
	
	public Element top(){
		if(tree == null) return null;
		return tree.e;
	}
	
	public boolean empty(){
		return tree == null;
	}
	
	public void clear(){
		tree = null;
		size = 0;
	}
	
	public void loadTest(){
		add(new Word("M"));add(new Word("F"));add(new Word("C"));
		add(new Word("U"));add(new Word("V"));add(new Word("O"));
		add(new Word("Y"));add(new Word("A"));add(new Word("G"));
		add(new Word("P"));add(new Word("K"));add(new Word("W"));
		add(new Word("B"));add(new Word("D"));add(new Word("E"));
		add(new Word("H"));add(new Word("I"));add(new Word("J"));
		add(new Word("L"));add(new Word("N"));add(new Word("Z"));
		add(new Word("Q"));add(new Word("R"));add(new Word("S"));
		add(new Word("T"));add(new Word("X"));
	}

	public void loadFile(String fileName){
		try {
			Scanner file = new Scanner(new FileReader(fileName));
			while(file.hasNext()){
				String line = file.nextLine();
				Scanner scanner = new Scanner(line.replaceAll("[^a-z^A-Z\\s]", "").toLowerCase());
				while(scanner.hasNext()){
					add(new Word(scanner.next()));
				}
				scanner.close();
			}
			file.close();			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e){
			e.printStackTrace();
		}
	}
}
