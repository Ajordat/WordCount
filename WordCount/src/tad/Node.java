package tad;

public class Node {
	private Node left;
	private Node right;
	private Element e;
	
	public Node(Element e){
		this.e = e;
	}
	
	public Element getElement() {
		return e;
	}

	public void setElement(Element e) {
		this.e = e;
	}

	public void add(Node node){
		if(node.getElement().compareTo(e) <	0){
			if(left == null){
				left = node;
				left.getElement().add();
			}
			else left.add(node);
			
		}
		else if (node.getElement().compareTo(e) > 0){
			if(right == null){
				right = node;
				right.getElement().add();
			}
			else right.add(node);
		}
		else e.add();
	}
	
	public Element getValue(String key){
		if(e.compareTo(key) > 0){
			if(left == null) return null;
			else return left.getValue(key);
		}
		else if(e.compareTo(key) < 0){
			if(right == null) return null;
			else return right.getValue(key);
		}
		else return e;
	}
	
	public int height(){
		if(left == null && right == null) return 1;
		if(left == null) return right.height()+1;
		if(right == null) return left.height()+1;
		return Math.max(left.height(), right.height())+1;
	}
	
	public void rotationLL(){
		if(left == null) return;
		right = this;
		right.left = left.right;
		e = left.e;
		left = left.left;
	}
	
	public void rotationRR(){
		if(right == null) return;
		this.left = this;
		this.left.right = this.right.left;
		this.e = right.e;
		this.right = this.right.right;
	}
	
	public void printPreOrder(){
		System.out.println(e);
		if(left != null) left.printPreOrder();
		if(right != null) right.printPreOrder();
	}
	
	public void printInOrder(){
		if(left != null) left.printInOrder();
		System.out.println(e);
		if(right != null) right.printInOrder();
	}
	
	public void printPostOrder(){
		if(left != null) left.printPostOrder();
		if(right != null) right.printPostOrder();
		System.out.println(e);
	}
	
	@Override
	public String toString(){
		return e.toString();
	}
	
}
