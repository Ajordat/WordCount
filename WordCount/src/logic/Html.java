package logic;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import tad.BinaryTree;
import tad.SortedList;
import tad.Table;

public class Html {
	
	public static void toHtml(long time, BinaryTree tree){
		FileWriter filewriter = null;
		PrintWriter printw = null;
		try {
			filewriter = new FileWriter("paraules.html");
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	    printw = new PrintWriter(filewriter);
	    printw.println("<html>");
	    printw.println("<head><title>Informació recompte</title></head>");     
	    printw.println("<body>");
	    
	    printw.println("<h1 align=center><b><strong>Dades</strong></b></h1>");
	    printw.println("<table border=1 align=center>");
	    printw.println("<tr align=center><td> Temps </td><td> "+time+"ms </td></tr>");
	    printw.println("</table>");
	    
	    printw.println("<h1 align=center><b><strong>Llistat de paraules</strong></b></h1>");
	    printw.println("<table border=1 align=center>");
	    printw.println("<tr align=center><td>Id</td><td>Paraula</td><td>Aparicions</td></tr>");
	    
	    tree.toHtml(printw);
	    
	    printw.println("</table>");
	    printw.println("</body>");
	    printw.println("</head>");
	    printw.println("</html>");
	    printw.close();
	    showHtml();
	}
	
	public static void toHtml(long time, SortedList list){
		FileWriter filewriter = null;
		PrintWriter printw = null;
		try {
			filewriter = new FileWriter("paraules.html");
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	    printw = new PrintWriter(filewriter);
	    printw.println("<html>");
	    printw.println("<head><title>Informació recompte</title></head>");     
	    printw.println("<body>");
	    
	    printw.println("<h1 align=center><b><strong>Dades</strong></b></h1>");
	    printw.println("<table border=1 align=center>");
	    printw.println("<tr align=center><td> Temps </td><td> "+time+"ms </td></tr>");
	    printw.println("</table>");
	    
	    printw.println("<h1 align=center><b><strong>Llistat de paraules</strong></b></h1>");
	    printw.println("<table border=1 align=center>");
	    printw.println("<tr align=center><td>Paraula</td><td>Aparicions</td></tr>");
	    
	    list.goFirst();
	    int id = 1;
	    while(!list.end()){
	    	printw.println("<tr align=center><td>"+id+"</td><td>"+((Word)list.get()).getWord()+"</td><td>"+((Word)list.get()).getValue()+"</td></tr>");
	    	list.next();
	    	id++;
	    }
	    
	    printw.println("</table>");
	    printw.println("</body>");
	    printw.println("</head>");
	    printw.println("</html>");
	    printw.close();
	    showHtml();
	}
	
	public static void toHtml(long time, Table t){
		FileWriter filewriter = null;
		PrintWriter printw = null;
		try {
			filewriter = new FileWriter("paraules.html");
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	    printw = new PrintWriter(filewriter);
	    printw.println("<html>");
	    printw.println("<head><title>Informació recompte</title></head>");     
	    printw.println("<body>");
	    
	    printw.println("<h1 align=center><b><strong>Dades</strong></b></h1>");
	    printw.println("<table border=1 align=center>");
	    printw.println("<tr align=center><td> Temps </td><td> "+time+"ms </td></tr>");
	    printw.println("</table>");
	    
	    printw.println("<h1 align=center><b><strong>Llistat de paraules</strong></b></h1>");
	    printw.println("<table border=1 align=center>");
	    printw.println("<tr align=center><td>Id</td><td>Paraula</td><td>Aparicions</td></tr>");
	    
	    t.toHtml(printw);
	    
	    printw.println("</table>");
	    printw.println("</body>");
	    printw.println("</head>");
	    printw.println("</html>");
	    printw.close();
	    showHtml();
	}
	
	public static void showHtml(){
		String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler paraules.html");
            } else if (osName.startsWith("Mac OS X")) {
                Runtime.getRuntime().exec("open paraules.html");
            } else {
                System.out.println("\t    No es pot obrir el fitxer, obra'l manualment desde la carpeta del projecte");
            }
        } catch (IOException e) {
            System.out.println("\t    Error en obrir el fitxer html");
            e.printStackTrace();
        }
	}
	
}
