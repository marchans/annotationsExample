package autowiring;

public class SuperFarm implements BoardGame {

	private String name;
	
	public SuperFarm() {
		this.name = "Super Farm";
	}
	
	
	@Override
	public String toString() {
		return name;
	}



	public void play() {
	System.out.println("The winner is the one who has more animals.");
	}

}
