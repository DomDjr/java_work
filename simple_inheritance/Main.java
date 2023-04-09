package Inheritance;

public class Main {
	public static void main(String [] args) {
		Running rShoe = new Running(5.0, "Nike", 10);
		System.out.println(rShoe.brand);
		System.out.println(rShoe.size);
		
		Walking wShoe = new Walking(true, "Adidas", 6);
		System.out.println(wShoe.brand);
		System.out.println(wShoe.goreTex);
		
		Walking w2Shoe = new Walking(false, "New Balance", 12);
		System.out.println(w2Shoe.goreTex);
		System.out.println(w2Shoe.brand);
		
		
	}
}
