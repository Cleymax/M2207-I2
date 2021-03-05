package fr.univ_smb.iut.rt.perrincl.tp1;

/**
 * @author Clément P. (Cleymax)
 */
public class Ampoule {

    //2.1
    private String taille;
    //3.7    private String etat = "eteinte";
    //7.2
    private Etat etat;
    private int puissance;

    //3.6
    public Ampoule(/*7.2*/Etat etat) {
        this.etat = etat;
    }

    //3.3
    public void modifierEtat() {
        /*5.1
        if (!this.getEtat().equals("cassee")) {
            if (this.getEtat().equals("eteinte"))
                this.setEtat("allumee");
            else if (this.getEtat().equals("allumee"))
                this.setEtat("eteinte");
        }*/
        //7.2
        if (this.getEtat() != Etat.CASSEE) {
            if (this.getEtat() == Etat.ETEINTE)
                this.setEtat(Etat.ALLUMEE);
            else if (this.getEtat() == Etat.ALLUMEE)
                this.setEtat(Etat.ETEINTE);
        }
    }

    //3.4
    public void afficherEtat() {
        System.out.println("L'ampoule est " + this.getEtat());
    }

    public String getTaille() {
        return this.taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public Etat getEtat() {
        return this.etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public int getPuissance() {
        return this.puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }


    //3.10
    public void afficher() {
        System.out.println(this);
    }

    //7.2
    public static enum Etat {
        ETEINTE,
        ALLUMEE,
        CASSEE
    }

    //8.1
    public boolean equals(Object o) {
        if (this == o) return true;

        Ampoule ampoule = (Ampoule) o;
        if (puissance != ampoule.puissance) return false;
        return taille.equals(ampoule.getTaille());
    }

    //3.9
    public String toString() {
        String chaine; // La chaine de caracteres qui sera retournee
        chaine = "L'ampoule de taille " + this.getTaille()
                + " et de puissance " + this.getPuissance()
                + "W est " + this.getEtat() + ". ";
        return chaine;
    }
}
