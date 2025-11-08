package games.ropasco;
import java.util.Scanner;

public class RopascoRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		boolean gameStart = false;
		
		System.out.println("Welcome to Ropasco!");
		
		while(!gameStart) {
			System.out.println("(I)nfo, (S)tart\nEnter prompt to begin: ");
			input = sc.nextLine();
			switch (input) {
			case "I":
				System.out.println("INFO DISPLAY");
				break;
			case "O":
				optionsMenu();
				break;
			case "S": 
				gameStart = true;
				break;
			default:
				System.out.println("Please enter a valid input");
			}
		} // while
		System.out.println("DONE");
		sc.close();
	} // main
	
	public static void optionsMenu() {
		System.out.println("OPTIONS TO BE ADDED LATER");
	} // optionsMenu
	
	public static void startGame() {
		System.out.println("Start!");
	} // startGame
} // RopascoRunner
