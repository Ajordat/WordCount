package logic;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

import tad.AVLTable;
import tad.AVLTree;
import tad.SearchTree;
import tad.SortedList;

public class Test {
	
	public static void testSearchTreeAlpha(String fileName){
		SearchTree searchTreeAlpha = new SearchTree();
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		long inici = System.nanoTime();
		long timeCPU = th.getCurrentThreadCpuTime();
		
		searchTreeAlpha.loadFile(fileName);
		
		System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
		System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
		
		System.out.print("first element: "+searchTreeAlpha.first());
		System.out.print("last element: "+searchTreeAlpha.last());
		System.out.println("height: "+searchTreeAlpha.height()+"\n");
	}
	
	public static void testSearchTreeNumber(String fileName){
		SearchTree searchTreeAlpha = new SearchTree();
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		long inici = System.nanoTime();
		long timeCPU = th.getCurrentThreadCpuTime();
		
		searchTreeAlpha.loadFile(fileName);
		SearchTree searchTreeNumber = new SearchTree();
		searchTreeAlpha.copia(searchTreeNumber);
		
		System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
		System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
		
		System.out.print("first element: "+searchTreeNumber.first());
		System.out.print("last element: "+searchTreeNumber.last());
		System.out.println("height: "+searchTreeNumber.height()+"\n");
	}
	
	public static void testAVLTreeAlpha(String fileName){
		AVLTree avlTreeAlpha = new AVLTree();
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		long inici = System.nanoTime();
		long timeCPU = th.getCurrentThreadCpuTime();
		
		avlTreeAlpha.loadFile(fileName);
		
		System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
		System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
		
		System.out.println("first element: "+avlTreeAlpha.first());
		System.out.println("top element: "+avlTreeAlpha.top());
		System.out.println("last element: "+avlTreeAlpha.last());
		System.out.println("height: " +avlTreeAlpha.height());
	
	}
	
	public static void testAVLTreeNumber(String fileName){
		AVLTree avlTreeAlpha = new AVLTree();
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		long inici = System.nanoTime();
		long timeCPU = th.getCurrentThreadCpuTime();
		
		avlTreeAlpha.loadFile(fileName);
		
		AVLTree avlTreeNumber = new AVLTree();
		avlTreeAlpha.copia(avlTreeNumber);
			
		System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
		System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
		
		System.out.println("first element: "+avlTreeNumber.first());
		System.out.println("top element: "+avlTreeNumber.top());
		System.out.println("last element: "+avlTreeNumber.last());
		System.out.println("height: "+avlTreeNumber.height());
		System.out.println("size: "+avlTreeNumber.size());
		
	}
	
	public static void testAVLTableAlpha(String fileName){
		AVLTable avlTableAlpha = new AVLTable();
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		long inici = System.nanoTime();
		long timeCPU = th.getCurrentThreadCpuTime();
		
		avlTableAlpha.loadFile(fileName);
		
		System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
		System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
		
		System.out.println("first element: "+avlTableAlpha.first());
		System.out.println("last element: "+avlTableAlpha.last());
		System.out.println("height: " +avlTableAlpha.avgHeight());
		System.out.println("size: "+avlTableAlpha.size());
		
	}
	
	public static void testAVLTableNumber(String fileName){
		AVLTable avlTableAlpha = new AVLTable();
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		long inici = System.nanoTime();
		long timeCPU = th.getCurrentThreadCpuTime();
		
		avlTableAlpha.loadFile(fileName);
		
		AVLTree avlTableNumber = new AVLTree();
		avlTableAlpha.copia(avlTableNumber);
		
		System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
		System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
		
		System.out.println("first element: "+avlTableNumber.first());
		System.out.println("top element: "+avlTableNumber.top());
		System.out.println("last element: "+avlTableNumber.last());
		System.out.println("height: "+avlTableNumber.height());
		System.out.println("size: "+avlTableNumber.size());
	}
	
	public static void testSortedListAlpha(String fileName){
		SortedList sListAlpha = new SortedList();
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		long inici = System.nanoTime();
		long timeCPU = th.getCurrentThreadCpuTime();
		
		sListAlpha.loadFile(fileName);
		
		System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
		System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
		
		System.out.println("first element: "+sListAlpha.first());
		System.out.println("last element: "+sListAlpha.last());
		System.out.println("size: "+sListAlpha.size());
		
	}
	
	public static void testSortedListNumber(String fileName){
		SortedList sListAlpha = new SortedList();
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		long inici = System.nanoTime();
		long timeCPU = th.getCurrentThreadCpuTime();
		
		sListAlpha.loadFile(fileName);
		
		SortedList sListNumber = new SortedList();
		sListAlpha.copia(sListNumber);
		
		System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
		System.out.println("Temps CPU = " + (th.getCurrentThreadCpuTime()-timeCPU)/1000000);
		
		System.out.println("first element: "+sListNumber.first());
		System.out.println("last element: "+sListNumber.last());
		System.out.println("size: "+sListNumber.size());
	}

}
