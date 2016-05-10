package tad;

public class SearchTree {
	private Node node;
	
	public SearchTree(){
		node = null;
	}
	
	public SearchTree(Node node){
		this.node = node;
		node.getElement().add();
	}
	
	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public void add(Node node){
		if(this.node == null){
			this.node = node;
			this.node.getElement().add();
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
	
	public Element getValue(String key){
		return node.getValue(key);
	}
	
}
