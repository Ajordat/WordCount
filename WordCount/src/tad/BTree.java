package tad;

public abstract class BTree {
	protected NodeB tree;
	
	public abstract Element getValue(String key);
	public abstract void add(Element e);
	
	public void printPreOrder(){
		if(tree != null) tree.printPreOrder();
	}
	
	public void printInOrder(){
		if(tree != null) tree.printInOrder();
	}
	
	public void printPostOrder(){
		if(tree != null) tree.printPostOrder();
	}
	
	public int height(){
		if(tree != null) return tree.height();
		return 0;
	}
	public NodeB getTree() {
		return tree;
	}
	public void setTree(NodeB tree) {
		this.tree = tree;
	}
	
}
