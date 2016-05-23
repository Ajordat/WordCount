package tad;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

import logic.Word;

public abstract class Table {
	
	protected BinaryTree[] table;
	protected static final int N = 'Z'-'A'+1;
	
	public BinaryTree[] getTable(){
		return table;
	}
	
	public abstract int hash(Element e);
	
	public abstract int hash(String key);
	
	public void add(Element e){
		table[hash(e)].addWord(e);
	}
	
	public int size(){
		int size = 0;
		for(BinaryTree t : table){
			size+=t.size();
		}		
		return size;
	}
	
	public abstract void remove(String key);
	
	public int heigh(String key){
		return table[hash(key)].height();
	}
	
	public int avgHeight(){
		int sum = 0;
		for(BinaryTree t : table){
			sum+=t.height();
		}
		return sum/N;
	}
	
	public Element getValue(String key){
		return table[hash(key)].getValue(key);
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
	
	public void printPreOrder(){
		for(BinaryTree t : table){
			t.printPreOrder();
		}
	}
	
	public Element first(){
		Element e;
		for(BinaryTree t : table){
			e = t.first();
			if(e!=null) return e;
		}
		return null;
	}
	
	public Element last(){
		Element e;
		for(int i = N-1;i>=0;i--){
			e = table[i].last();
			if(e!=null) return e;
		}
		return null;
	}
	
	public void clear(){
		for(int i = 0;i<N;i++){
			table[i].clear();
		}
	}
	
	public void toHtml(PrintWriter printw){
		for(BinaryTree t : table){
			t.toHtml(printw);
		}
	}
	
	public void printInOrder(){
		for(BinaryTree t : table){
			t.printInOrder();
		}
	}
	
	public void printPostOrder(){
		for(BinaryTree t : table){
			t.printPostOrder();
		}
	}
	
}
