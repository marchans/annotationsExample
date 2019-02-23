package annotations;

public class Birthday implements Holiday {

	public Present present; 
	
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
