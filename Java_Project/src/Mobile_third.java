
public class Mobile_third extends Mobile implements Calculate {

	public static int total;
	public static int stock = 50;
	
	public Mobile_third() {
		
		super();
		
		setName("GPhone13 Maximus");
		setPrice(2599.99);
		setWeight(238.77);		
		setSpec("G14 Bionic","32GB RAM" ,"OLED 6.7-inch display");
		setColor("Space Gray, Emerald Green, Bad Red, Woody Brown, Sunny Gold");
		setStorage("64GB, 256GB, 512GB, 3TB");
		
	}
	
	public Mobile_third(String color, String storage, String username, String tel, String address, String email ) {
		
		super();
		
		setName("GPhone13 Maximus");
		setPrice(2599.99);
		setWeight(238.77);		
		setSpec("G14 Bionic","32GB RAM" ,"OLED 6.7-inch display");


	
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
