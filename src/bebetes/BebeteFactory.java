package bebetes;

import bebetes.Bebete;
import bebetes.ChampDeBebetes;

public abstract interface BebeteFactory {

	public abstract Bebete getBebete();

	public abstract void setChampDeBebetes(ChampDeBebetes param);
}
