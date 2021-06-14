
public class Laptop_second extends Laptop implements Calculate {
	
	public static int total;
	public static int stock = 50;
	
	
	public Laptop_second() {
		
		super();
		
		setName("GacBook Pro");
		setPrice(7700.00);
		setWeight(130.77);		
		setSpec("Gapple G1X Chip","64GB DDR4" ,"OLED 16-inch display");
		setColor("Space Gray, Silver, Sunny Gold");
		setStorage("1TB, 4TB, 8TB");
		
	}
	
	
	public Laptop_second (String color, String storage, String username, String tel, String address, String email) {
		
		super();
	
		
		setName("GacBook Pro");
		setPrice(7700.00);
		setWeight(130.77);		
		setSpec("Gapple G1X Chip","64GB DDR4" ,"OLED 16-inch display");
		
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
