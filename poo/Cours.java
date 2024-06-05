package poo;

public class Cours implements Participable {
    private String titre;
    private String formateur;
    private int duree; // en heures
    private int placesRestantes;

    public Cours(String titre, String formateur, int duree, int placesRestantes) {
        this.titre = titre;
        this.formateur = formateur;
        this.duree = duree;
        this.placesRestantes = placesRestantes;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getFormateur() {
        return formateur;
    }

    public void setFormateur(String formateur) {
        this.formateur = formateur;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getPlacesRestantes() {
        return placesRestantes;
    }

    public void setPlacesRestantes(int placesRestantes) {
        this.placesRestantes = placesRestantes;
    }

    public void montrerDetails() {
        System.out.println("\n// --- Détails du cours : \n");

        System.out.println("Titre : " + getTitre());
        System.out.println("Formateur : " + getFormateur());
        System.out.println("Durée en heures : " + getDuree());
    }

    @Override
    public void participer() {
        if (placesRestantes > 0) {
            placesRestantes--;
            System.out.println("\nParticipation confirmée. Places restantes: " + placesRestantes);
        } else {
            System.out.println("\nIl n'y a plus de places disponibles.");
        }
    }

    @Override
    public void quitter() {
        placesRestantes++;
        System.out.println("\nVous avez quitté le cours. Places restantes: " + placesRestantes);
    }
}