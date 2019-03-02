package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Birthday implements Holiday {

	public Present present; 
	
	@Autowired
	public Birthday(Present present) {
		this.present = present; 
	}
	
	
	public Present getPresent() {
		return present;
	}

    
	public void setPresent(Present present) {
		this.present = present;
	}


	public void playGames() {
		System.out.println("It is the Birthday party. No games. Only pizza and presents: "+ present);
	}

}
