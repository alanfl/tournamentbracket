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
		MATCH_LIST = matchList;
	}
	
	public void getPlayerNames() {
		for(Player p : PLAYER_LIST){
			System.out.println(p.getName());
		}
	}
}
