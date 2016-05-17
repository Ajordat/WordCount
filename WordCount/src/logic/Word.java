package logic;

import tad.Element;

public class Word extends Element{
	private String word;
	private int value;
	
	public int getValue() {
		return value;
	}
	
	public Word(String word){
		this.word = word;
		value = 0;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public boolean equals (Object o){
		if(o.getClass() != String.class) return false;
		if(((String) o).equals(word)) return true;
		return false;
	}
	
	@Override
	public String toString(){
		return word + " " + value;
	}

	@Override
	public int compareTo(Element o) {
		return word.compareToIgnoreCase(((Word) o).getWord());
	}
	
	@Override
	public int compareTo(String key) {
		return word.compareToIgnoreCase(key);
	}

	@Override
	public void increaseValue() {
		value++;
	}
	@Override
	public void increaseValue(int inc) {
		value += inc;
	}

	public void resetValue(){
		value = 0;
	}
	
}
