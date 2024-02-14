public class Cube {
    private int largeur = 1;
    private int hauteur = 1;
    private int profondeur = 1;

    private String couleur = "transparent";

    public Cube(int largeur, int hauteur, int profondeur, String couleur) {
        if (largeur > 0) {
            this.largeur = largeur;
        }
        if (hauteur > 0) {
            this.hauteur = hauteur;
        }
        if (profondeur > 0) {
            this.profondeur = profondeur;
        }
        if (couleur != null && !couleur.isEmpty()) {
            this.couleur = couleur;
        }
    }

    public boolean comparer(Cube autreCube) {
        return largeur == autreCube.largeur &&
                this.hauteur == autreCube.hauteur &&
                profondeur == autreCube.profondeur &&
                couleur.equals(autreCube.couleur);
    }

    @Override
    public String toString() {
        return "Je suis un cube de couleur " + couleur +
                ", d'une largeur de " + largeur +
                ", d'une hauteur de " + hauteur +
                " et d'une profondeur de " + profondeur +
                '.';
    }
}
