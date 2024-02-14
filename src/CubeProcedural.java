public class CubeProcedural {

    public static void faireExercice(){
        int largeurC1= 2, hauteurC1 = 2, profondeurC1 = 2;
        int largeurC2= 2, hauteurC2 = 2, profondeurC2 = 2;
        String couleurC1 = "jaune", couleurC2="rouge";

        afficherCube(largeurC1, hauteurC1, profondeurC1, couleurC1);

        afficherCube(largeurC2, hauteurC2, profondeurC2, couleurC2);

        System.out.println("Les cubes sont identiques : " + comparerCube(largeurC1, hauteurC1, profondeurC1, couleurC1,
                largeurC2, hauteurC2, profondeurC2, couleurC2));

    }

    private static boolean comparerCube(int largeurC1, int hauteurC1, int profondeurC1, String couleurC1, int largeurC2, int hauteurC2, int profondeurC2, String couleurC2) {

        return largeurC1 == largeurC2 &&
                hauteurC1 == hauteurC2 &&
                profondeurC1 == profondeurC2 &&
                couleurC1.equals(couleurC2);

    }

    private static void afficherCube(int largeur, int hauteur, int profondeur, String couleur) {
        System.out.printf("Je suis un cube de couleur %s d'une largeur de %d," +
                        "d'une hauteur de %d et d'une profondeur de %d \n", couleur,
                largeur, hauteur, profondeur);
    }
}
