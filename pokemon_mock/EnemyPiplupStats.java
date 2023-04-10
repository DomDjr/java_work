package UpdatedPokemonGame;

public class EnemyPiplupStats {
	public static double ResultAttack() {
		String[] piplupAttack = new String[4];
		piplupAttack[0] = "Tackle";
		piplupAttack[1] = "Scratch";
		piplupAttack[2] = "Bubble";
		
		double attackValue = 0;
		
		int index = 0 + (int)(Math.random() * 3);
		if (piplupAttack[index].equals("Tackle")) {
			attackValue =  10;
		}
		else if(piplupAttack[index].equals("Scratch")) {
			attackValue = 10;
		}
		else if(piplupAttack[index].equals("Bubble")) {
			attackValue = 15;
		}
		return attackValue;
	}
}
