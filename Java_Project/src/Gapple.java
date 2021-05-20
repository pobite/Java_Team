interface Bluetooth
{
	public static final int bth = 0;
   public void methodBluetooth();
}

public class Gapple implements Bluetooth{
	public void methodBluetooth()
	   {
		System.out.println("Bluetooth Demo");
	   }
	  
	
	
	public static int total_order = 0;
	public static int stock = 50;	// default stock
		
	private String brand;
	private String name;
	private double price;
	private double weight;
	private String color;
	
	
	/* add new information for storing user's info */ 
	
	private String userName;
	private String userNumber;
	
	

	/* default constructor */ 
	public Gapple() {
		
		brand = "No brand yet";
		name = "No name yet";
		price = 0;
		weight = 0;
		color = "No color yet";
	}
	
	
	
	/* output */
	
	public void writeOutput() {
		
		System.out.println("Brand: " + brand);
		System.out.println("\n"+"Name: " + name);
		System.out.println("\n"+"Price: " + price);
		System.out.println("\n"+"Weight: " + weight);
		System.out.println("\n"+"Color: " + color);
		
			
	}
	
	
	public String toString() {
		
		
		return  "\n" + "user name: " + getUserName() + "\n"+
				"Tel: " + getUserNumber() + "\n============"+ "\n"+
				"Device name: " + getName() + "\n"+
				"color: " + getColor() +"\n"; 
					
	}
			

	
	/* method for subclasses to inherit */
	/* brand is always same, so compare only name and color */
	
	public boolean equls(Gapple otherGapple) {
		
		return this.name.equalsIgnoreCase (otherGapple.name) &&
				this.color.equalsIgnoreCase (otherGapple.color);
					
	}
	
	
	
	/* getter and setter */ 
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String newBrand) {
		brand = newBrand;
	}



	public String getName() {
		return name;
	}



	public void setName(String newName) {
		name = newName;
	}


	public double getPrice() {
		return price;
	}



	public void setPrice(double newPrice) {
		price = newPrice;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double newWeight) {
		weight = newWeight;
	}




	public String getColor() {
		return color;
	}


	public void setColor(String newColor) {
		
		color = newColor;
	}

	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserNumber() {
		return userNumber;
	}



	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	

	
	
}