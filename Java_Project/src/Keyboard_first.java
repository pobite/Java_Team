
public class Keyboard_first extends Keyboard implements Calculate {
	
	public static int total;
	public static int stock = 50;
	
	
	public Keyboard_first() {
		
		super();
		
		setName("G-Keyboard");
		setPrice(59.99);
		setWeight(1100.00);		
		setColor("White");
	}
	
	
	public Keyboard_first (String username, String tel, String address, String email) {
		
		super();
		setName("G-Keyboard");
		setPrice(59.99);
		setWeight(1100.00);		
		setColor("White");
		
		setUserName(username);
		setUserNumber(tel);
		setUserAddress(address);
		setUserEmail(email);
		
		stock--;
	
	}
	public double getSales() {
		
		return getPrice() * total;
	}
	
}
