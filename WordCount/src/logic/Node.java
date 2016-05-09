package logic;

public class Node {
	private Node left;
	private Node right;
	private Word word;
	
	public Node(Word word){
		this.word = word;
	}
	
	public Word getWord() {
		return word;
	}

	public void setWord(Word word) {
		this.word = word;
	}

	public void add(Node node){
		if(node.getWord().compareTo(word) < 0){
			if(left == null){
				left = node;
			}
			else{
				left.add(node);
			}
		}
		else if (node.getWord().compareTo(word) > 0){
			if(right == null){
				right = node;
			}
			else{
				right.add(node);
			}
		}
		else node.getWord().add();
	}
	
	public int height(){
		if(left == null && right == null) return 1;
		if(left == null) return right.height()+1;
		if(right == null) return left.height()+1;
		return Math.max(left.height(), right.height())+1;
	}
	
	public int getValue(String key){
		if(word.getWord().equals(key)){
			System.out.println("Trobat.");
			return word.getValue();
		}
		if(word.getWord().compareTo(key) > 0){
			System.out.println("Esquerra.");
			if(left != null) return left.getValue(key);
			else return -1;
		}
		else{
			System.out.println("Dreta.");
			if(right != null) return right.getValue(key);
			else return -1;
		}
	}
	
	public void rotationLL(){
		if(left == null) return;
		right = this;
		right.left = left.right;
		word = left.word;
		left = left.left;		
	}
	
	public void rotationRR(){
		if(right == null) return;
		this.left = this;
		this.left.right = this.right.left;
		this.word = right.word;
		this.right = this.right.right;
	}
	
	public void printPreOrder(){
		System.out.println(word);
		if(left != null) left.printPreOrder();
		if(right != null) right.printPreOrder();
	}
	
	public void printInOrder(){
		if(left != null) left.printInOrder();
		System.out.println(word);
		if(right != null) right.printInOrder();
	}
	
	public void printPostOrder(){
		if(left != null) left.printPostOrder();
		if(right != null) right.printPostOrder();
		System.out.println(word);
	}
	
	@Override
	public String toString(){
		return word.toString();
	}
	
}
