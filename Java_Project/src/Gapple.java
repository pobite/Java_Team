
public class Gapple {
	
	
	
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
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Weight: " + weight);
		System.out.println("Color: " + color);
		
			
	}
	
	
	public String toString() {
		
		
		return  "name: \n" + getName() +
				"user name: \n" + getUserName() +
				"Tel: \n" + getUserNumber() +
				"color: \n" + getColor();
					
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
