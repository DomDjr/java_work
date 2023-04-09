package pq;

public class Bigfoot extends Cryptid{
	private int shoeSize;

	@Override
	public void attack() {
		System.out.println(name + " the bigfoot attacks with a " + shoeSize + " shoe size");
		
	}
	
	public Bigfoot(String name, int shoeSize) {
		super(name);
		this.shoeSize = shoeSize;
	}
	
	public String toString() {
		return "The BigFoots name: " + name;
		
	}
	
	
}
