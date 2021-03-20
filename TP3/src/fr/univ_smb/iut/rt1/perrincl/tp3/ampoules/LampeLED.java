package fr.univ_smb.iut.rt1.perrincl.tp3.ampoules;

/**
 * @author Clément P. (Cleymax)
 */
public class LampeLED extends Ampoule {

    private int nbHeures;

    public LampeLED(Etat etat, int nbHeures) {
        super(etat);
        this.nbHeures = nbHeures;
    }

    public int getNbHeures() {
        return this.nbHeures;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }

    @Override
    public void recycler() {
        System.out.println("L'ampoule LED est recyclee.");
    }

    @Override
    public String toString() {
        return super.toString() + "C'est une ampoule LED dont le nb d'heures est estime a " + this.getNbHeures() + " heures.";
    }
}
