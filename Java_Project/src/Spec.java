public class Spec extends Gapple{
	
	
	private String cpu;
	private String ram;
	private String display;
	private String storage;
	
    /* constructor */
	
	// default	
	public Spec() {
		
		super();
		
		cpu = "Not cpu yet";
		ram = "Not ram yet";
		display = "Not display yet";
		storage = "Not storage yet";
		
	}
	
	// with value
	public Spec(String cpu, String ram, String display, String storage)
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
	public String getRam()
	{
		return ram;
	}
	public String getDisplay()
	{
		return display;
	}
	public String getStorage()
	{
		return storage;
	}
	
	
	
	public void setStorage(String storage) {
		this.storage = storage;
	}

	//Mutator
	public void setSpec(String cpu, String ram, String display)
	{
		this.cpu = cpu;
		this.ram = ram;
		this.display = display;
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
				(this.ram.equals(otherSpec.ram)) &&
				(this.display.equals(otherSpec.display)) &&
				(this.storage.equals(otherSpec.storage));
	}
	

	
}
