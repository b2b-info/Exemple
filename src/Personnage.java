public class Personnage {
    //Un personnage a un nom, une passion et un nombre de points de vie.

    private String nom = "John Doe";
    private String passion;
    private int nbVies = 1;

    private Pistolet pistolet = new Pistolet(6, 6, 25, false);

    public Personnage(String nom, String passion, int nbVies, Pistolet pistolet) {

        if (nom != null && !nom.isEmpty()) {
            this.nom = nom;
        }
        this.passion = passion;
        if (nbVies > 0) {
            this.nbVies = nbVies;
        }
        if (pistolet != null) {
            this.pistolet = pistolet;
        }

    }

    @Override
    public String toString() {

        String presentation = "";
        if (estVivant()) {
            presentation = "Bonjour, je m'appelle " + nom +
                    " et il me reste " + nbVies + " vies!";
        }
        return presentation;
    }

    public void attaquer(Personnage ennemi) {
        if (estVivant()) {
            // 1. Dire "Hasta la vista, baby!"
            System.out.println("Hasta la vista, baby!");
            // 2. Utiliser son pistolet pour tirer une balle
            pistolet.tirer();
            // 3. Faire diminuer le nombre de points de vie de l'ennemi de 1 point
            ennemi.toucher();
        }
    }

    public boolean estVivant() {
        return nbVies > 0;
    }

    public void toucher() {
        if (estVivant()) {
            nbVies--;
        } else {
            System.out.println(nom + " est déjà mort!!");
        }
    }
}
