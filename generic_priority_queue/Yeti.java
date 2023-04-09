package pq;

public class Yeti extends Cryptid {

    private double fangLength;

    public Yeti(String name, double fangLength) {
        super(name);
        this.fangLength = fangLength;
    }

    @Override
    public void attack() {
        System.out.println(this.name + " the Yeti attacks with their " + this.fangLength + " cm fangs!");
    }

 
    public String toString() {
        return this.name + " (Yeti)";
    }
}
