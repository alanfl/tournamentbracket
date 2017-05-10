import java.util.ArrayList;
import java.util.Scanner;

public class TournamentRunner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Bracket bracket;
		ArrayList<Player> initialPlayerList = new ArrayList<Player>();
		boolean IS_RUNNING = true;
		String newName;
		String option1;
		String option2;
		
		/** Initial loop to add players
		 * Takes names until FINISH is entered and registration closes.
		 * Then instantiates bracket with first round matches from list.
		 */
		while(IS_RUNNING) {
			System.out.print("Enter player's name or FINISH to close registration: ");
			newName = keyboard.nextLine();
			if(newName.equals("FINISH"))
				break;
			initialPlayerList.add(new Player(newName, initialPlayerList.size()));
		}
		bracket = new Bracket(initialPlayerList);
		
		
		/** Main loop - runs commands
		 * 1. Print all matches - DONE
		 * 2. Print all players
		 * 3. Assign winner to a match by ID
		 * 4. Search for player
		 * 5. Search for match
		 */
		while(IS_RUNNING) {
			System.out.println("1 - Print all matches");
			System.out.println("2 - Print all players");
			System.out.println("3 - ");
			System.out.print("Command: ");
			option1 = keyboard.next();
			keyboard.nextLine();
			
			switch(option1) {
				case "1" :
					bracket.printAllMatches();
					
				case "2" :
					for(Player p:initialPlayerList)
						System.out.println(p);
					
				case "3" :
					System.out.print("Match ID: ");
					option1 = keyboard.nextLine();
					keyboard.nextLine();
					if(keyboard.hasNextInt()) {
						Match m = bracket.findMatch(Integer.parseInt(option1));
						System.out.println(m);
						System.out.print("Winner's ID: ");
						option1 = keyboard.next();
						keyboard.nextLine();
						m.setWinner(Integer.parseInt(option1)); // Method already ensures that ID passed is in the match.
					}
					else {
						System.out.println("Invalid input.");
						continue;
					}
					
				default :
					System.out.println("Invalid input.");
					continue;
			}
		}
		
	}
}
