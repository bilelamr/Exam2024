package poo;

import java.util.Date;
public class Main {
    public static void main(String[] args) {

        Etudiant etudiant = new Etudiant("Amriche", "Bilel", 1, new Date(), "Licence");
        etudiant.montrerDetails();

        Cours cours = new Cours("Programmation Java", "M. Fleury", 3, 5);
        cours.montrerDetails();

        cours.participer();
        cours.quitter();

        Enseignant enseignant = new Enseignant("Florella", "Vincent", 2, "Cybersécurité", 2500);
        enseignant.montrerDetails();
    }
}