
public class Earphone_second extends Earphone implements Calculate {
	
	public static int total;
	public static int stock = 50;
	
	
	public Earphone_second() {
		
		super();
		setName("GPod Pro");
		setPrice(320.25);
		setWeight(37.77);		
		setColor("White");
	}
	
	
	public Earphone_second (String username, String tel) {
		
		super();
		setName("GPod Pro");
		setPrice(320.25);
		setWeight(37.77);		
		setColor("White");
		
		setUserName(username);
		setUserNumber(tel);
		
		
		stock--;
	}


	@Override
	public double getSales() {
		
		return getPrice() * total;
	}
}
