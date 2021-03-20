package fr.univ_smb.iut.rt1.perrincl.tp3.ampoules;

/**
 * @author Clément P. (Cleymax)
 */
public class LampeNeon extends Ampoule {

    private int longeur;

    public LampeNeon(Etat etat, int longeur) {
        super(etat);
        this.longeur = longeur;
    }

    public int getLongeur() {
        return this.longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    @Override
    public void recycler() {
        System.out.println("L'ampoule Neon est recyclee.");
    }

    @Override
    public String toString() {
        return super.toString() + " C'est un tube neon dont la longeur est de " + this.getLongeur() + " cm.";
    }
}
