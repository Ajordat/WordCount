package tad;

/**
 * Implementa el node duna llista dinamica.
 */
public class Node {
	private Element e;
	private Node next;

	public Node() {}

	/**
	 * Inicialitza un node a patir dun element i un seguent.
	 */
	public Node(Element e, Node next) {
		this.e = e;
		this.next = next;
	}

	public Element getElement() {
		return e;
	}

	public void setElement(Element e) {
		this.e = e;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
