package entites;

import java.util.Locale;

public class Personne {
    private String nom;
    private String prenom;
    private String adresseP;

    public Personne(String nom, String prenom, String adresseP) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresseP = adresseP;
    }

    public String getNom() {
        return nom.toUpperCase();
    }

    public String getPrenom() {
        return prenom;
    }
}

