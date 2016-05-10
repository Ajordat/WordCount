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
		//if(node == null || node.left == null) return node;
		NodeB aux = node.left;
		node.left = aux.right;
		aux.right = node;		
		return aux;
	}
	
	public NodeB rotationRR(NodeB node){
		//if(node == null || node.right == null) return node;
		NodeB aux = node.right;
		node.right = aux.left;
		aux.left = node;		
		return aux;
	}
	
	public NodeB rotationLR(NodeB node){
		//if(node == null || node.left == null) return node;
		node.left = rotationRR(node.left);
		node = rotationLL(node);
		return node;
	}
	
	public NodeB rotationRL(NodeB node){
		//if(node == null || node.right == null) return node;
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
		if(tree == null) tree = new NodeB(e);
		else insert(tree, e);
	}
	public int height(NodeB node){
		if(node == null) return 0;
		return node.height();
	}
	
	private void insert(NodeB node, Element element){
		System.out.println(element);
		if(element.compareTo(node.e) <	0){
			if(node.left == null){
				System.out.println("insert left");
				node.left = new NodeB(element);
			}
			else{
				System.out.println("check left");
				insert(node.left, element);
			}
			
		}
		else if(element.compareTo(node.e) > 0){
			if(node.right == null){
				System.out.println("insert right");
				node.right = new NodeB(element);
			}
			else{
				System.out.println("check right");
				insert(node.right, element);
			}
			
		}
		else node.e.increaseValue();
		
		if(height(node.left) - height(node.right) > 1){
			if(element.compareTo(node.left.e) < 0){
				System.out.println("RotationLL: "+node);
				node = rotationLL(node);
			}else{
				System.out.println("RotationLR: " + node);
				node = rotationLR(node);
			}
		}else if(height(node.left) - height(node.right) < -1){
			if(element.compareTo(node.right.e) > 0){
				System.out.println("RotationRR: "+node);
				node = rotationRR(node);
			}else{
				System.out.println("RotationRL: "+node);
				node = rotationRL(node);
			}
		}
		node.printPreOrder();
		System.out.println();
	}

}
