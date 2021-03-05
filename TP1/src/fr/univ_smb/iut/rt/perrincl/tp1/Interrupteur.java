package fr.univ_smb.iut.rt.perrincl.tp1;

/**
 * @author Clément P. (Cleymax)
 */
public class Interrupteur {

    //4.1
    private String couleur;
    //4.4
    private String position = "basse";
    //6.1
    private Ampoule ampoule;

    //4.1
    public void changerPosition() {
        if (this.getPosition().equals("basse"))
            this.setPosition("haute");
        else if (this.getPosition().equals("haute"))
            this.setPosition("basse");
        //6.4
        if (this.getAmpoule() != null) {
            this.getAmpoule().modifierEtat();
        }
    }

    public void afficherPosition() {
        System.out.println("L'interrupteur est en position " + this.getPosition());
    }

    //6.1
    public Ampoule getAmpoule() {
        return this.ampoule;
    }

    //6.1
    public void setAmpoule(Ampoule ampoule) {
        this.ampoule = ampoule;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //8.1
    public boolean equals(Object o) {
        if (this == o) return true;

        Interrupteur that = (Interrupteur) o;
        if (!couleur.equals(that.couleur)) return false;
        if (!position.equals(that.position)) return false;
        return ampoule.equals(that.ampoule);
    }

    //Extras
    public String toString() {
        return "Interrupteur{" +
                "couleur='" + couleur + '\'' +
                ", position='" + position + '\'' +
                ", ampoule=" + ampoule +
                '}';
    }
}
