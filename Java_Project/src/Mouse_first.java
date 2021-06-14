
public class Mouse_first extends Mouse implements Calculate {

	public static int total;
	public static int stock = 50;
	
	public Mouse_first() {
		
		super();
		setName("G-Mouse");
		setPrice(29.99);
		setWeight(85.00);		
		setColor("White");
	}
	
	
	public Mouse_first (String username, String tel, String address, String email) {
		
		super();
		setName("G-Mouse");
		setPrice(29.99);
		setWeight(85.00);		
		setColor("White");
		
		setUserName(username);
		setUserNumber(tel);
		setUserAddress(address);
		
		
		stock--;
	
	}
	
	public double getSales() {
		
		return getPrice() * total;
	}
	
}
