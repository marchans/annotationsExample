package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component ("NewYear")
public class NewYear implements Holiday {

	public NewYear() {};
	
	private BoardGame game; 
	
	
	public BoardGame getGame() {
		return game;
	}

    @Autowired
	public void setGame(BoardGame game) {
		this.game = game;
	}


	public void playGames() {
		System.out.println("It is New Year. Let's play "+ game);
		game.play();
	}

}
