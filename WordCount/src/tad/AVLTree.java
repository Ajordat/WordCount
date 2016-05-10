package tad;

public class AVLTree extends BTree {

	public AVLTree(){
		tree = null;
	}
	
	public AVLTree(NodeB node){
		tree = node;
		node.getElement().increaseValue();
	}
	
	public NodeB rotationLL(NodeB node){
		if(node == null || node.left == null) return node;
		NodeB aux = node.left;
		node.left = aux.right;
		aux.right = node;		
		return aux;
	}
	
	public NodeB rotationRR(NodeB node){
		if(node == null || node.right == null) return node;
		NodeB aux = node.right;
		node.right = aux.left;
		aux.left = node;		
		return aux;
	}
	
	public NodeB rotationLR(NodeB node){
		if(node == null || node.left == null) return node;
		node.left = rotationRR(node.left);
		node = rotationLL(node);
		return node;
	}
	
	public NodeB rotationRL(NodeB node){
		if(node == null || node.right == null) return node;
		node.right = rotationLL(node.right);
		node = rotationRR(node);
		return node;
	}

	@Override
	public Element getValue(String key) {
		return null;
	}

	@Override
	public void add(Element e) {
		insert(tree, e);
	}
	
	private void insert(NodeB node, Element element){
		if(node == null){
			node = new NodeB(element);
		}
		else if(element.compareTo(node.e) <	0){
			insert(node.left, element);
		}
		else if(element.compareTo(node.e) > 0){
			insert(node.right, element);
		}
		else node.e.increaseValue();
	}

}
