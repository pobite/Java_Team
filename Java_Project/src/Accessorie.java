
public class Accessorie extends Gapple  {
	
	
	private int wireless;
	
	
	public Accessorie() {
		
		super();
		wireless = -1;	// Not decide yet, no:0 / yes:1
		
	}
	
	
	/* getter and setter */ 
	
	public int getWireless() {
		return wireless;
	}

	public void setWireless(int wireless) {
		this.wireless = wireless;
	}
	
	
	public String toString() {
		
		return super.toString() +
				"wireless: \n" + getWireless();
		
	}
	
	
	public boolean equals (Accessorie otherAccessorie) {
		
		return  super.equals(otherAccessorie) &&
				(this.wireless == otherAccessorie.wireless);
	}



	
}
