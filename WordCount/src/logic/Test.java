package logic;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.ThreadMXBean;

import tad.AVLTable;
import tad.AVLTree;
import tad.SearchTree;
import tad.SortedList;

public class Test {
	
	public static void testSearchTreeAlpha(String fileName){
		SearchTree searchTreeAlpha = new SearchTree();
		
		System.out.println("SEARCH TREE ALPHA");
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		MemoryMXBean tm = ManagementFactory.getMemoryMXBean();
		
		long timeCPU = th.getCurrentThreadCpuTime();
		long memory = tm.getHeapMemoryUsage().getUsed();
		
		searchTreeAlpha.loadFile(fileName);
		
		Html.toHtml((th.getCurrentThreadCpuTime()-timeCPU)/1000000, searchTreeAlpha);
		
		System.out.println("memory used: "+(tm.getHeapMemoryUsage().getUsed()-memory));
			
		System.out.print("first element: "+searchTreeAlpha.first());
		System.out.print("last element: "+searchTreeAlpha.last());
		System.out.println("height: "+searchTreeAlpha.height()+"\n");
	}
	
	public static void testSearchTreeNumber(String fileName){
		SearchTree searchTreeAlpha = new SearchTree();
		
		System.out.println("SEARCH TREE NUMBER");
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		MemoryMXBean tm = ManagementFactory.getMemoryMXBean();
		
		long timeCPU = th.getCurrentThreadCpuTime();
		long memory = tm.getHeapMemoryUsage().getUsed();
		
		searchTreeAlpha.loadFile(fileName);
		SearchTree searchTreeNumber = new SearchTree();
		searchTreeAlpha.copia(searchTreeNumber);
		
		Html.toHtml((th.getCurrentThreadCpuTime()-timeCPU)/1000000, searchTreeNumber);
		
		System.out.println("memory used: "+(tm.getHeapMemoryUsage().getUsed()-memory));
		
		System.out.print("first element: "+searchTreeNumber.first());
		System.out.print("last element: "+searchTreeNumber.last());
		System.out.println("height: "+searchTreeNumber.height()+"\n");
	}
	
	public static void testAVLTreeAlpha(String fileName){
		AVLTree avlTreeAlpha = new AVLTree();
		
		System.out.println("AVL TREE ALPHA");
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		MemoryMXBean tm = ManagementFactory.getMemoryMXBean();
		
		long timeCPU = th.getCurrentThreadCpuTime();
		long memory = tm.getHeapMemoryUsage().getUsed();
		avlTreeAlpha.loadFile(fileName);
		
		Html.toHtml((th.getCurrentThreadCpuTime()-timeCPU)/1000000, avlTreeAlpha);
		
		System.out.println("memory used: "+(tm.getHeapMemoryUsage().getUsed()-memory));
		
		System.out.println("first element: "+avlTreeAlpha.first());
		System.out.println("top element: "+avlTreeAlpha.top());
		System.out.println("last element: "+avlTreeAlpha.last());
		System.out.println("height: " +avlTreeAlpha.height());
	
	}
	
	public static void testAVLTreeNumber(String fileName){
		AVLTree avlTreeAlpha = new AVLTree();
		
		System.out.println("AVL TREE NUMBER");
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		MemoryMXBean tm = ManagementFactory.getMemoryMXBean();

		long timeCPU = th.getCurrentThreadCpuTime();
		long memory = tm.getHeapMemoryUsage().getUsed();
		avlTreeAlpha.loadFile(fileName);
		
		AVLTree avlTreeNumber = new AVLTree();
		avlTreeAlpha.copia(avlTreeNumber);
		
		Html.toHtml((th.getCurrentThreadCpuTime()-timeCPU)/1000000, avlTreeNumber);
		
		System.out.println("memory used: "+(tm.getHeapMemoryUsage().getUsed()-memory));
		
		System.out.println("first element: "+avlTreeNumber.first());
		System.out.println("top element: "+avlTreeNumber.top());
		System.out.println("last element: "+avlTreeNumber.last());
		System.out.println("height: "+avlTreeNumber.height());
		System.out.println("size: "+avlTreeNumber.size());
		
	}
	
