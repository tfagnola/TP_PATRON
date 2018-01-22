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

public class BebetesAvecNom extends Bebete {

	private Bebete bebete;
	private String nom;

	public BebetesAvecNom(Bebete bebete, String nom) {
		this.bebete = bebete;
		this.nom = nom;

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
		bebete.seDessine(g);

		g.setColor(Color.BLACK);
		g.drawString(nom, (int) bebete.getX(), (int) bebete.getY());

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
