public class Mobile extends Spec
{
	
	
	public Mobile() {
		
		super();
		
	}
	
	/* 옵션에 대한 생성자 */
	public Mobile(String newColor, int newStorage) {
		
		super();
		setColor(newColor);
		setStorage(newStorage);
		
		
	}
	
	public String toString() {
		
		return super.toString();
		
	}
	
	public boolean eauqls(Mobile otherMobile)
	{
		return super.equals(otherMobile);
	}
}
