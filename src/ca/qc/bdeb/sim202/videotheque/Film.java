package ca.qc.bdeb.sim202.videotheque;

public class Film {
    public static final int ANNEE_MIN = 1900;
    private String titre;
    private int annee;
    private String realisateur;

    public Film() {
        titre = "sans titre";
        annee = ANNEE_MIN;
        realisateur = "John Doe";
    }

    public Film(String titre, int annee, String realisateur) {
        this.titre = titre;
        if (annee >= ANNEE_MIN) {
            this.annee = annee;
        } else {
            this.annee = ANNEE_MIN;
        }
        this.realisateur = realisateur;
    }

    @Override
    public String toString() {
        return "titre='" + titre + '\'' +
                ", annee=" + annee +
                ", realisateur='" + realisateur + '\'';
    }
}
