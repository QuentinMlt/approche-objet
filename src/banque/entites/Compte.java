package banque.entites;

import java.util.Enumeration;

public class Compte {
    private static int ct = 0;
    private int nbCompte;
    private double soldeCompte;


    public Compte(String solde) {
        this.nbCompte = ct++;
        this.soldeCompte = soldeCompte;
    }

    public int getNbCompte() {
        return nbCompte;
    }
}
