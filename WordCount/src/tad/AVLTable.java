package tad;

public class AVLTable extends Table{
	
	public AVLTable(){
		table = new AVLTree[N];
		for(int i = 0;i<N;i++){
			table[i] = new AVLTree();
		}
	}
	
	public int hash(Element e){
		return e.toString().toLowerCase().charAt(0)-'a';
	}
	
	public int hash(String key){
		return key.toLowerCase().charAt(0)-'a';
	}
	
	public void add(Element e){
		table[hash(e)].addWord(e);
	}
	
	public void remove(String key){
		((AVLTree) table[hash(key)]).remove(key);
	}

	public void copia(AVLTree prova) {
		for(BinaryTree t: table){
			((AVLTree) t).copia(prova);
		}
	}
	
}
