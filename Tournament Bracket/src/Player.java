
public class Player {
	private int PLAYER_ID;
	private String PLAYER_NAME;
	private int PLAYER_WINS;
	private int PLAYER_LOSSES;
	private int TIME_SINCE_LAST_MATCH;
	
	public Player()
	{
		setID(9999);
		setName("John Doe");
		setWins(9999);
		setLosses(9999);
		setTimeSinceLast(9999);
	}
	
	public Player(int id, String name)
	{
		setID(id);
		setName(name);
		setWins(0);
		setLosses(0);
		setTimeSinceLast(0);
	}

	public int getID() {
		return PLAYER_ID;
	}

	public void setID(int id) {
		PLAYER_ID = id;
	}

	public String getName() {
		return PLAYER_NAME;
	}

	public void setName(String name) {
		PLAYER_NAME = name;
	}

	public int getWins() {
		return PLAYER_WINS;
	}

	public void setWins(int wins) {
		PLAYER_WINS = wins;
	}

	public int getLosses() {
		return PLAYER_LOSSES;
	}

	public void setLosses(int pLAYER_LOSSES) {
		PLAYER_LOSSES = pLAYER_LOSSES;
	}

	public int getTimeSinceLast() {
		return TIME_SINCE_LAST_MATCH;
	}

	public void setTimeSinceLast(int tIME_SINCE_LAST_MATCH) {
		TIME_SINCE_LAST_MATCH = tIME_SINCE_LAST_MATCH;
	}
	
	
}
