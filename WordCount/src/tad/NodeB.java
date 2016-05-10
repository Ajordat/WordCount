package tad;

public class NodeB {
	protected NodeB left;
	protected NodeB right;
	protected Element e;
	
	public NodeB(Element e){
		this.e = e;
	}
	
	public Element getElement() {
		return e;
	}

	public void setElement(Element e) {
		this.e = e;
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
	
}