	public static void testAVLTableAlpha(String fileName){
		AVLTable avlTableAlpha = new AVLTable();
		
		System.out.println("AVL TABLE ALPHA");
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		MemoryMXBean tm = ManagementFactory.getMemoryMXBean();

		long timeCPU = th.getCurrentThreadCpuTime();
		long memory = tm.getHeapMemoryUsage().getUsed();
		
		avlTableAlpha.loadFile(fileName);
		
		Html.toHtml((th.getCurrentThreadCpuTime()-timeCPU)/1000000, avlTableAlpha);
		
		System.out.println("memory used: "+(tm.getHeapMemoryUsage().getUsed()-memory));
		
		System.out.println("first element: "+avlTableAlpha.first());
		System.out.println("last element: "+avlTableAlpha.last());
		System.out.println("height: " +avlTableAlpha.avgHeight());
		System.out.println("size: "+avlTableAlpha.size());
		
	}
	
	public static void testAVLTableNumber(String fileName){
		AVLTable avlTableAlpha = new AVLTable();
		
		System.out.println("AVL TABLE NUMBER");
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		MemoryMXBean tm = ManagementFactory.getMemoryMXBean();

		long timeCPU = th.getCurrentThreadCpuTime();
		long memory = tm.getHeapMemoryUsage().getUsed();
		avlTableAlpha.loadFile(fileName);
		
		AVLTree avlTableNumber = new AVLTree();
		avlTableAlpha.copia(avlTableNumber);
		
		Html.toHtml((th.getCurrentThreadCpuTime()-timeCPU)/1000000, avlTableNumber);
		
		System.out.println("memory used: "+(tm.getHeapMemoryUsage().getUsed()-memory));
		
		System.out.println("first element: "+avlTableNumber.first());
		System.out.println("top element: "+avlTableNumber.top());
		System.out.println("last element: "+avlTableNumber.last());
		System.out.println("height: "+avlTableNumber.height());
		System.out.println("size: "+avlTableNumber.size());
	}
	
	public static void testSortedListAlpha(String fileName){
		SortedList sListAlpha = new SortedList();
		
		System.out.println("SORTED LIST ALPHA");
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		MemoryMXBean tm = ManagementFactory.getMemoryMXBean();

		long timeCPU = th.getCurrentThreadCpuTime();
		long memory = tm.getHeapMemoryUsage().getUsed();
		sListAlpha.loadFile(fileName);
		
		Html.toHtml((th.getCurrentThreadCpuTime()-timeCPU)/1000000, sListAlpha);
		
		System.out.println("memory used: "+(tm.getHeapMemoryUsage().getUsed()-memory));
		
		System.out.println("first element: "+sListAlpha.first());
		System.out.println("last element: "+sListAlpha.last());
		System.out.println("size: "+sListAlpha.size());
		
	}
	
	public static void testSortedListNumber(String fileName){
		SortedList sListAlpha = new SortedList();
		
		System.out.println("SORTED LIST NUMBER");
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		MemoryMXBean tm = ManagementFactory.getMemoryMXBean();
		
		long timeCPU = th.getCurrentThreadCpuTime();
		long memory = tm.getHeapMemoryUsage().getUsed();
		
		sListAlpha.loadFile(fileName);
		
		SortedList sListNumber = new SortedList();
		sListAlpha.copia(sListNumber);
		
		Html.toHtml((th.getCurrentThreadCpuTime()-timeCPU)/1000000, sListNumber);
		
		System.out.println("memory used: "+(tm.getHeapMemoryUsage().getUsed()-memory));
		
		System.out.println("first element: "+sListNumber.first());
		System.out.println("last element: "+sListNumber.last());
		System.out.println("size: "+sListNumber.size());
	}

}
