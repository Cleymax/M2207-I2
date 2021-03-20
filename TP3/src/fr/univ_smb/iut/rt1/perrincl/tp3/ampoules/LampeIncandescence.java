package fr.univ_smb.iut.rt1.perrincl.tp3.ampoules;

/**
 * @author Clément P. (Cleymax)
 */
public class LampeIncandescence extends Ampoule {

    public LampeIncandescence() {

    }

    public LampeIncandescence(Etat etat) {
        super(etat);
    }

    @Override
    public void recycler() {
        System.out.println("L'ampoule Incendescence est recyclee.");
    }
}
