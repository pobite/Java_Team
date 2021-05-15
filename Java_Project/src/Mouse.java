
public class Mouse extends Accessorie {
	
	
	
	public boolean equals (Mouse otherMouse) {
			
			
			return (brand.equalsIgnoreCase(otherMouse.brand) &&
					name.equalsIgnoreCase(otherMouse.name)&&
					color.equals(otherMouse.color)&&
					wireless == otherMouse.wireless);
			
			
		}
		
	
}
