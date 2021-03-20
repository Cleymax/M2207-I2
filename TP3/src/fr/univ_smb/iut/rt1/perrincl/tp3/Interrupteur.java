package fr.univ_smb.iut.rt1.perrincl.tp3;

import fr.univ_smb.iut.rt1.perrincl.tp3.ampoules.Ampoule;

import java.util.ArrayList;

public class Interrupteur {

	private String couleur, position = "basse";

	// TP2 3.1
	private ArrayList<Ampoule> ampoules = new ArrayList<Ampoule>();

	// TP2 3.2
	public ArrayList<Ampoule> getAmpoules() {
		return ampoules;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	// 1.3
	public void modifierPosition() {
		if ( this.getPosition() == "basse" ) // ou this.getPosition().equals("basse")
			this.setPosition("haute");
		else if ( this.getPosition() == "haute" ) // ou this.getPosition().equals("haute")
			this.setPosition("basse");
		// On s'occupe d'agir sur l'ampoule en modifiant son etat que s'il est relie a
		// une ampoule !
		// TP 2 - 1.3

// TP2 3.3 lignes a mettre en commentaire
/*		if ( this.getAmpoule() != null)
			this.getAmpoule().modifierEtat();
		if ( this.getAmpoule2() != null)
			this.getAmpoule2().modifierEtat();
*/
		for (Ampoule amp : this.getAmpoules() )
			amp.modifierEtat();
	}

	public void afficherPosition() {
		System.out.print("L'interrupteur est en position " + this.getPosition() + "\n");
	}

	// TP2 3.4
/*	public void ajouterAmpoule(Ampoule a) {
		// On ajoute la reference de l'objet ampoule dans la collection
		this.getAmpoules().add(a);
	}
*/
	// TP2 3.5
	public int nbAmpoules() {
		return this.getAmpoules().size();
	}

	// TP2 3.7

	// Nous utiliserons cet ecriture du "for":
	public void afficherAmpoules() {
		System.out.print("Voici les ampoules reliees a l'interrupeur: \n");
		System.out.print("--------------------------------------------\n");
		for (Ampoule amp : this.getAmpoules())
			amp.afficher();
	}

	// TP2 3.8
	public void ajouterAmpoule(Ampoule a) {
		// On ajoute la reference de l'objet ampoule dans la collection
		// que si elle n'est pas deja reliee
		if (!this.getAmpoules().contains(a)) // si l'ampoule n'est pas reliee
			this.getAmpoules().add(a);
	}

	// 3.9 On devrait renommer cette methode rechercherAmpoule
	public Ampoule methodeToto(int puis) {
		Ampoule trouve = null;
		int i = 0;
		while (trouve == null && i < this.getAmpoules().size()) {
			trouve = this.getAmpoules().get(i);
			if (trouve.getPuissance() != puis)
				 trouve = null;
			i++;
		}
		return trouve;
	}

	public void recyclageDesAmpoules() {
		//TP3 6.3
		for (Ampoule ampoule : this.getAmpoules()) {
			ampoule.recycler();
		}
	}
}
