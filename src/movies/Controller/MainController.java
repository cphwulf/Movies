package movies.Controller;

import java.util.Scanner;
import movies.View.MainRunMenuUI;
import movies.View.MovieUI;

public class MainController {
	private static Scanner myScanner;
	
	public static void mainControllerLooop() {
		myScanner  = new Scanner(System.in);
		int choice = 0;
		int exitValue = 9;
		
		while (choice != exitValue){
			//initialiser hovedmenu
			MainRunMenuUI.showMainMenu();
			System.out.println("Indast valg");
			myScanner.nextInt();
			
			switch(choice) {
				case 1:
					MovieUI.viewMovieList(movieList);
					break;
				default:
					System.out.println("");
					choice=9;
					
			}
			
		}
		
	}
}
