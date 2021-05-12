
public class Gapple {

		
	private String brand;
	private String name;
	private double price;
	private double weight;
	private String color;
	
	
	
	public Gapple() {
		
		brand = "No brand yet";
		name = "No name yet";
		price = 0;
		weight = 0;
		color = "No color yet";
	}
	
	
	
	
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


	public void writeOutput() {
		
		System.out.println("Brand: " + brand);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Weight: " + weight);
		System.out.println("Color: " + color);
		
			
	}
	
			


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
