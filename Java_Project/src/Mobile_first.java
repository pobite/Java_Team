
public class Mobile_first extends Mobile {
	
	
	public static int total;
	public static int stoke = 50;
	
	
	public Mobile_first() {
		
		super();
		
		setName("GPhone13 cutie");
		setPrice(899.99);
		setWeight(130.77);		
		setSpec("G13 Bionic","4GB RAM" ,"LED 4.7-inch display");
		setColor("Space Gray, Emerald Green, Bad Red");
		setStorage("64GB, 256GB");
		
	}
	
	public Mobile_first(String color, String storage, String username, String tel) {
		
		super();
		//모든 최하위클래스 name,price,weight,spec 다시 세팅 불필요 - 오직 매개변수 메소드콜만 필요
		setName("GPhone13 cutie");
		setPrice(899.99);
		setWeight(130.77);		
		setSpec("G13 Bionic","4GB RAM" ,"LED 4.7-inch display");

		
		setColor(color);
		setStorage(storage);
		
		setUserName(username);
		setUserNumber(tel);
		
		stoke--;
	}
	
	
	
	
	
	
	
}
