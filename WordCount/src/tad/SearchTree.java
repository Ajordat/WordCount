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
	
	public void add(Element e){
		if(tree == null){
			tree = new NodeSearch(e);
			tree.getElement().increaseValue();
		}
		else{
			((NodeSearch) tree).add(e);
		}
	}

	public Element getValue(String key){
		return tree.getValue(key);
	}
	
}
