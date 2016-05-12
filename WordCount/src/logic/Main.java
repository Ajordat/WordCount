package logic;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.ThreadMXBean;

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
					ThreadMXBean th = ManagementFactory.getThreadMXBean();
					long inici = System.nanoTime();
					
					MemoryMXBean tm = ManagementFactory.getMemoryMXBean();
					switch(Menu.getOption()){
						case Menu.SEARCH_TREE:
							method = Menu.SEARCH_TREE;
							searchTree.clear();
							searchTree.loadFile(fileName);
							System.out.println("first element: "+searchTree.first());
							System.out.println("last element: "+searchTree.last());
							System.out.println("height: "+searchTree.height());
							System.out.println("size: "+searchTree.size());
							break;
						case Menu.AVL_TREE:
							method = Menu.AVL_TREE;
							avlTree.clear();
							avlTree.loadFile(fileName);
							System.out.println("first element: "+avlTree.first());
							System.out.println("last element: "+avlTree.last());
							System.out.println("height: " +avlTree.height());
							System.out.println("size: "+avlTree.size());
							break;
					}
					System.out.println("memory init: "+tm.getHeapMemoryUsage().getInit());
					System.out.println("memory used: "+tm.getHeapMemoryUsage().getUsed());
					System.out.println("memory max: "+tm.getHeapMemoryUsage().getMax());
					System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
					System.out.println("Temps CPU = " + th.getCurrentThreadCpuTime()/1000000);
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
