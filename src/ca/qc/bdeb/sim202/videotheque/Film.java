package ca.qc.bdeb.sim202.videotheque;

import java.awt.image.FilteredImageSource;

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

    public static Film deSerialiser(String ligne){
        String[]champs = ligne.split(", ");
        Film nouveauFilm = null;
        if (champs.length == 3){
            try {
                nouveauFilm = new Film(champs[0], Integer.parseInt(champs[1]),champs[2]);
            }catch (NumberFormatException e){
                System.err.println("Erreur de conversion de la date : " + champs[1]);
            }
        }
        return nouveauFilm;
    }
}
