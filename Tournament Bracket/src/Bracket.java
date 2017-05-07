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
	
	public Bracket(ArrayList<Player> playerList, ArrayList<Match> matchList) {
		PLAYER_LIST = playerList;
		generateMatches();
	}
	
	public void getPlayerNames() {
		for(Player p : PLAYER_LIST){
			System.out.println(p.getName());
		}
	}
	
	// TO-DO
	public void generateMatches() {
		Player temp;
		int index;
		// Random sort
		for(int i = 0; i < PLAYER_LIST.size(); i++) {
			index = (int) (Math.random() * PLAYER_LIST.size());
			temp = PLAYER_LIST.get(i);
			PLAYER_LIST.set(i, PLAYER_LIST.get(index));
			PLAYER_LIST.set(index, temp);	
		}
		
		
		index = 0;
		for( int i = 0; i < MATCH_LIST.size(); i++ ){
			MATCH_LIST.get(i).setPlayerOne(PLAYER_LIST.get(index).getID());
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
			if(name.equals( findPlayer( m.getPlayerOne() ).getName()) || name.equals( findPlayer( m.getPlayerOne() ).getName()) )
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
	
}
