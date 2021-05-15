public class Spec extends Gapple{
	private String cpu;
	private int ram;
	private double display;
	private int storage;
	
  //constructor
	public Spec(String cpu, int ram, double display, int storage)
	{
		super();	
		this.cpu = cpu;
		this.ram = ram;
		this.display = display;
		this.storage = storage;
	}
	
	
	//Accessors
	public String getCpu()
	{
		return cpu;
	}
	public int getRam()
	{
		return ram;
	}
	public double getDisplay()
	{
		return display;
	}
	public int getStorage()
	{
		return storage;
	}
	
	//Mutator
	public void setSpec(String cpu, int ram, double display, int storage)
	{
		this.cpu = cpu;
		this.ram = ram;
		this.display = display;
		this.storage = storage;
	}
	
	public boolean equals (Spec otherSpec) {
		return  (brand.equalsIgnoreCase(otherSpec.brand)) &&
				(name.equalsIgnoreCase(otherSpec.name)) &&
				(price == otherSpec.price) &&
				(weight == otherSpec.weight) &&
				(color.equals(otherSpec.color)) &&
				(this.cpu.equals(otherSpec.cpu)) &&
				(this.ram == otherSpec.ram) &&
				(this.display == otherSpec.display) &&
				(this.storage == otherSpec.storage);
	}
	
}
