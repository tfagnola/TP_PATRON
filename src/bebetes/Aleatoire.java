package bebetes;

import java.awt.Color;
import java.util.Random;

import bebetes.Bebete;
import bebetes.BebeteHasard;
import bebetes.ChampDeBebetes;

public class Aleatoire implements BebeteFactory {
	
	public static final double vitesseMax = 10f;
	Random generateur = new Random();
	private ChampDeBebetes param;

	
	public Bebete getBebete() {

		int y = (int) (generateur.nextFloat() * param.getHauteur());
		int x = (int) (generateur.nextFloat() * param.getLargeur());
		double direction = (generateur.nextFloat() * 2 * Math.PI);
		double vitesse = Math.max(2, generateur.nextDouble() * vitesseMax);

		return new BebeteHasard(param, x, y, direction, vitesse, Color.blue.brighter());

	}

	public void setChampDeBebetes(ChampDeBebetes param) {
		this.param = param;
	}

}
