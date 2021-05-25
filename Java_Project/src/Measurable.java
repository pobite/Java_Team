
public interface Measurable {

	
	
	public static int getTotal_mobile() {
		
		return Mobile_first.total + Mobile_second.total + Mobile_third.total;
		
	}
	
	public static int getTotal_laptop() {
		
		return Laptop_first.total + Laptop_second.total;
		
	}
	
	public static int getTotal_tablet() {
		
		return Tablet_first.total + Tablet_second.total;
		
	}
	
	public static int getTotal_acc() {
		
		return Keyboard_first.total + Mouse_first.total + Earphone_first.total + Earphone_second.total;
		
	}

	
	public static int getAll () {
		
		return getTotal_mobile() + getTotal_laptop() + getTotal_tablet() + getTotal_acc();
		
	}
	
	
}
