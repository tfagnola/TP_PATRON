package bebetes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import bebetes.Bebete;
import util.DistancesEtDirections;
import visu.Champ;
import visu.Dirigeable;
import visu.Positionnable;

public class BebetesAvecEcho extends Bebete {

	Color[] colors = { new Color(255, 0, 0), new Color(255, 128, 0), new Color(255, 255, 0) };

	int[] r = { 8, 4 };
	int size = 2;
	int pas = 4;
	int tempoMax = 10;
	int rayonMax = 50;
	int tempo;

	private Bebete bebete;
	private String nom;

	public BebetesAvecEcho(Bebete bebete) {
		this.bebete = bebete;
		pas = Math.max(pas, rayonMax / 20);
		if (pas <= 0)
			pas = 1;
		tempoMax = (pas * 3);
	}

	public Bebete getBebete() {
		return bebete;
	}

	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return bebete.getX();
	}

	@Override
	public void setX(double x) {
		// TODO Auto-generated method stub
		bebete.setX(x);
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return bebete.getY();
	}

	@Override
	public void setY(double y) {
		// TODO Auto-generated method stub
		bebete.setY(y);
	}

	@Override
	public Champ getChamp() {
		// TODO Auto-generated method stub
		return bebete.getChamp();
	}

	@Override
	public double getVitesseCourante() {
		// TODO Auto-generated method stub
		return bebete.getVitesseCourante();
	}

	@Override
	public void setVitesseCourante(double vitesseCourante) {
		// TODO Auto-generated method stub
		bebete.setVitesseCourante(vitesseCourante);
	}

	@Override
	public double getDirectionCourante() {
		// TODO Auto-generated method stub
		return bebete.getDirectionCourante();
	}

	@Override
	public void setDirectionCourante(double directionCourante) {
		// TODO Auto-generated method stub
		bebete.setDirectionCourante(directionCourante);
	}

	@Override
	public Color getCouleur() {
		// TODO Auto-generated method stub
		return bebete.getCouleur();
	}

	@Override
	public void seDessine(Graphics g) {
		int x = (int) bebete.getX();
		int y = (int) bebete.getY();

		Color saved = g.getColor();
		bebete.seDessine(g);

		g.setColor(Color.green);
		tempo = ((tempo + 1) % tempoMax);

		//g.drawString("test", (int) bebete.getX(), (int) bebete.getY());
		for (int i = 0; i < size; i++) {
			g.setColor(colors[i]);
			g.drawOval(x - r[i], y - r[i], r[i] * 2, r[i] * 2);
			if (tempo == 0) {
				r[i] += pas;
				if (r[i] > rayonMax) {
					r[i] = 0;
				}
			}
		}

		g.setColor(saved);
	}

	@Override
	public double getChampDeVue() {
		// TODO Auto-generated method stub
		return bebete.getChampDeVue();
	}

	@Override
	public int getLongueurDeVue() {
		// TODO Auto-generated method stub
		return bebete.getLongueurDeVue();
	}

	@Override
	public void setLongueurDeVue(int lDV) {
		// TODO Auto-generated method stub
		bebete.setLongueurDeVue(lDV);
	}

	@Override
	public void setChampDeVue(double cDV) {
		// TODO Auto-generated method stub
		bebete.setChampDeVue(cDV);
	}

	@Override
	public void calculeDeplacementAFaire() {
		bebete.calculeDeplacementAFaire();

	}

	@Override
	public void effectueDeplacement() {
		bebete.effectueDeplacement();

	}

	@Override
	public boolean equals(Object o) {
		return bebete.equals(o);
	}

}
