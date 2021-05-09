
public class Earphone extends Accessorie {
	
	
	public boolean equals (Earphone otherEarphone) {
		
		
		return (brand.equalsIgnoreCase(otherEarPhone.brand) &&
				name.equalsIgnoreCase(otherEarphone.name)&&
				color.equals(otherEarphone.color)
				wireless == otherEarphone.wireless);
		
		
	}
	
	
}
