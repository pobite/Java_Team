
public class Earphone_first extends Earphone {
	
	public static int total;
	public static int stoke = 50;
	
	
	public Earphone_first() {
		
		super();
		setName("GPod");
		setPrice(156.75);
		setWeight(35.55);		
		setColor("White");
	}
	
	
	public Earphone_first (String username, String tel) {
		
		super();
		setName("GPod");
		setPrice(156.75);
		setWeight(35.55);		
		setColor("White");
		
		setUserName(username);
		setUserNumber(tel);
		
		stoke--;
	
	}
	
}
