package fr.univ_smb.iut.rt.perrincl.tp1;

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
        interrupteur.setAmpoule(uneAmpoule);
        //6.2
        System.out.println(interrupteur.getAmpoule().getEtat());
        //6.3
        //interrupteur.getAmpoule().setEtat("eteinte");
        interrupteur.getAmpoule().setEtat(Ampoule.Etat.ETEINTE);
        interrupteur.getAmpoule().afficherEtat();
    }
}
