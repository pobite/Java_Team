
public class Person {
	
	
	
	private String name;
	private String email;
	private int number;
	
	
	public Person() {
		
		name = "Not name yet";
		email = "Not email yet";
		number = 0;
		
		
	}
	
	
	/* getter and setter */
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String newEmail) {
		email = newEmail;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int newnumber) {
		number = newnumber;
	}
	
	
	
	
}
