package tad;

public abstract class Element implements Comparable<Element> {
	
	public abstract int compareTo(Element o);
	public abstract int compareTo(String key);
	public abstract void add();
	public abstract String toString();
	
}
