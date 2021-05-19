public class Laptop extends Spec
{
	
	
	public Laptop() {
		
		super();
		total_order++;	
		stock--;
	}
	
	public String toString() {
		
		return super.toString();
		
	}
	
	public Laptop(String newColor, String newStorage) {
		
		super();
		setColor(newColor);
		setStorage(newStorage);
		total_order++;	
		stock--;
	}
	
	public boolean eauqls(Laptop otherLaptop)
	{
		return super.equals(otherLaptop);
	}
}
