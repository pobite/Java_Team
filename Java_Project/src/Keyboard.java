
public class Keyboard extends Accessorie {
	
	
	
	public boolean equals (Keyboard otherKeyboard) {
			
			
			return (brand.equalsIgnoreCase(otherKeyboard.brand) &&
					name.equalsIgnoreCase(otherKeyboard.name)&&
					color.equals(otherKeyboard.color)&&
					wireless == otherKeyboard.wireless);
			
			
		}
	
	
	
}
