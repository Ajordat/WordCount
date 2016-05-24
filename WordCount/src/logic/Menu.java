package logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Menu {
	
	/** MAIN MENU CONSTANTS **/
	public static final int SELECT_FILE = 1;
	public static final int CALCULATE_APPEARANCES = 2;
	public static final int VIEW_RESULTS = 3;
	public static final int EXIT = 4;
	
	/** CALCULATE_APPEARANCES MENU CONSTANTS **/
	public static final int SEARCH_TREE = 1;
	public static final int AVL_TREE = 2;
	public static final int AVL_TABLE = 3;
	public static final int SORTED_LIST = 4;
	
	/** VIEW_RESULTS MENU CONSTANTS **/
	public static final int NUMBER_OF_APPEARANCES = 1;
	public static final int APHABETICALLY = 2;
	
	public void printMain(){
		System.out.println("------- Word Counter -------");
		System.out.println("1. Select file");
		System.out.println("2. Calculate appearances");
		System.out.println("3. View results");
		System.out.println("4. Exit");
		System.out.println("----------------------------");
	}
	
	public void printCalculateAppearances(){
		System.out.println("------- Calculate appearances -------");
		System.out.println("1. Search Tree");
		System.out.println("2. AVL Tree");
		System.out.println("3. AVL Table");
		System.out.println("4. Sorted List");
		System.out.println("-------------------------------------");
	}
	
	public void printViewResults(){
		System.out.println("------- View results -------");
		System.out.println("1. Sort by number of appearances");
		System.out.println("2. Sort alphabetically");
		System.out.println("----------------------------");
	}
	
	public int getOption(){
		@SuppressWarnings("resource")
		Scanner scr = new Scanner(System.in);
		System.out.print("Option: ");
		int option;
		try{
			option = scr.nextInt();
		} catch(Exception e){
			return 0;
		}
		return option;
	}
	
	public String getFile(){
		@SuppressWarnings("resource")
		Scanner scr = new Scanner(System.in);
		System.out.print("File: ");
		String fileName = scr.nextLine();
		Scanner file;
		try {
			file = new Scanner(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			return "";
		}
		file.close();
		return fileName;
	}
	
	public void testSearchTree(int option, String fileName){
		
		switch(option){
			case Menu.NUMBER_OF_APPEARANCES:
				Test.testSearchTreeNumber(fileName);
				break;
			case Menu.APHABETICALLY:
				Test.testSearchTreeAlpha(fileName);
				break;
		}
		
	}
	
	public void testAVLTree(int option, String fileName){
		
		switch(option){
			case Menu.NUMBER_OF_APPEARANCES:
				Test.testAVLTreeNumber(fileName);
				break;
			case Menu.APHABETICALLY:
				Test.testAVLTreeAlpha(fileName);
				break;
		}
		
	}
	
	public void testAVLTable(int option, String fileName){
		switch(option){
			case Menu.NUMBER_OF_APPEARANCES:
				Test.testAVLTableNumber(fileName);
				break;
			case Menu.APHABETICALLY:
				Test.testAVLTableAlpha(fileName);
				break;
		}
	}
	
	public void testSortedList(int option, String fileName){
		switch(option){
			case Menu.NUMBER_OF_APPEARANCES:
				Test.testSortedListNumber(fileName);
				break;
			case Menu.APHABETICALLY:
				Test.testSortedListAlpha(fileName);
				break;
		}
	}
	
}
