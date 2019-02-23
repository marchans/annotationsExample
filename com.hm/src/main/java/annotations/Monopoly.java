package annotations;



public class Monopoly implements BoardGame {

	 
	private String name;
	
	public Monopoly() {
		this.name = "Monopoly";
	}
	
	
	@Override
	public String toString() {
		return name;
	}



	public void play() {
	System.out.println("We need more players.");
	}

}
