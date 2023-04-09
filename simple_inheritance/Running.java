package Inheritance;

public class Running extends Shoe{
	public final double weight;
	
	public Running(double newWeight, String brand, double size) {
		super(brand, size);
		weight = newWeight;
	}
}
