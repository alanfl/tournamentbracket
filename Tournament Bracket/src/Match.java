
public class Match {
	private int PLAYER_ONE_ID;
	private int PLAYER_TWO_ID;
	private int MATCH_ID;
	private boolean IS_MATCH_FINISHED;
	private int WINNER; // Is positive if PLAYER_ONE wins, negative if PLAYER_TWO wins.
	private String score;
	
	public Match() {
		setPlayerOne(9999);
		setPlayerTwo(9999);
		setID(9999);
		setWinner(0);
		setScore("99-99");
	}

	public void setPlayerOne(int ID) {
		PLAYER_ONE_ID = ID;
	}
	
	public int getPlayerOne() {
		return PLAYER_ONE_ID;
	}
	
	public void setPlayerTwo(int ID) {
		PLAYER_TWO_ID = ID;
	}
	
	public int getPlayerTwo() {
		return PLAYER_TWO_ID;
	}
	
	public int getID() {
		return MATCH_ID;
	}
	
	public void setID(int ID) {
		MATCH_ID = ID;
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
