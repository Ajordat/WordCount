package logic;

public class Word implements Comparable<Word>{
	private String word;
	public int getValue() {
		return value;
	}

	private int value;
	
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

	public void add(){
		value++;
	}
	
	public int compareTo(Word o) {
		return word.compareTo(o.getWord());
	}
	
	public boolean equals (Object o){
		if(o.getClass() != String.class) return false;
		if(((String)o).equals(word)) return true;
		return false;
	}
	
	@Override
	public String toString(){
		return word;
	}
	
}
