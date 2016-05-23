package tad;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

import logic.Word;

public abstract class BinaryTree {
	protected NodeB tree;
	protected int size = 0;
	
	public abstract Element getValue(String key);
	public abstract void addWord(Element e);
	
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
		addWord(new Word("M"));addWord(new Word("F"));addWord(new Word("C"));
		addWord(new Word("U"));addWord(new Word("V"));addWord(new Word("O"));
		addWord(new Word("Y"));addWord(new Word("A"));addWord(new Word("G"));
		addWord(new Word("P"));addWord(new Word("K"));addWord(new Word("W"));
		addWord(new Word("B"));addWord(new Word("D"));addWord(new Word("E"));
		addWord(new Word("H"));addWord(new Word("I"));addWord(new Word("J"));
		addWord(new Word("L"));addWord(new Word("N"));addWord(new Word("Z"));
		addWord(new Word("Q"));addWord(new Word("R"));addWord(new Word("S"));
		addWord(new Word("T"));addWord(new Word("X"));
	}

	public void loadFile(String fileName){
		try {
			Scanner file = new Scanner(new FileReader(fileName));
			while(file.hasNext()){
				String line = file.nextLine();
				Scanner scanner = new Scanner(line.replaceAll("[^a-z^A-Z\\s]", "").toLowerCase());
				while(scanner.hasNext()){
					addWord(new Word(scanner.next()));
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
	
	public void toHtml(PrintWriter printw){
		if(tree != null) toHtml(printw, tree);
	}
	
	private void toHtml(PrintWriter printw, NodeB node){
		if(node.left != null) toHtml(printw, node.left);
		printw.println("<tr align=center><td>"+((Word)node.e).getWord()+"</td><td>"+((Word)node.e).getValue()+"</td></tr>");
		if(node.right != null) toHtml(printw, node.right);
	}
}
