package autowiring;

public class Pony implements Present {

	public Pony() {};
	
	
	@Override
	public String toString() {
		return "Pony";
	}


	public void show() {
	System.out.println("It is a pony!!!!");
	}

}
