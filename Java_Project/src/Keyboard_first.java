
public class Keyboard_first extends Keyboard {
	
	public Keyboard_first() {
		
		super();
		
		setName("G-Keyboard");
		setPrice(59.99);
		setWeight(1100.00);		
		setColor("White");
	}
	
	
	public Keyboard_first (String username, String tel) {
		
		super();
		setName("G-Keyboard");
		setPrice(59.99);
		setWeight(1100.00);		
		setColor("White");
		
		setUserName(username);
		setUserNumber(tel);
		
	
	}
	
}