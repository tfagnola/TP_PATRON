package bebetes;

import java.awt.Color;
import java.awt.Graphics;

import visu.Champ;

public class BebetesDeco extends Bebete {

	private Bebete bebete;

	public BebetesDeco(Bebete bebete) {
		this.bebete = bebete;
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
	public double getX() {
		return bebete.getX();
	}

	@Override
	public void setX(double x) {
		// TODO Auto-generated method stub
		bebete.setX(x);
	}

	@Override
	public double getY() {
		return bebete.getY();
	}

	@Override
	public void setY(double y) {
		// TODO Auto-generated method stub
		bebete.setY(y);
	}

	@Override
	public Champ getChamp() {
		return bebete.getChamp();
	}

	@Override
	public double getVitesseCourante() {
		return bebete.getVitesseCourante();
	}

	@Override
	public void setVitesseCourante(double vitesseCourante) {
		// TODO Auto-generated method stub
		bebete.setVitesseCourante(vitesseCourante);
	}

	@Override
	public double getDirectionCourante() {
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
		// TODO Auto-generated method stub
		bebete.seDessine(g);
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
	

}
