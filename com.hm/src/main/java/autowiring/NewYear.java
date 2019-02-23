package autowiring;

public class NewYear implements Holiday {

	public NewYear() {};
	
	private BoardGame game; 
	
	
	public BoardGame getGame() {
		return game;
	}


	public void setGame(BoardGame game) {
		this.game = game;
	}


	public void playGames() {
		System.out.println("It is New Year. Let's play "+ game);
		game.play();
	}

}
