package tad;

public class Memory {
	
	protected static final int INT = 4;
	protected static final int NODEB = 4;
	protected static final int NODE = 4;
	protected static final int STRING = 5;
	
	public static int get(BinaryTree tree){
		return INT + tree.size() * (STRING + 2 * (INT + NODEB) );
	}
	
	public static int get(SortedList list){
		return INT + 2 * NODE + list.size() * (STRING + INT + NODE);
	}
	
	public static int get(Table t){
		int memoria = INT;
		for(BinaryTree tree : t.getTable()){
			memoria += INT + tree.size() * (STRING + 2 * (INT + NODEB) );
		}
		return memoria;
	}
	
}
