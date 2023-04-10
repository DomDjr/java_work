package UpdatedPokemonGame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TurtwigStats {
	public static double ResultAttack(String chosenAttack) {
		double dmg = 0;
		double health = 0;
		if (chosenAttack.equals("TACKLE")) {
			System.out.println("hi");
			dmg = .15;
		}
		else if (chosenAttack.equals("RAZOR LEAF")) {
			dmg = .25;
		}
		else if (chosenAttack.equals("POTION")) {
			health = .25;
			return health;
		}
		else if (chosenAttack.equals("SCRATCH")) {
			dmg = .15;
		}
		return dmg;
		
	}
}
