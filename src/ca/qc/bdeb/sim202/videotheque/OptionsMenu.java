package ca.qc.bdeb.sim202.videotheque;

public enum OptionsMenu {

    CONSULTER("Consulter la liste de films"),
    AJOUTER("Ajouter un film"),
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
