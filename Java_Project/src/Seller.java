
public class Seller extends Person {

	private int accessKey;

	
	public Seller() {
		super();
	}
	
	
	public Seller(int newKey) {
		
		super();
		accessKey = newKey;
		
		
	}
	
	
	public int getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(int newKey) {
		accessKey = newKey;
	}
	
	public boolean samePw(int newPW) {
		
		return this.accessKey == newPW;
		
		
	}
	
	
	
}
