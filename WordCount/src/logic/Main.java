package logic;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

import tad.*;

public class Main {
	private static String fileName = "";
	private static boolean exit = false;
	private static int method = 0;
	private static SearchTree searchTree = new SearchTree();
	private static AVLTree avlTree = new AVLTree();
	private static AVLTable avlTable = new AVLTable();
	private static DynamicList dList = new DynamicList();
	
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
					int opt = Menu.getOption();
					/*
					ThreadMXBean th = ManagementFactory.getThreadMXBean();
					
					MemoryMXBean tm = ManagementFactory.getMemoryMXBean();
					int opt = Menu.getOption();
					
					long inici = System.nanoTime();
					long timeCPU = th.getCurrentThreadCpuTime();
					*/
					switch(opt){
					
						case Menu.SEARCH_TREE:
							method = Menu.SEARCH_TREE;
							break;
							
						case Menu.AVL_TREE:
							method = Menu.AVL_TREE;
							break;
							
						case Menu.AVL_TABLE:
							method = Menu.AVL_TABLE;
							break;
						case Menu.SORTED_LIST:
							method = Menu.SORTED_LIST;
							break;
							
					}
					/*
					System.out.println("memory init: "+tm.getHeapMemoryUsage().getInit());
					System.out.println("memory used: "+tm.getHeapMemoryUsage().getUsed());
					System.out.println("memory max: "+tm.getHeapMemoryUsage().getMax());
					System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
					System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
					*/
					break;
					
				case Menu.VIEW_RESULTS:
					if(fileName.isEmpty()){
						System.out.println("Choose a file.");
						break;
					}
					Menu.printViewResults();
					optionResults = Menu.getOption();
					switch(method){
						case Menu.SEARCH_TREE:
							searchTree.clear();
							
							ThreadMXBean th = ManagementFactory.getThreadMXBean();
							long inici = System.nanoTime();
							long timeCPU = th.getCurrentThreadCpuTime();
							
							searchTree.loadFile(fileName);
							if(optionResults == Menu.NUMBER_OF_APPEARANCES){
								SearchTree prova = new SearchTree();
								searchTree.copia(prova);
								System.out.print("first element: "+prova.first());
								System.out.print("last element: "+prova.last());
								System.out.println("height: "+prova.height()+"\n");
							}
							else{
								System.out.print("first element: "+searchTree.first());
								System.out.print("last element: "+searchTree.last());
								System.out.println("height: "+searchTree.height()+"\n");
							}
							System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
							System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
							break;
							
						case Menu.AVL_TREE:
							avlTree.clear();
							ThreadMXBean th1 = ManagementFactory.getThreadMXBean();
							long inici1 = System.nanoTime();
							long timeCPU1 = th1.getCurrentThreadCpuTime();
							avlTree.loadFile(fileName);
							if(optionResults == Menu.NUMBER_OF_APPEARANCES){
								AVLTree prova = new AVLTree();
								avlTree.copia(prova);
								System.out.println("first element: "+prova.first());
								System.out.println("top element: "+prova.top());
								System.out.println("last element: "+prova.last());
								System.out.println("height: "+prova.height());
								System.out.println("size: "+prova.size());
								prova.printInOrder();
								//VOLQUEM EL CONTINGUT DE L'AVL A L'ALTRE AVL ON S'ORDENA PER QUANTITAT D'APARICIONS 
							}else{
								System.out.println("first element: "+avlTree.first());
								System.out.println("top element: "+avlTree.top());
								System.out.println("last element: "+avlTree.last());
								System.out.println("height: " +avlTree.height());
								System.out.println("size: "+avlTree.size());
							}
							System.out.println("Temps real = " + (System.nanoTime()-inici1)/1000000);
							System.out.println("Temps CPU = " + (th1.getCurrentThreadCpuTime()-timeCPU1)/1000000);
							break;
							
						case Menu.AVL_TABLE:
							avlTable.clear();
							ThreadMXBean th2 = ManagementFactory.getThreadMXBean();
							long inici2 = System.nanoTime();
							long timeCPU2 = th2.getCurrentThreadCpuTime();
							avlTable.loadFile(fileName);
							if(optionResults == Menu.NUMBER_OF_APPEARANCES){
								//VOLQUEM EL CONTINGUT DE L'AVL A L'ALTRE AVL ON S'ORDENA PER QUANTITAT D'APARICIONS 
							}else{
								System.out.println("first element: "+avlTable.first());
								System.out.println("last element: "+avlTable.last());
								System.out.println("height: " +avlTable.avgHeight());
								System.out.println("size: "+avlTable.size());
								avlTable.printInOrder();
							}
							System.out.println("Temps real = " + (System.nanoTime()-inici2)/1000000);
							System.out.println("Temps CPU = " + (th2.getCurrentThreadCpuTime()-timeCPU2)/1000000);
							
							break;
						case Menu.SORTED_LIST:
							dList.clear();
							ThreadMXBean th4 = ManagementFactory.getThreadMXBean();
							long inici4 = System.nanoTime();
							long timeCPU4 = th4.getCurrentThreadCpuTime();
							dList.loadFile(fileName);
							if(optionResults == Menu.NUMBER_OF_APPEARANCES){
								DynamicList aux = new DynamicList();
								dList.copia(aux);
								System.out.println("Temps real = " + (System.nanoTime()-inici4)/1000000);
								System.out.println("Temps CPU = " + (th4.getCurrentThreadCpuTime()-timeCPU4)/1000000);
								
								System.out.println("first element: "+aux.first());
								System.out.println("last element: "+aux.last());
								System.out.println("size: "+aux.size());
								//VOLQUEM EL CONTINGUT DE L'AVL A L'ALTRE AVL ON S'ORDENA PER QUANTITAT D'APARICIONS 
							}else{

								System.out.println("Temps real = " + (System.nanoTime()-inici4)/1000000);
								System.out.println("Temps CPU = " + (th4.getCurrentThreadCpuTime()-timeCPU4)/1000000);
								
								System.out.println("first element: "+dList.first());
								System.out.println("last element: "+dList.last());
								System.out.println("size: "+dList.size());
								avlTable.printInOrder();
							}
							break;
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
