public class Spec extends Gapple{
	
	
	private String cpu;
	private String ram;
	private String display;

	
    /* constructor */
	
	// default	
	public Spec() {
		
		super();
		
		cpu = "Not cpu yet";
		ram = "Not ram yet";
		display = "Not display yet";

		
	}
	
	// with value
	public Spec(String cpu, String ram, String display, String storage)
	{
		super();	
		this.cpu = cpu;
		this.ram = ram;
		this.display = display;
	
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

	//Mutator
	public void setSpec(String cpu, String ram, String display)
	{
		this.cpu = cpu;
		this.ram = ram;
		this.display = display;
	}
	
	
	
	public String toString() {
		
		return super.toString() + "cpu: " + getCpu() + "\n" +
				"ram: " + getRam() + "\n" +
				"display: " + getDisplay() + "\n" +
				"storage: " + getStorage() + "\n";		
		
	}
	
	
	public boolean equals (Spec otherSpec) {
		
		return  super.equals(otherSpec) &&
				(this.cpu.equals(otherSpec.cpu)) &&
				(this.ram.equals(otherSpec.ram)) &&
				(this.display.equals(otherSpec.display));
	}
	

	
}
