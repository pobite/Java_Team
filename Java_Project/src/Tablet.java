public class Tablet extends Spec
{	
	

	public Tablet() {
	
		super();
		total_order++;
		stock--;
		
	}
	
	public String toString() {
		
		return super.toString();
		
	}
	
	
	public Tablet(String newColor, String newStorage) {
		
		super();
		setColor(newColor);
		setStorage(newStorage);
		
		
	}
	
	public boolean eauqls(Tablet otherTablet)
	{
		return super.equals(otherTablet);
	}
}
