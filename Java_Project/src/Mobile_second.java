
public class Mobile_second extends Mobile {
	
	
	public Mobile_second() {
		super();
		
		
		setName("GPhone13 standard");
		setPrice(1299.99);
		setWeight(162.77);		
		setSpec("G13X Bionic", "8GB RAM", "OLED 6.1-inch display");
		setColor("Space Gray, Emerald Green, Bad Red, Woody Brown");	
		setStorage("64GB, 256GB, 512GB");
	}
	
	public Mobile_second(String color, String storage, String username, String tel) {
		
		super();
	
		setName("GPhone13 standard");
		setPrice(1299.99);
		setWeight(162.77);		
		setSpec("G13X Bionic", "8GB RAM", "OLED 6.1-inch display");

	
	
		setColor(color);
		setStorage(storage);
		
		setUserName(username);
		setUserNumber(tel);
		
	}

}
