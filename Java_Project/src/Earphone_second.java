
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
	
	
	public Earphone_second (String username, String tel, String address, String email) {
		
		super();
		setName("GPod Pro");
		setPrice(320.25);
		setWeight(37.77);		
		setColor("White");
		
		setUserName(username);
		setUserNumber(tel);
		setUserAddress(address);
		setUserEmail(email);
		
		
		stock--;
	}


	@Override
	public double getSales() {
		
		return getPrice() * total;
	}
}
