package tad;

import logic.Word;

public class NodeB {
	protected NodeB left;
	protected NodeB right;
	protected Element e;
	protected int height;
	
	public NodeB(Element e){
		this.e = e;
		left = null;
		right = null;
		height = 1;
	}
	
	public Element getElement() {
		return e;
	}

	public void setElement(Element e) {
		this.e = e;
	}

	public Element getValue(String key){
		if(e.compareTo(key) > 0){
			if(left == null) return new Word(key);
			else return left.getValue(key);
		}
		else if(e.compareTo(key) < 0){
			if(right == null) return new Word(key);
			else return right.getValue(key);
		}
		else return e;
	}
	
	public int height(){
		return height;
	}
	
	public void printPreOrder(){
		System.out.print(e);
		if(left != null) left.printPreOrder();
		if(right != null) right.printPreOrder();
	}
	
	public void printInOrder(){
		if(left != null) left.printInOrder();
		System.out.print(e);
		if(right != null) right.printInOrder();
	}
	
	public void printPostOrder(){
		if(left != null) left.printPostOrder();
		if(right != null) right.printPostOrder();
		System.out.print(e);
	}
	
	@Override
	public String toString(){
		return e.toString();
	}

	public Element first() {
		if(left == null) return e;
		return left.first();
	}
	
	public Element last(){
		if(right == null) return e;
		return right.last();
	}
	
}
