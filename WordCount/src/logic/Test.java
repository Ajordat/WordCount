package logic;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

import tad.AVLTable;
import tad.AVLTree;
import tad.SearchTree;
import tad.SortedList;

public class Test {
	
	public static void testSearchTreeAlpha(String fileName){
		SearchTree searchTree = new SearchTree();
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		long inici = System.nanoTime();
		long timeCPU = th.getCurrentThreadCpuTime();
		
		searchTree.loadFile(fileName);
		
		System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
		System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
		
		System.out.print("first element: "+searchTree.first());
		System.out.print("last element: "+searchTree.last());
		System.out.println("height: "+searchTree.height()+"\n");
	}
	
	public static void testSearchTreeNumber(String fileName){
		SearchTree searchTree = new SearchTree();
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		long inici = System.nanoTime();
		long timeCPU = th.getCurrentThreadCpuTime();
		
		searchTree.loadFile(fileName);
		SearchTree prova = new SearchTree();
		searchTree.copia(prova);
		
		System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
		System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
		
		System.out.print("first element: "+prova.first());
		System.out.print("last element: "+prova.last());
		System.out.println("height: "+prova.height()+"\n");
	}
	
	public static void testAVLTreeAlpha(String fileName){
		AVLTree avlTree = new AVLTree();
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		long inici = System.nanoTime();
		long timeCPU = th.getCurrentThreadCpuTime();
		
		avlTree.loadFile(fileName);
		
		System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
		System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
		
		System.out.println("first element: "+avlTree.first());
		System.out.println("top element: "+avlTree.top());
		System.out.println("last element: "+avlTree.last());
		System.out.println("height: " +avlTree.height());
	
	}
	
	public static void testAVLTreeNumber(String fileName){
		AVLTree avlTree = new AVLTree();
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		long inici = System.nanoTime();
		long timeCPU = th.getCurrentThreadCpuTime();
		
		avlTree.loadFile(fileName);
		
		AVLTree prova = new AVLTree();
		avlTree.copia(prova);
			
		System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
		System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
		
		System.out.println("first element: "+prova.first());
		System.out.println("top element: "+prova.top());
		System.out.println("last element: "+prova.last());
		System.out.println("height: "+prova.height());
		System.out.println("size: "+prova.size());
		
	}
	
	public static void testAVLTableAlpha(String fileName){
		AVLTable avlTable = new AVLTable();
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		long inici = System.nanoTime();
		long timeCPU = th.getCurrentThreadCpuTime();
		
		avlTable.loadFile(fileName);
		
		System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
		System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
		
		System.out.println("first element: "+avlTable.first());
		System.out.println("last element: "+avlTable.last());
		System.out.println("height: " +avlTable.avgHeight());
		System.out.println("size: "+avlTable.size());
		
	}
	
	public static void testAVLTableNumber(String fileName){
		return;
	}
	
	public static void testSortedListAlpha(String fileName){
		SortedList sList = new SortedList();
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		long inici = System.nanoTime();
		long timeCPU = th.getCurrentThreadCpuTime();
		
		sList.loadFile(fileName);
		
		System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
		System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
		
		System.out.println("first element: "+sList.first());
		System.out.println("last element: "+sList.last());
		System.out.println("size: "+sList.size());
		
	}
	
	public static void testSortedListNumber(String fileName){
		SortedList sList = new SortedList();
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		long inici = System.nanoTime();
		long timeCPU = th.getCurrentThreadCpuTime();
		
		sList.loadFile(fileName);
		
		SortedList aux = new SortedList();
		sList.copia(aux);
		
		System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
		System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
		
		System.out.println("first element: "+aux.first());
		System.out.println("last element: "+aux.last());
		System.out.println("size: "+aux.size());
	}

}
