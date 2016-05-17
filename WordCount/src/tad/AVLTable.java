package tad;

public class AVLTable extends Table{

	//protected AVLTree[] table;
	protected static final int N = 'Z'-'A'+1;
	
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
		table[hash(e)].add(e);
	}
	
	public void remove(String key){
		((AVLTree) table[hash(key)]).remove(key);
	}
	
	public int heigh(String key){
		return table[hash(key)].height();
	}
	
	public int avgHeight(){
		int sum = 0;
		for(BTree t : table){
			sum+=t.height();
		}
		return sum/N;
	}
	
	public Element getValue(String key){
		return table[hash(key)].getValue(key);
	}
	
}
