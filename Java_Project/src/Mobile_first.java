
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
		//��� ������Ŭ���� name,price,weight,spec �ٽ� ���� ���ʿ� - ���� �Ű����� �޼ҵ��ݸ� �ʿ�
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
