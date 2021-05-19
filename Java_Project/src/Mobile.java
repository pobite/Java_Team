public class Mobile extends Spec
{
	
	
	
	public Mobile() {
		
		super();
		total_order++;
		stock--;
	}
	
	
	public Mobile(String newColor, String newStorage) {
		
		super();
		setColor(newColor);
		setStorage(newStorage);
		total_order++;
		stock--;
	}
	

	public String toString() {
		
		return super.toString();
		
	}
	
	public boolean eauqls(Mobile otherMobile)
	{
		return super.equals(otherMobile);
	}
}
