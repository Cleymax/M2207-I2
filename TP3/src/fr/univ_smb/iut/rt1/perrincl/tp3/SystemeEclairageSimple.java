package fr.univ_smb.iut.rt1.perrincl.tp3;

import fr.univ_smb.iut.rt1.perrincl.tp3.ampoules.Ampoule;
import fr.univ_smb.iut.rt1.perrincl.tp3.ampoules.LampeIncandescence;
import fr.univ_smb.iut.rt1.perrincl.tp3.ampoules.LampeLED;
import fr.univ_smb.iut.rt1.perrincl.tp3.ampoules.LampeNeon;

public class SystemeEclairageSimple {

	public static void main(String[] args) {
		LampeLED amp1 = new LampeLED(Ampoule.Etat.CASSEE,23);
		amp1.setEtat(Ampoule.Etat.ETEINTE);
		amp1.setTaille("moyenne");
		amp1.setPuissance(25);
		amp1.modifierEtat();
		amp1.afficherEtat();
		LampeNeon amp2 = new LampeNeon(Ampoule.Etat.ALLUMEE,200);
		amp2.afficherEtat();
		amp2.modifierEtat();
		amp2.afficherEtat();
		Interrupteur inter1 = new Interrupteur();
		inter1.setPosition("basse");
		inter1.afficherPosition();
		inter1.modifierPosition();
		inter1.afficherPosition();
		amp1.setEtat(Ampoule.Etat.CASSEE);
		amp1.afficher();
		amp1.modifierEtat();
		amp1.afficher();
		inter1.modifierPosition();
		amp2.afficherEtat();
		inter1.modifierPosition();
		amp2.afficherEtat();
		// TP2 3.6
		inter1.ajouterAmpoule(amp2);
		inter1.ajouterAmpoule(amp1);
		System.out.print("Nb d'ampoules reliees a l'interrupteur: " + inter1.nbAmpoules() + "\n");
		inter1.afficherAmpoules();
		inter1.methodeToto(25).afficher();

		LampeNeon neon = new LampeNeon(Ampoule.Etat.ETEINTE, 12);
		neon.afficher();
		neon.setPuissance(50);
		neon.setLongeur(10);
		neon.afficherEtat();

		LampeLED led = new LampeLED(Ampoule.Etat.ETEINTE, 15);
		led.setNbHeures(22);
		led.setEtat(Ampoule.Etat.ALLUMEE);
		led.afficher();

		LampeIncandescence li = new LampeIncandescence();
		li.afficher();

		inter1.ajouterAmpoule(led);
		inter1.ajouterAmpoule(neon);

		inter1.afficherAmpoules();
		inter1.modifierPosition();
		inter1.afficherAmpoules();
		inter1.recyclageDesAmpoules();


	}

}
