package bebetes;

import java.awt.Color;
import java.util.Random;

import bebetes.Bebete;
import bebetes.BebeteEmergente;
import bebetes.BebeteHasard;
import bebetes.ChampDeBebetes;

public class Mixte implements BebeteFactory {
	public static final double vitesseMax = 10f;
	Random generateur = new Random();
	private ChampDeBebetes param;

	/**
	 * reprise des lignes de code présente de base dans "champdebebetes"
	 * ajout d'un random pour savoir dans le cas de la création de bebetes
	 * hasard ou emergente
	 */
	public Bebete getBebete() {
		int y = (int) (generateur.nextFloat() * param.getHauteur());
		int x = (int) (generateur.nextFloat() * param.getLargeur());
		double direction = (generateur.nextFloat() * 2 * Math.PI);
		double vitesse = Math.max(2, generateur.nextDouble() * vitesseMax);
		int temp = (Math.random() <= 0.5) ? 1 : 2;
		if (temp == 1) {
			return new BebeteHasard(param, x, y, direction, vitesse, Color.magenta.darker());
		} else {
			return new BebeteEmergente(param, x, y, direction, vitesse, Color.ORANGE.brighter());
		}

	}

	
	public void setChampDeBebetes(ChampDeBebetes param) {
		this.param = param;
	}

}
