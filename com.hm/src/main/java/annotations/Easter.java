package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component ("easter")
public class Easter implements Holiday {

	public Easter() {};
	
	private BoardGame game; 
	
	
	public BoardGame getGame() {
		return game;
	}

    @Autowired
    @Qualifier ("alias")
	public void setGame(BoardGame game) {
		this.game = game;
	}


	public void playGames() {
		System.out.println("It is Easter. Let's play "+ game);
		game.play();
	}

}
