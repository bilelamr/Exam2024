package poo;

public abstract class Individu {

    private String nom;
    private String prenom;
    private int identifiant;

    // Constructeur
    public Individu(String nom, String prenom, int identifiant) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
    }

// Getters
public String getNom() {
    return nom;
}

public String getPrenom() {
    return prenom;
}

public int getIdentifiant() {
    return identifiant;
}

// Setters
public void setNom(String nom) {
    this.nom = nom;
}

public void setPrenom(String prenom) {
    this.prenom = prenom;
}

public void setIdentifiant(int identifiant) {
    this.identifiant = identifiant;
}

    // Méthode abstraite
    public abstract void montrerDetails();

}