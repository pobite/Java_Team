
public class Tablet_second extends Tablet implements Calculate {
	
	public static int total;
	public static int stock = 50;
	
	
	public Tablet_second() {
		
		super();
		
		setName("GPad Pro");
		setPrice(2799.99);
		setWeight(647.77);		
		setSpec("Gapple G1 Chip","8GB RAM" ,"OLED 11-inch display");
		setColor("Space Gray, Silver, Woody Brown");
		setStorage("1TB, 2TB");
		
	}
	
	
	public Tablet_second (String color, String storage, String username, String tel, String address, String email) {
		
		super();
	
		setName("GPad Pro");
		setPrice(2799.99);
		setWeight(647.77);		
		setSpec("Gapple G1 Chip","8GB RAM" ,"OLED 11-inch display");
		
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
