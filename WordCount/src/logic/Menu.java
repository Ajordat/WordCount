package logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Menu {
	public static final int SELECT_FILE = 1;
	public static final int CALCULATE_APPEARANCES = 2;
	public static final int VIEW_RESULTS = 3;
	public static final int EXIT = 4;
	
	public static void printMain(){
		System.out.println("------- Word Counter -------");
		System.out.println("1. Select file");
		System.out.println("2. Calculate appearances");
		System.out.println("3. View results");
		System.out.println("4. Exit");
		System.out.println("----------------------------");
	}
	
	public static void printCalculateAppearances(){
		System.out.println("------- Calculate appearances -------");
		System.out.println("1. Search tree");
		System.out.println("2. AVL tree");
		//System.out.println("3. ");
		//System.out.println("4. ");
		System.out.println("------------------------------------");
	}
	
	public static void printViewResults(){
		System.out.println("------- View results -------");
		System.out.println("1. Sort by number of appearances");
		System.out.println("2. Sort alphabetically");
		System.out.println("----------------------------");
	}
	
	public static int getOption(){
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
	
	public static String getFile(){
		@SuppressWarnings("resource")
		Scanner scr = new Scanner(System.in);
		System.out.print("File: ");
		String file = scr.nextLine();
		try {
			Scanner file1 = new Scanner(new FileReader(file));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			return "";
		}
		return file;
	}
	
}
