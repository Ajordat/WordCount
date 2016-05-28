package logic;

public class Main {
	private static boolean exit = false;
	private static int method = 0;
	
	public static void main(String[] args) {
		int option, optionResults;
		String fileName = "";
		Menu menu = new Menu();
		
		while(!exit){
			menu.printMain();
			option = menu.getOption();
			
			switch(option){
			
				case Menu.SELECT_FILE:
					fileName = menu.getFile();					
					break;
					
				case Menu.CALCULATE_APPEARANCES:
					if(fileName.isEmpty()){
						System.out.println("Choose a file.");
						break;
					}
					menu.printCalculateAppearances();
					int opt = menu.getOption();
					if(opt > 0 && opt < 5) method = opt;
					else System.out.println("Not a valid option.");
					break;
					
				case Menu.VIEW_RESULTS:
					if(fileName.isEmpty()){
						System.out.println("Choose a file.");
						break;
					}
					menu.printViewResults();
					optionResults = menu.getOption();
					switch(method){
						case Menu.SEARCH_TREE:
							menu.testSearchTree(optionResults, fileName);
							break;
							
						case Menu.AVL_TREE:
							menu.testAVLTree(optionResults, fileName);
							break;
							
						case Menu.AVL_TABLE:
							menu.testAVLTable(optionResults, fileName);
							break;
							
						case Menu.SORTED_LIST:
							menu.testSortedList(optionResults, fileName);
							break;
						default:
							System.out.println("Si arribes a aquesta opció, convalida PAED.");
					}
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
