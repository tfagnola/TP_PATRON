/**
 * 
 */
package visu;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

/**
 * @author  collet
 */
public class Visualisateur extends JPanel implements Champ  {
	private static final long serialVersionUID = 5445641169751870919L;

	protected List<? extends Dessinable> dessinables;
	protected int largeur;
	protected int hauteur;

	public Visualisateur(int largeur, int hauteur, List<? extends Dessinable> ld) {
		this.largeur = largeur;
		this.hauteur = hauteur;
		dessinables = ld;
	}

	public Visualisateur(int largeur, int hauteur) {
		this(largeur,hauteur,new ArrayList<Dessinable>(0));
	}

	public Visualisateur() {
		this(640,480);
	}

	/* Impl�mentation de l'interface Champ */

	public int getHauteur() {
		return hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public List<? extends Positionnable> getPositionnables() {
		return dessinables;
	}

	public void paint(Graphics gr) {
		Graphics2D g = (Graphics2D) gr;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setStroke(new BasicStroke(3f));
		super.paint(g);
		for(Dessinable d : dessinables)
			d.seDessine(g);
	}

	public void setDessinables(List<? extends Dessinable> dessinables) {
		this.dessinables = dessinables;
	}

}
