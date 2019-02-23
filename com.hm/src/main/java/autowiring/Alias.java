package autowiring;

public class Alias implements BoardGame {

	private String name;
	
	public Alias() {
		this.name = "Alias";
	}
	
	
	@Override
	public String toString() {
		return name;
	}



	public void play() {
	System.out.println("Let's talk more!!!");
	}

}
