package ca.qc.bdeb.sim202.videotheque;

public enum OptionsMenu {

    CONSULTER("Consulter la liste de films"),
    AJOUTER("Ajouter un film"),
    SUPPRIMER("Supprimer un film"),
    SAUVEGARDER("Sauvegarder la liste de films"),
    CHARGER("Charger un fichier de films"),
    QUITTER("Quitter");

    private String affichage;

    OptionsMenu(String affichage) {
        this.affichage = affichage;
    }

    @Override
    public String toString() {
        return (ordinal() + 1) + "-" + affichage;
    }
}
