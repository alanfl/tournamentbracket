
public class Match {
	private Player PLAYER_ONE;
	private Player PLAYER_TWO;
	private int MATCH_ID;
	private boolean IS_MATCH_FINISHED;
	private int WINNER; // Is positive if PLAYER_ONE wins, negative if PLAYER_TWO wins.
	private String score;
	
	public Match() {
		setPlayerOne(new Player());
		setPlayerTwo(new Player());
		setID(9999);
		setWinner(0);
		setScore("99-99");
	}

	public void setPlayerOne(Player player) {
		PLAYER_ONE = player;
	}
	
	public Player getPlayerOne() {
		return PLAYER_ONE;
	}
	
	public void setPlayerTwo(Player player) {
		PLAYER_TWO = player;
	}
	
	public Player getPlayerTwo() {
		return PLAYER_TWO;
	}
	
	public int getID() {
		return MATCH_ID;
	}
	
	public void setID(int id) {
		MATCH_ID = id;
	}
	
	public boolean getProgress() {
		return IS_MATCH_FINISHED;
	}
	
	public void setProgress(boolean status) {
		IS_MATCH_FINISHED = status;
	}

	public int getWinner() {
		return WINNER;
	}

	public void setWinner(int w) {
		WINNER = w;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String s) {
		score = s;
	}
}
