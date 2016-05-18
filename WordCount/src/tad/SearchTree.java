package tad;

public class SearchTree extends BTree {
	
	public SearchTree(){
		tree = null;
	}
	
	public SearchTree(NodeSearch node){
		tree = node;
		node.getElement().increaseValue();
	}
	
	public SearchTree(Element e){
		tree = new NodeSearch(e);
	}
	
	public void addWord(Element e){
		if(tree == null){
			tree = new NodeSearch(e);
			tree.getElement().increaseValue();
		}
		else{
			size += ((NodeSearch) tree).addWord(e);
		}
	}
	
	public void addValue(Element e){
		if(tree == null){
			tree = new NodeSearch(e);
			tree.getElement().increaseValue();
		}
		else{
			size += ((NodeSearch) tree).addValue(e);
		}
	}
	
	public Element getValue(String key){
		return tree.getValue(key);
	}
	
	public void copia(SearchTree t){
		if(tree.left != null) extreu(t,tree);
	}
	
	private void extreu (SearchTree t, NodeB node){
		if(node.left != null) extreu(t, node.left);
		t.addValue(node.e);
		if(node.right != null) extreu(t, node.right);
	}
	
}
