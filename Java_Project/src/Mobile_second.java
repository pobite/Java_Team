
public class Mobile_second extends Mobile implements Calculate {
	
	public static int total;
	public static int stock = 50;
	
	public Mobile_second() {
		super();
		
		
		setName("GPhone13 standard");
		setPrice(1299.99);
		setWeight(162.77);		
		setSpec("G13X Bionic", "8GB RAM", "OLED 6.1-inch display");
		setColor("Space Gray, Emerald Green, Bad Red, Woody Brown");	
		setStorage("64GB, 256GB, 512GB");
	}
	
	public Mobile_second(String color, String storage, String username, String tel, String address, String email) {
		
		super();
	
		setName("GPhone13 standard");
		setPrice(1299.99);
		setWeight(162.77);		
		setSpec("G13X Bionic", "8GB RAM", "OLED 6.1-inch display");

	
	
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
