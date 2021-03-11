package fr.univ_smb.iut.rt.perrincl.tp2;

/**
 * @author Clément P. (Cleymax)
 */
public class SystemeEclairageSimple {

    public static void main(String[] args) {
        //3.1
        Ampoule uneAmpoule = new Ampoule(Ampoule.Etat.ALLUMEE);
        uneAmpoule.setEtat(Ampoule.Etat.ETEINTE);
        uneAmpoule.modifierEtat();
        uneAmpoule.setPuissance(50);
        uneAmpoule.setTaille("grande");
        uneAmpoule.afficherEtat();
        uneAmpoule.afficher();
        uneAmpoule.setEtat(Ampoule.Etat.CASSEE);
        uneAmpoule.modifierEtat();
        uneAmpoule.afficherEtat();

        //3.8
        Ampoule deuxiemeAmpoule = new Ampoule(/* 3.8"allumee"*/ Ampoule.Etat.ALLUMEE);
        //3.8 deuxiemeAmpoule.setEtat("eteinte");
        //7.2
        deuxiemeAmpoule.setEtat(Ampoule.Etat.ETEINTE);
        deuxiemeAmpoule.afficherEtat();
        deuxiemeAmpoule.afficher();

        //4.3
        Interrupteur interrupteur = new Interrupteur();
        interrupteur.setCouleur("bleu");
        interrupteur.setPosition("basse");
        interrupteur.afficherPosition();
        interrupteur.changerPosition();
        interrupteur.afficherPosition();
//        interrupteur.setAmpoule(uneAmpoule);
        //6.2
//        System.out.println(interrupteur.getAmpoule().getEtat());
        //6.3
        //interrupteur.getAmpoule().setEtat("eteinte");
//        interrupteur.getAmpoule().setEtat(Ampoule.Etat.ETEINTE);
//        interrupteur.getAmpoule().afficherEtat();
        //TP2
//        interrupteur.setAmpoule2(deuxiemeAmpoule);
//        System.out.println("Ampoule1: " + interrupteur.getAmpoule().getEtat() + " 2eme ampoule: " + interrupteur.getAmpoule2().getEtat());
        //1.3
        interrupteur.changerPosition();
//        System.out.println("Ampoule1: " + interrupteur.getAmpoule().getEtat() + " 2eme ampoule: " + interrupteur.getAmpoule2().getEtat());
//        interrupteur.getAmpoule().setEtat(Ampoule.Etat.CASSEE);
//        System.out.println("Ampoule1: " + interrupteur.getAmpoule().getEtat() + " 2eme ampoule: " + interrupteur.getAmpoule2().getEtat());

        //TP2 3.6
        interrupteur.addAmpoule(uneAmpoule);
        interrupteur.addAmpoule(deuxiemeAmpoule);
        System.out.println(interrupteur.nbAmpoules());

        //TP2 3.7
        interrupteur.afficherAmpoules();

        //TP2 3.8
        interrupteur.changerPosition();
        interrupteur.afficherAmpoules();

        //TP2 3.9
        // Oui possible.
        // Hashset
        // contains check avec le fonction Object#equals

        //TP2 3.10
        interrupteur.getAmpouleAvecPuissance(50).afficher();
    }
}
