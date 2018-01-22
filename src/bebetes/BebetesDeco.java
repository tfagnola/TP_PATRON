package bebetes;

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

}
