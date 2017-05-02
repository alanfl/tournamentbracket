import java.util.ArrayList;
import java.util.Scanner;

public class TournamentRunner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Bracket bracket;
		ArrayList<Match> intialMatchList = new ArrayList<Match>();
		ArrayList<Player> initialPlayerList = new ArrayList<Player>();
		boolean IS_ADDING_NEW_PLAYERS = true;
		
		String newName;
		while(IS_ADDING_NEW_PLAYERS) {
			System.out.print("Enter player's name or FINISH to close registration: ");
			newName = keyboard.nextLine();
			if(newName.equals("FINISH"))
				IS_ADDING_NEW_PLAYERS = false;
			initialPlayerList.add(new Player(newName, initialPlayerList.size()));
		}
		
		/*NUM_MATCHES = 
		
		for(int i = 0; i < NUM_MATCHES; i++)
		
		bracket = new Bracket(initialPlayerList, initialMatchList)
		*/
	}
}
