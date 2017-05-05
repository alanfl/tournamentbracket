import java.util.ArrayList;

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
			
		}
		
	}
	
	public Player playerByID(int ID) {
		for(Player p : PLAYER_LIST) {
			if(p.getID() == ID)
				return p;
		}
		return null;
	}
	
	public Player playerByName(String name) {
		for(Player p : PLAYER_LIST) {
			if(p.getName().equals(name))
				return p;
		}
		return null;
	}
	
	public Match matchByID(int ID) {
		for(Match m : MATCH_LIST) {
			if(m.getID() == ID)
				return m;
		}
		return null;
	}
	
	public Match matchByName(String name) {
		for(Match m : MATCH_LIST) {
			if(name.equals( playerByID( m.getPlayerOne() ).getName()) || name.equals( playerByID( m.getPlayerOne() ).getName()) )
				return m;
		}
		return null;
	}
	
	
}
