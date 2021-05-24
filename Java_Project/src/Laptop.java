public class Laptop extends Spec
{
	
	
	public Laptop() {
		
		super();

	}
	
	public String toString() {
		
		return super.toString();
		
	}
	
	public Laptop(String newColor, String newStorage) {
		
		super();
		setColor(newColor);
		setStorage(newStorage);

	}
	
	public boolean eauqls(Laptop otherLaptop)
	{
		return super.equals(otherLaptop);
	}
}
