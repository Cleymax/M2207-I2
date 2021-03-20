package fr.univ_smb.iut.rt1.perrincl.tp3.ampoules;

// 2
public abstract class Ampoule {

	// Declaration de l'attribut taille (c'est une propriete d'une ampoule)
	private String taille;

	// 7.2
	private Etat etat;

	//7.2 private String etat;
	// 3.7
	// private String etat = "eteinte";
	private int puissance;

	public Ampoule() {
		this.setEtat(Etat.ETEINTE);
	}

	public Ampoule(Etat etat) {
		this.etat = etat;
	}

	// 7.2
	public static enum Etat {ETEINTE, ALLUMEE, CASSEE};

	// 7.2 On modifie le type
	public Etat getEtat() {
		return this.etat;
	}

	// 7.2 On modifie le type
	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public int getPuissance() {
		return this.puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public String getTaille() {
		return this.taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	public void modifierEtat() {
		if (this.getEtat() != Etat.CASSEE ) {  // on verifie que l'ampoule ne soit pas CASSEE
			if ( this.getEtat() == Etat.ETEINTE )
				this.setEtat(Etat.ALLUMEE);
			else if ( this.getEtat() == Etat.ALLUMEE )
				this.setEtat(Etat.ETEINTE);
		}
	}

	public void afficherEtat() {
		System.out.print("L'ampoule est " + this.getEtat() + "\n");
	}

	public abstract void recycler();

	public String toString() {
		String chaine; // La chaine de caracteres qui sera retournee
		chaine = "L'ampoule de taille " + this.getTaille()
			+ " et de puissance " + this.getPuissance()
			+ "W est " + this.getEtat() + ". ";
		return chaine;
	}

	public void afficher() {
		System.out.print(this.toString() + "\n");
	}
}
