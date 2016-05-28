package logic;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

import tad.AVLTable;
import tad.AVLTree;
import tad.Memory;
import tad.SearchTree;
import tad.SortedList;

public class Test {
	
	protected static final int EMPTY = 0;
	protected static final int SAMPLE = 5;
	
	public static void testSearchTreeAlpha(String fileName){
		SearchTree searchTreeAlpha = new SearchTree();
		
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		
		long timeCPU = th.getCurrentThreadCpuTime();
		searchTreeAlpha.loadFile(fileName);
	
		Html.toHtml(EMPTY, (th.getCurrentThreadCpuTime()-timeCPU)/1000000, searchTreeAlpha);
		
	}
	
	public static void testSearchTreeNumber(String fileName){
			SearchTree searchTreeAlpha = new SearchTree();
			
			ThreadMXBean th = ManagementFactory.getThreadMXBean();
			
			long timeCPU = th.getCurrentThreadCpuTime();
			
			searchTreeAlpha.loadFile(fileName);
			SearchTree searchTreeNumber = new SearchTree();
			searchTreeAlpha.copia(searchTreeNumber);
			
			Html.toHtml(Memory.get(searchTreeAlpha), (th.getCurrentThreadCpuTime()-timeCPU)/1000000, searchTreeNumber);

	}
	
	public static void testAVLTreeAlpha(String fileName){
			AVLTree avlTreeAlpha = new AVLTree();
			
			ThreadMXBean th = ManagementFactory.getThreadMXBean();
			
			long timeCPU = th.getCurrentThreadCpuTime();
			avlTreeAlpha.loadFile(fileName);

			Html.toHtml(EMPTY, (th.getCurrentThreadCpuTime()-timeCPU)/1000000, avlTreeAlpha);
	
	}
	
	public static void testAVLTreeNumber(String fileName){
			AVLTree avlTreeAlpha = new AVLTree();
			
			ThreadMXBean th = ManagementFactory.getThreadMXBean();
	
			long timeCPU = th.getCurrentThreadCpuTime();
			avlTreeAlpha.loadFile(fileName);
			
			AVLTree avlTreeNumber = new AVLTree();
			avlTreeAlpha.copia(avlTreeNumber);
			
			Html.toHtml(Memory.get(avlTreeAlpha), (th.getCurrentThreadCpuTime()-timeCPU)/1000000, avlTreeNumber);
			
	}
	
	public static void testAVLTableAlpha(String fileName){
			AVLTable avlTableAlpha = new AVLTable();
			
			ThreadMXBean th = ManagementFactory.getThreadMXBean();
	
			long timeCPU = th.getCurrentThreadCpuTime();
			
			avlTableAlpha.loadFile(fileName);

			Html.toHtml(EMPTY, (th.getCurrentThreadCpuTime()-timeCPU)/1000000, avlTableAlpha);
			
	}
	
	public static void testAVLTableNumber(String fileName){
			AVLTable avlTableAlpha = new AVLTable();
			
			ThreadMXBean th = ManagementFactory.getThreadMXBean();
	
			long timeCPU = th.getCurrentThreadCpuTime();
			avlTableAlpha.loadFile(fileName);
			
			AVLTree avlTableNumber = new AVLTree();
			avlTableAlpha.copia(avlTableNumber);
			
			Html.toHtml(Memory.get(avlTableAlpha), (th.getCurrentThreadCpuTime()-timeCPU)/1000000, avlTableNumber);

	}
	
	public static void testSortedListAlpha(String fileName){
			SortedList sListAlpha = new SortedList();
			
			ThreadMXBean th = ManagementFactory.getThreadMXBean();
	
			long timeCPU = th.getCurrentThreadCpuTime();
			sListAlpha.loadFile(fileName);

			Html.toHtml(EMPTY, (th.getCurrentThreadCpuTime()-timeCPU)/1000000, sListAlpha);
			
	}
	
	public static void testSortedListNumber(String fileName){
			SortedList sListAlpha = new SortedList();
			
			ThreadMXBean th = ManagementFactory.getThreadMXBean();
			
			long timeCPU = th.getCurrentThreadCpuTime();
			
			sListAlpha.loadFile(fileName);
			
			SortedList sListNumber = new SortedList();
			sListAlpha.copia(sListNumber);
			
			
			timeCPU = (th.getCurrentThreadCpuTime()-timeCPU)/1000000;
			
			Html.toHtml(Memory.get(sListAlpha), timeCPU, sListNumber);
			
	}

}
