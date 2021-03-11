package fr.univ_smb.iut.rt.perrincl.tp2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Clément P. (Cleymax)
 */
public class Interrupteur {

    //4.1
    private String couleur;
    //4.4
    private String position = "basse";
    //6.1
//    private Ampoule ampoule;
    //TP2 1.1
//    private Ampoule ampoule2;
    //TP2 3.1
    private List<Ampoule> ampoules = new ArrayList<>();

    //4.1
    public void changerPosition() {
        if (this.getPosition().equals("basse"))
            this.setPosition("haute");
        else if (this.getPosition().equals("haute"))
            this.setPosition("basse");
        //6.4
//        if (this.getAmpoule() != null) {
//            this.getAmpoule().modifierEtat();
//        }
//        //TP2 1.3
//        if (this.getAmpoule2() != null) {
//            this.getAmpoule2().modifierEtat();
//            ;
//        }
        //TP2 3.8
        for (Ampoule ampoule : this.getAmpoules()) {
            ampoule.modifierEtat();
        }
    }

    public void afficherPosition() {
        System.out.println("L'interrupteur est en position " + this.getPosition());
    }

    //6.1
//    public Ampoule getAmpoule() {
//        return this.ampoule;
//    }

    //6.1
//    public void setAmpoule(Ampoule ampoule) {
//        //TP2 1.4
//        if (this.getAmpoule2() != ampoule)
//            this.ampoule = ampoule;
//    }

    //TP2 3.10
    public Ampoule getAmpouleAvecPuissance(int puis) {
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

    //TP2 3.11
    public void enleverAmpoules(int p) {
        Iterator<Ampoule> iter = this.getAmpoules().iterator();
        while (iter.hasNext()) {
            Ampoule amp = iter.next();
            if (amp.getPuissance() == p)
                iter.remove();
        }
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

    //TP2 1.1
//    public Ampoule getAmpoule2() {
//        return this.ampoule2;
//    }

//    public void setAmpoule2(Ampoule ampoule2) {
//        //TP2 1.4
//        if (this.getAmpoule() != ampoule2)
//            this.ampoule2 = ampoule2;
//    }

    //TP2 3.2
    public List<Ampoule> getAmpoules() {
        return this.ampoules;
    }

    //TP2 3.4
    public void addAmpoule(Ampoule ampoule) {
        this.getAmpoules().add(ampoule);
    }

    public void removeAmpoule(Ampoule ampoule) {
        this.getAmpoules().remove(ampoule);
    }

    //TP2 3.5
    public int nbAmpoules() {
        return this.getAmpoules().size();
    }

    //TP2 3.7
    public void afficherAmpoules() {
        System.out.println("Carractéristiques des ampoules (" + nbAmpoules() + "): ");
        for (Ampoule ampoule : getAmpoules()) {
            ampoule.afficher();
        }
    }

    //8.1
//    public boolean equals(Object o) {
//        if (this == o) return true;
//
//        Interrupteur that = (Interrupteur) o;
//        if (!couleur.equals(that.couleur)) return false;
//        if (!position.equals(that.position)) return false;
////        return ampoule.equals(that.ampoule);
//    }

//    //Extras
//    public String toString() {
//        return "Interrupteur{" +
//                "couleur='" + couleur + '\'' +
//                ", position='" + position + '\'' +
//                ", ampoule=" + ampoule +
//                '}';
//    }
}
