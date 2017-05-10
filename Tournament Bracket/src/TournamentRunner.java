import java.util.ArrayList;
import java.util.Scanner;

public class TournamentRunner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Bracket bracket;
		ArrayList<Player> initialPlayerList = new ArrayList<Player>();
		boolean IS_RUNNING = true;
		String newName;
		String option;
		
		// Initial loop to add players
		while(IS_RUNNING) {
			System.out.print("Enter player's name or FINISH to close registration: ");
			newName = keyboard.nextLine();
			if(newName.equals("FINISH"))
				break;
			initialPlayerList.add(new Player(newName, initialPlayerList.size()));
		}
		
		bracket = new Bracket(initialPlayerList);
		
		// Main loop - runs commands
		while(IS_RUNNING) {
			System.out.println("1 - Print all matches");
			System.out.println("2 - Print all players");
			System.out.println("3 - ");
			System.out.print("Command: ");
			option = keyboard.next();
			keyboard.nextLine();
			
			switch(option) {
				case "1" :
					bracket.printAllMatches();
				case "2" :
			}
		}
		
	
		
		
		
		/*NUM_MATCHES = 
		
		for(int i = 0; i < NUM_MATCHES; i++)
		
		bracket = new Bracket(initialPlayerList, initialMatchList)
		*/
	}
}
