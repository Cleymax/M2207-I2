package fr.univ_smb.iut.rt.perrincl.tp2;

/**
 * @author Clément P. (Cleymax)
 */
public class SystemVaEtVient {

    public static void main(String[] args) {
        //TP2 2.*
        Ampoule ampoule = new Ampoule(Ampoule.Etat.ETEINTE);
        Interrupteur i1 = new Interrupteur();
//        i1.setAmpoule(ampoule);

        Interrupteur i2 = new Interrupteur();
//        i2.setAmpoule(ampoule);
        i1.afficherPosition();
        i2.afficherPosition();
//        i1.getAmpoule().afficherEtat();
//        i2.getAmpoule().afficherEtat();
        i1.changerPosition();
        i1.afficherPosition();
        i2.afficherPosition();
//        i1.getAmpoule().afficherEtat();
//        i2.getAmpoule().afficherEtat();
    }
}
