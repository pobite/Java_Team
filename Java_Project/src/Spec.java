public class Spec extends Gapple{
	
	
	private String cpu;
	private int ram;
	private double display;
	private int storage;
	
    /* constructor */
	
	// default	
	public Spec() {
		
		super();
		
		cpu = "Not cpu yet";
		ram = 0;
		display = 0;
		storage = 0;
		
	}
	
	// with value
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
	
	
	
	public String toString() {
		
		return super.toString() + "cpu: \n" + getCpu() +
				"ram: \n" + getRam() +
				"display: \n" + getDisplay() +
				"storage: \n" + getStorage();		
		
	}
	
	
	public boolean equals (Spec otherSpec) {
		
		return  super.equals(otherSpec) &&
				(this.cpu.equals(otherSpec.cpu)) &&
				(this.ram == otherSpec.ram) &&
				(this.display == otherSpec.display) &&
				(this.storage == otherSpec.storage);
	}
	

	
}
