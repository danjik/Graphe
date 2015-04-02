
public class Arete {
	private Noeud noeudFin;
	private Noeud noeudDebut;
	
	public Arete(Noeud noeudDebut,Noeud noeudFin){
		this.noeudDebut = noeudDebut;
		this.noeudFin = noeudFin;
		
		noeudDebut.addArete(this);
		noeudFin.addArete(this);
	}
	
	/**
	 * @return the noeudDebut
	 */
	public Noeud getNoeudDebut() {
		return noeudDebut;
	}
	/**
	 * @param noeudDebut the noeudDebut to set
	 */
	public void setNoeudDebut(Noeud noeudDebut) {
		this.noeudDebut = noeudDebut;
	}
	
	/**
	 * @return the noeudFin
	 */
	public Noeud getNoeudFin() {
		return noeudFin;
	}
	/**
	 * @param noeudFin the noeudFin to set
	 */
	public void setNoeudFin(Noeud noeudFin) {
		this.noeudFin = noeudFin;
	}
	
	
}
