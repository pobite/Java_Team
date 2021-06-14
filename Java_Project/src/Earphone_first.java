
public class Earphone_first extends Earphone implements Calculate {
	
	public static int total;
	public static int stock = 50;
	
	
	public Earphone_first() {
		
		super();
		setName("GPod");
		setPrice(156.75);
		setWeight(35.55);		
		setColor("White");
	}
	
	
	public Earphone_first (String username, String tel, String address, String email) {
		
		super();
		setName("GPod");
		setPrice(156.75);
		setWeight(35.55);		
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
