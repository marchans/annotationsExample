package autowiring;

public class Easter implements Holiday {

	public Easter() {};
	
	private BoardGame game; 
	
	
	public BoardGame getGame() {
		return game;
	}


	public void setGame(BoardGame game) {
		this.game = game;
	}


	public void playGames() {
		System.out.println("It is Easter. Let's play "+ game);
		game.play();
	}

}
