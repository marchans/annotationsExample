package autowiring;

public class MobilePhone implements Present {

	public MobilePhone() {};
	
	
	@Override
	public String toString() {
		return "MobilePhone";
	}


	public void show() {
	System.out.println("It is a new phone.");
	}

}
