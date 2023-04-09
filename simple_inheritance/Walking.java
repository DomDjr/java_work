package Inheritance;

public class Walking extends Shoe{
	public final boolean goreTex;
	
	public Walking(boolean newGoreTex, String brand, double size) {
		super(brand, size);
		goreTex = newGoreTex;
	}

}
