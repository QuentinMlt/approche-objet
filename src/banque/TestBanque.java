package banque;

import banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte("435");
        Compte compte2 = new Compte("436");
        System.out.println(compte1.getNbCompte());
        System.out.println(compte2.getNbCompte());
    }
}
