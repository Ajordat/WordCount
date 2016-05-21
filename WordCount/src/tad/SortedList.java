package tad;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import logic.Word;

/**
 * Implementa una llista dinamica destudiants.
 */
public class SortedList {
	private Node first;
	private Node previous;
	private int size;

	public SortedList() {
		first = new Node();
		previous = first;
		size = 0;
	}
	
	public int size(){
		return size;
	}
	
	/**
	 * Insereix una paraula a la posició del PDI de forma alfabètica
	 */
	public void addWord(Element e) {
		Node n = new Node();
		previous = first;
		while(previous.getNext() != null && previous.getNext().getElement().compareTo(e) < 0){
			previous = previous.getNext();
		}
		if(previous.getNext() != null && previous.getNext().getElement().compareTo(e)==0){
			previous.getNext().getElement().increaseValue();
		}
		else{
			e.increaseValue();
			n.setElement(e);
			n.setNext(previous.getNext());
			previous.setNext(n);
			previous = n;
			size++;
		}
	}
	
	/**
	 * Insereix una paraula a la posició del PDI segons el nombre d'aparicions
	 * @param e Element a inserir
	 */
	public void addValue(Element e){
		Node n = new Node();
		previous = first;
		while(previous.getNext() != null && previous.getNext().getElement().compareTo(((Word)e).getValue()) >= 0){
			previous = previous.getNext();
		}
		n.setElement(e);
		n.setNext(previous.getNext());
		previous.setNext(n);
		previous = n;
		size++;
	}

	/**
	 * Retorna l'element apuntat per el PDI.
	 */
	public Element get() {
		if (previous.getNext() != null) {
			return previous.getNext().getElement();
		}
		return null;
	}

	/**
	 * Elimina lelement apuntat per el PDI.
	 */
	public boolean delete() {
		if (previous.getNext() != null) {
			previous.setNext(previous.getNext().getNext());
			return true;
		}
		return false;
	}

	/**
	 * Elimina tots els elements de la llista.
	 */
	public void clear() {
		first.setNext(null);
		previous = first;
	}

	/**
	 * Situa el PDI a l'inici de la llista.
	 */
	public void goFirst() {
		previous = first;
	}
	
	public Element first(){
		return first.getNext().getElement();
	}
	
	public Element last(){
		while(previous.getNext() != null) previous = previous.getNext();
		return previous.getElement();	
	}

	/**
	 * Comprova si el PDI esta al final.
	 */
	public boolean end() {
		return previous.getNext() == null;
	}

	/**
	 * Comprova si la llista esta buida.
	 */
	public boolean empty() {
		return first.getNext() == null;
	}
	
	public void loadTest(){
		addWord(new Word("M"));addWord(new Word("F"));addWord(new Word("C"));
		addWord(new Word("U"));addWord(new Word("V"));addWord(new Word("O"));
		addWord(new Word("Y"));addWord(new Word("A"));addWord(new Word("G"));
		addWord(new Word("P"));addWord(new Word("K"));addWord(new Word("W"));
		addWord(new Word("B"));addWord(new Word("D"));addWord(new Word("E"));
		addWord(new Word("H"));addWord(new Word("I"));addWord(new Word("J"));
		addWord(new Word("B"));addWord(new Word("D"));addWord(new Word("E"));
		addWord(new Word("H"));addWord(new Word("I"));addWord(new Word("J"));
		addWord(new Word("L"));addWord(new Word("N"));addWord(new Word("Z"));
		addWord(new Word("Q"));addWord(new Word("R"));addWord(new Word("S"));
		addWord(new Word("T"));addWord(new Word("X"));
	}
	
	public void print(){
		previous = first;
		while(previous.getNext() != null){
			System.out.println(previous.getNext().getElement());
			previous = previous.getNext();
		}
	}
	
	public void copia(SortedList l){
		Element e;
		if(first != null){
			previous = first;
			while(previous.getNext()!=null){
				e = previous.getNext().getElement();
				l.addValue(e);
				previous = previous.getNext();
			}
		}
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
}
