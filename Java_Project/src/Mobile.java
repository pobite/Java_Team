public class Mobile extends Spec
{
	
	
	public Mobile() {
		
		super();
		
	}
	
	/* �ɼǿ� ���� ������ */
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
