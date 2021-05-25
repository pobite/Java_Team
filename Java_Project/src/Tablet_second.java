
public class Tablet_second extends Tablet implements Calculate {
	
	public static int total;
	public static int stoke = 50;
	
	
	public Tablet_second() {
		
		super();
		
		setName("GPad Pro");
		setPrice(2799.99);
		setWeight(647.77);		
		setSpec("Gapple G1 Chip","8GB RAM" ,"OLED 11-inch display");
		setColor("Space Gray, Silver, Woody Brown");
		setStorage("1TB, 2TB");
		
	}
	
	
	public Tablet_second (String color, String storage, String username, String tel) {
		
		super();
	
		setName("GPad Pro");
		setPrice(2799.99);
		setWeight(647.77);		
		setSpec("Gapple G1 Chip","8GB RAM" ,"OLED 11-inch display");
		
		setColor(color);
		setStorage(storage);
		
		setUserName(username);
		setUserNumber(tel);
		
		stoke--;
		
	
	}
	
	public double getSales() {
		
		return getPrice() * total;
	}
	
}
