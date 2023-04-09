package pq;

public class PQDriver {
	public static void main(String [] args) {
		PQ<Yeti> pqy = new PQ<Yeti>();

	    pqy.insert(new Yeti("Yolanda", 22.3));  
	    pqy.insert(new Yeti("Jann", 24.1));
	    pqy.insert(new Yeti("Yacov", 19.7));
	    pqy.insert(new Yeti("Yesenia", 25.8));


	    System.out.println("PQ of Yetis: ");

	    System.out.println("size: " + pqy.size());

	    System.out.println("min: " + pqy.min());


	    while(!pqy.isEmpty())

	      pqy.removeMin().attack();


	   

	    PQ<Cryptid> pqc = new PQ<Cryptid>();

	    pqc.insert(new Yeti("Yolanda", 22.3));
	    pqc.insert(new Yeti("Jann", 24.1));
	    pqc.insert(new Yeti("Yacov", 19.7));
	    pqc.insert(new Yeti("Yesenia", 25.8));
	    pqc.insert(new Bigfoot("Bob", 32));
	    pqc.insert(new Bigfoot("Babette", 33));
	    pqc.insert(new Bigfoot("Brian", 29));
	    pqc.insert(new Bigfoot("Barbara", 30));


	    System.out.println("PQ of Cryptids: ");
	    System.out.println("size: " + pqc.size());
	    System.out.println("min: " + pqc.min());


	    while(!pqc.isEmpty())

	      pqc.removeMin().attack();
	}
}
