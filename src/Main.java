import ca.qc.bdeb.sim202.videotheque.Film;
import ca.qc.bdeb.sim202.videotheque.OptionsMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static final int MAX_FILMS = 10;

    public static void main(String[] args) {
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

//        exercicePistolet();
//        exercicesClasses();
        videotheque();
    }

    private static void videotheque() {
        OptionsMenu choix = OptionsMenu.CONSULTER;

        Film[] films = new Film[MAX_FILMS];

        Scanner saisie = new Scanner(System.in);
        int indiceFilm = 0;

        boolean choixValide = false;
        while (choix != OptionsMenu.QUITTER) {
            while (!choixValide) {
                afficherMenu();

                try {
                    int choixUtilisateur = saisie.nextInt();
                    if (choixUtilisateur > 0 && choixUtilisateur <= OptionsMenu.values().length) {
                        choixValide = true;
                        choix = OptionsMenu.values()[choixUtilisateur - 1];
                    }
                } catch (InputMismatchException e) {
                    System.err.println("Erreur de saisie " + e.getMessage());
                }
                saisie.nextLine();
            }
            choixValide = false;
            switch (choix) {
                case AJOUTER -> {
                    if (indiceFilm < films.length) {
                        Film nouveauFilm = creerFilm(saisie);
                        if (nouveauFilm != null) {
                            films[indiceFilm++] = nouveauFilm;
                        }
                    }
                }

                case CONSULTER -> {
                    afficherListe(films);
                }
            }
        }
    }

    private static void afficherListe(Film[] films) {
        for (int i = 0; i < films.length; i++) {
            if (films[i] != null) {
                System.out.println((i + 1) + " " + films[i]);
            }
        }
    }

    private static Film creerFilm(Scanner saisie) {
        System.out.print("Saisir le titre du film : ");
        String titre = saisie.nextLine();
        int annee = 0;
        try {
            System.out.print("Saisir l'année du film : ");
            annee = saisie.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Erreur de saisie");
        }
        saisie.nextLine();
        System.out.print("saisir le nom du réalisateur : ");
        String nom = saisie.nextLine();
        if (!titre.isEmpty() && annee > Film.ANNEE_MIN && !nom.isEmpty()) {
            return new Film(titre, annee, nom);
        } else {
            System.err.println("Saisie incomplète! ");
            return null;
        }
    }

    private static void afficherMenu() {

        for (OptionsMenu option : OptionsMenu.values()) {
            System.out.println(option);
        }
        System.out.print("Votre choix: ");

    }

    private static void exercicesClasses() {
        //        System.out.printf("Hello and welcome!");
//
//
//        Etudiant jimmy = new Etudiant("Jimmy", 123456789);
//
//        Etudiant laura = new Etudiant("Laura", 987654321);
//
//        jimmy.modifierMoyenne(15);
//        laura.modifierMoyenne(200);
//
//        System.out.println("L'étudiant " + jimmy.getNom() + " a le numéro de DA: " + jimmy.getNumeroDA());
//        System.out.println("L'étudiant " + laura.getNom() + " a le numéro de DA: " + laura.getNumeroDA());

//        CubeProcedural.faireExercice();
//
//        Cube c1 = new Cube(2, 2, 2, "rouge");
//        Cube c2 = new Cube(-2, 0, -50, "");
//
//        System.out.println("Les cubes sont identiques : " + c1.comparer(c2));
//
//        System.out.println(c1);
//        System.out.println(c2.toString());
    }

    private static void exercicePistolet() {
        Pistolet colt = new Pistolet(6, 6, 50, false);
        Pistolet beretta = new Pistolet(12, 12, 45, true);

//        while (!colt.estDecharge()) {
//            colt.tirer();
//        }
//        while (!beretta.estDecharge()) {
//            beretta.tirer();
//        }
//
//        colt.recharger();
//        beretta.recharger();

        Personnage james = new Personnage("James Bond", "Les voitures", 9, beretta);
        Personnage clint = new Personnage("Clint Eastwood", "les chapeaux", 5, colt);

        System.out.println(james);
        System.out.println(clint);

        while (james.estVivant() && clint.estVivant()) {
            james.attaquer(clint);
            clint.attaquer(james);
        }

        System.out.println(james);
        System.out.println(clint);
    }
}