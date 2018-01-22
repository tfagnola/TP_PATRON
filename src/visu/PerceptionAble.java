package visu;

import java.util.ArrayList;
import java.util.List;

import util.DistancesEtDirections;

/**
 * @author  collet
 */
public abstract class PerceptionAble implements Dirigeable {
	
	public abstract double getChampDeVue();
	
	public abstract int getLongueurDeVue();

	public List<? extends Positionnable> getChosesVues() {
		ArrayList<Positionnable> output = new ArrayList<Positionnable>();
		
		
		for(Positionnable p : getChamp().getPositionnables()) {

			if (p != this) {
				double dirAngle = DistancesEtDirections.directionDepuisUnPoint(p, getX(), getY(), getDirectionCourante());
				if (Math.abs(dirAngle) < (getChampDeVue() / 2)) {
					if (DistancesEtDirections.distanceDepuisUnPoint(p.getX(),p.getY(),getX(),getY()) <= getLongueurDeVue()) {
						output.add(p);
					}
				}
			}
		}
		return output;
	}
	
}
