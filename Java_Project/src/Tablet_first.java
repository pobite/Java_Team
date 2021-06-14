
public class Tablet_first extends Tablet implements Calculate {
	
	public static int total;
	public static int stock = 50;
	
	
	public Tablet_first() {
		
		super();
		
		setName("GPad Air");
		setPrice(1099.99);
		setWeight(457.77);		
		setSpec("G13X Bionic","4GB RAM" ,"OLED 10-inch display");
		setColor("Space Gray, Silver, Woody Brown");
		setStorage("128GB, 256GB");
		
	}
	
	
	public Tablet_first (String color, String storage, String username, String tel, String address, String email) {
		
		super();
	
		
		setName("GPad Air");
		setPrice(1099.99);
		setWeight(457.77);		
		setSpec("G13X Bionic","4GB RAM" ,"OLED 10-inch display");

		
		setColor(color);
		setStorage(storage);
		
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
