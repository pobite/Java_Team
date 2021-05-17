public class Tablet extends Spec
{	
	
	public static int tablet_num; 
	
	public Tablet() {
	
		super();
		tablet_num++;
		
	}
	
	public String toString() {
		
		return super.toString();
		
	}
	
	
	public boolean eauqls(Tablet otherTablet)
	{
		return super.equals(otherTablet);
	}
}
