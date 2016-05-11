package logic;

import tad.AVLTree;
import tad.SearchTree;

public class Main {
	private static String fileName = "";
	private static boolean exit = false;
	private static int method = 0;
	private static SearchTree searchTree = new SearchTree();
	private static AVLTree avlTree = new AVLTree();
	
	public static void main(String[] args) {
		int option, optionResults;
		while(!exit){
			Menu.printMain();
			option = Menu.getOption();
			
			switch(option){
			
				case Menu.SELECT_FILE:
					fileName = Menu.getFile();					
					break;
					
				case Menu.CALCULATE_APPEARANCES:
					if(fileName.isEmpty()){
						System.out.println("Choose a file.");
						break;
					}
					Menu.printCalculateAppearances();
					switch(Menu.getOption()){
					case Menu.SEARCH_TREE:
						method = Menu.SEARCH_TREE;
						searchTree.clear();
						searchTree.loadFile(fileName);
						break;
					case Menu.AVL_TREE:
						method = Menu.AVL_TREE;
						avlTree.clear();
						avlTree.loadFile(fileName);
						break;
					}
					
					break;
					
				case Menu.VIEW_RESULTS:
					if(fileName.isEmpty()){
						System.out.println("Choose a file.");
						break;
					}
					Menu.printViewResults();
					optionResults = Menu.getOption();
					break;
					
				case Menu.EXIT:
					exit = true;
					break;
					
				default:
					System.out.println("Te reviento: "+option+"\n");
			}
			
		}
	}

}
