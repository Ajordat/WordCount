package tad;

public abstract class Element implements Comparable<Element> {
	
	public abstract int compareTo(Element o);
	public abstract int compareTo(String key);
	public abstract void increaseValue();
	public abstract void resetValue();
	public abstract String toString();
	
}
