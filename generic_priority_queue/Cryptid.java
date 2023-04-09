package pq;

public abstract class Cryptid implements Comparable<Cryptid>{

	
	protected String name;
	
	public abstract void attack();
	
	
	
 	@Override
	public int compareTo(Cryptid newName) {
		// TODO Auto-generated method stub
		return this.name.compareTo(newName.name);
	}
 	
 	public Cryptid (String name) {
 		this.name = name;
 	}

}
