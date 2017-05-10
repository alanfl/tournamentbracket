import java.util.ArrayList;
/**
 * Alan Luo
 * Bracket object for tournament fundraiser
 * In short, it contains a list of players and matches.
 * Upon instantiation it generates matches based on Player objects created from input.
 */
public class Bracket {
	private ArrayList<Player> PLAYER_LIST;
	private ArrayList<Match> MATCH_LIST;
	
	public Bracket() {
		PLAYER_LIST = new ArrayList<Player>();
		MATCH_LIST = new ArrayList<Match>();
	}
	
	public Bracket(ArrayList<Player> playerList) {
		PLAYER_LIST = playerList;
		generateMatches();
	}
	
	/**
	 * Prints out all player names as opposed to player toString
	 */
	public void printPlayerNames() {
		for(Player p : PLAYER_LIST){
			System.out.println(p.getName());
		}
	}
	
	/**
	 * TO-DO
	 * 1. Randomize order of PLAYER_LIST. - DONE
	 * 2. Determine total number of matches in bracket (winners and losers combined).
	 * 3. Determine number of matches in first round.
	 * 4. Determine number of byes in first round.
	 */
	public void generateMatches() {
		Player temp;
		int index; // For random sort
		int matches = 0; // Number of total matches
		int byes = 0; // Number of byes in first round
		int n = 0;
		
		// Random sort
		for(int i = 0; i < PLAYER_LIST.size(); i++) {
			index = (int) (Math.random() * PLAYER_LIST.size());
			temp = PLAYER_LIST.get(i);
			PLAYER_LIST.set(i, PLAYER_LIST.get(index));
			PLAYER_LIST.set(index, temp);	
		}
		
		//Determine total matches
		
		
		
		// Determine first round size
	
		
		
		// Fills matches...may not need yet
		index = 0;
		for( int i = 0; i < matches - byes; i++ ){
			MATCH_LIST.get(i).setPlayerOne(PLAYER_LIST.get(index).getID());
			index++;
			MATCH_LIST.get(i).setPlayerTwo(PLAYER_LIST.get(index).getID());
			index++;
		}
		
	}
	
	public Player findPlayer(int ID) {
		for(Player p : PLAYER_LIST) {
			if(p.getID() == ID)
				return p;
		}
		return null;
	}
	
	public Player findPlayer(String name) {
		for(Player p : PLAYER_LIST) {
			if(p.getName().equals(name))
				return p;
		}
		return null;
	}
	
	public Match findMatch(int ID) {
		for(Match m : MATCH_LIST) {
			if(m.getID() == ID)
				return m;
		}
		return null;
	}
	
	public Match findMatch(String name) {
		for(Match m : MATCH_LIST) {
			if(name.equals( findPlayer( m.getPlayerOne() ).getName()) || name.equals( findPlayer( m.getPlayerTwo() ).getName()) )
				return m;
		}
		return null;
	}
	
	public void setWinner(Match m, int ID) {
		if(m.getPlayerOne() == ID || m.getPlayerTwo() == ID) {
			m.setWinner(ID);
		}
		else
			System.out.println("ID not found in match.");
	}
	
	public void printAllMatches() {
		for(Match m : MATCH_LIST) {
			System.out.println(m);
		}
	}
}
