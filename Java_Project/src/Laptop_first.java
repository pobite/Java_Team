
public class Laptop_first extends Laptop implements Calculate {
	
	public static int total;
	public static int stock = 50;
	
	public Laptop_first() {
		
		super();
		
		setName("GacBook Air");
		setPrice(2499.99);
		setWeight(130.77);		
		setSpec("Gapple G1 Chip","16GB DDR4" ,"OLED 13.3-inch display");
		setColor("Space Gray, Silver, Sunny Gold");
		setStorage("256GB, 512GB, 1TB, 2TB");
		
	}
	
	
	public Laptop_first (String color, String storage, String username, String tel, String address, String email) {
		
		super();
	
		setName("GacBook Air");
		setPrice(2499.99);
		setWeight(130.77);		
		setSpec("Gapple G1 Chip","16GB DDR4" ,"OLED 13.3-inch display");
		
		setColor(color);
		setStorage(storage);
		
		setUserName(username);
		setUserNumber(tel);
		setUserEmail(email);
		setUserAddress(address);
		
		stock--;
	
	}
	public double getSales() {
		
		return getPrice() * total;
	}
	
}
