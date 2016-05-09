package tad;

import logic.Node;

public class Tree {
	private Node node;
	
	public Tree(){
		node = null;
	}
	
	public Tree(Node node){
		this.node = node;
	}
	
	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public void add(Node node){
		System.out.println(node);
		if(this.node == null){
			this.node = node;
		}
		else{
			this.node.add(node);
		}
	}
	
	public void printPreOrder(){
		if(node != null) node.printPreOrder();
	}
	
	public void printInOrder(){
		if(node != null) node.printInOrder();
	}
	
	public void printPostOrder(){
		if(node != null) node.printPostOrder();
	}
	
	public int height(){
		if(node == null) return 0;
		return node.height();
	}
	
	public int getValue(String word){
		return node.getValue(word);
	}
	
}
