package logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.ThreadMXBean;
import java.util.Scanner;

import tad.AVLTree;

public class Main {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			Scanner file = new Scanner(new FileReader("the_chautauquan.txt"));
			AVLTree tree = new AVLTree();
			ThreadMXBean th = ManagementFactory.getThreadMXBean();
			long inici = System.nanoTime();
			while(file.hasNext()){
				String line = file.nextLine();
				Scanner scanner = new Scanner(line.replaceAll("[^a-z^A-Z\\s]", "").toLowerCase());
				while(scanner.hasNext()){
					//System.out.println(scanner.next());
					tree.add(new Word(scanner.next()));
				}
				/*
				tree.printInOrder();
				System.out.println(tree.height());
				System.out.println();
				*/
				scanner.close();
			}
			file.close();

			System.out.println("Temps real = " + (System.nanoTime()-inici)/1000000);
			System.out.println("Temps CPU = " + th.getCurrentThreadCpuTime()/1000000);
			System.out.println("\n"+tree.height());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e){
			e.printStackTrace();
		}
		/*
		AVLTree t = new AVLTree();
		t.add(new Word("M"));
		t.add(new Word("F"));
		t.add(new Word("C"));
		t.add(new Word("U"));
		t.add(new Word("V"));
		t.add(new Word("O"));
		t.add(new Word("Y"));
		t.add(new Word("A"));
		t.add(new Word("G"));
		t.add(new Word("P"));
		t.add(new Word("K"));
		t.add(new Word("W"));
		t.add(new Word("B"));
		t.add(new Word("D"));
		t.add(new Word("E"));
		t.add(new Word("H"));
		t.add(new Word("I"));
		t.add(new Word("J"));
		t.add(new Word("L"));
		t.add(new Word("N"));
		t.add(new Word("Z"));
		t.add(new Word("Q"));
		t.add(new Word("R"));
		t.add(new Word("S"));
		t.add(new Word("T"));
		t.add(new Word("X"));
	
		System.out.println("\n\nPreOrder\n--------"); 
		t.printPreOrder();
		System.out.println("\n\nInOrder\n-------"); 
		t.printInOrder();
		System.out.println("\n\nPostOrder\n---------");
		t.printPostOrder();
		System.out.println("\n\nAlçada: "+t.height());
		*/
	}

}
