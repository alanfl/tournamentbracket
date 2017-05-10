/**
 * Alan Luo
 * Match object for use within Bracket.
 * Has two booleans that mark characteristics of the match.
 * These determine whether or not a match is finished and if it's within the winner or loser's bracket.
 * Match objects are never interacted with directly, all modifying goes through Bracket.
 * Player objects are never actually used, instead player IDs are used to reference to players.
 */
public class Match {
	private int PLAYER_ONE_ID;
	private int PLAYER_TWO_ID;
	private int MATCH_ID;
	private boolean IS_MATCH_FINISHED;
	private int WINNER; // Is positive if PLAYER_ONE wins, negative if PLAYER_TWO wins.
	private String SCORE;
	private boolean IS_WINNER;
	
	public Match() {
		setPlayerOne(9999);
		setPlayerTwo(9999);
		setID(9999);
		setWinner(9999);
		setScore("99-99");
	}
	
	public Match(int p1, int p2, int ID) {
		setPlayerOne(p1);
		setPlayerTwo(p2);
		setID(ID);
		setWinner(9999);
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
		return SCORE;
	}

	public void setScore(String s) {
		SCORE = s;
	}

	public boolean isWinnerLoser() {
		return IS_WINNER;
	}

	public void setWinnerLoser(boolean iS_WINNER) {
		IS_WINNER = iS_WINNER;
	}
	
	public String toString() {
		String winner;
		String score;
		if(getWinner() == 9999) {
			winner = "TBD";
			score = "TBD";
		}
		else {
			winner = "" + getWinner();
			score = getScore();
		}

		String formatted = ( "Match ID: " + getID() + "\n"
							+"Player One:" + getPlayerOne() + "\n"
							+"Player Two:" + getPlayerTwo() + "\n"
							+"Winner:" + winner +"\n"
							+"Score:" + score
							);
		return formatted;
	}
}
